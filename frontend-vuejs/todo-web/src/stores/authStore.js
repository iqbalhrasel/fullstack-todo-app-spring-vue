import { ref, computed } from 'vue'
import { defineStore } from 'pinia'
import axios from 'axios'
import { useRouter } from 'vue-router'

export const useAuthStore = defineStore('authStore', () => {

  const fullName = ref(localStorage.getItem('fullName') || null)
  const jwtToken = ref(localStorage.getItem('token') || null)
  const isLoggedin = ref(localStorage.getItem('isLoggedin') ||false)

  const isRegistered = ref(true)
  
  const showLoginErrorMsg = ref(false)

  const errorMessage = ref(null)

  const router = useRouter()

  const register = async (account) => {    
    try {
      const response = await axios.post('http://localhost:8080/register', account);
  
      if(response.status === 200){
        isRegistered.value = true;
        router.push({name: 'login'})
      }
      
    } catch (error) {
      if (error.response) {
        // Handle server-side error
        errorMessage.value = error.response.data.message || 'Login failed. Please try again.';
      } else if (error.request) {
        // Handle no response from server
        errorMessage.value = 'No response from the server. Please check your network connection.';
      } else {
        // Handle other errors
        errorMessage.value = 'An error occurred: ' + error.message;
      }

      isRegistered.value = false
    }
  };

  const login = async (account) => {
    try {
      const response = await axios.post('http://localhost:8080/login', account);
  
      if(response.status === 200){
        showLoginErrorMsg.value = false
        isLoggedin.value = true

        jwtToken.value = response.data.token
        fullName.value = response.data.fullName

        localStorage.setItem('token', response.data.token)
        localStorage.setItem('fullName', response.data.fullName)
        localStorage.setItem('isLoggedin', true)

        router.push({name: 'dashboard'})
      }
      
    } catch (error) {
      if (error.response) {
        // Handle server-side error
        errorMessage.value = error.response.data.message || 'Login failed. Please try again.';
      } else if (error.request) {
        // Handle no response from server
        errorMessage.value = 'No response from the server. Please check your network connection.';
      } else {
        // Handle other errors
        errorMessage.value = 'An error occurred: ' + error.message;
      }

      isLoggedin.value = false
      showLoginErrorMsg.value = true
    }
  };

  function logout() {
    fullName.value = null
    jwtToken.value = null
    localStorage.removeItem('token')
    localStorage.removeItem('fullName')
    localStorage.removeItem('isLoggedin')

    router.push({name: 'login'})
  }

  return {fullName, jwtToken, isRegistered, isLoggedin, showLoginErrorMsg, register, login, logout}
})
