import { ref, computed } from 'vue'
import { defineStore } from 'pinia'
import { useAuthStore } from './authStore'
import axios from 'axios'

export const useTodoStore = defineStore('todoStore', () => {
  const todos = ref([])
  const isTodosFetched = ref(false)

  const todo = ref({})

  const isLoading = ref(false)
  const error = ref(null)

  const authStore = useAuthStore();

  const fetchTodos = async () => {
    isLoading.value = true;

    try {
      const response = await axios.get('http://localhost:8080/api/todos/', {
        headers: {
          'Authorization': `Bearer ${authStore.jwtToken}`
        }
      });
      todos.value = response.data;
      isTodosFetched.value = true
      isLoading.value = false
    } catch (error) {
      console.error('Error fetching todos:', error);
      isTodosFetched.value = false
      isLoading.value = false
    }
  };

  const createTodo = async (newTodo) => {
    try {
      const response = await axios.post('http://localhost:8080/api/todos/', newTodo, {
        headers: {
          'Authorization': `Bearer ${authStore.jwtToken}`
        }
      });

      if(response.status === 200){
        todo.value = response.data;
        todos.value.unshift(todo.value)
      }
      
    } catch (error) {
      console.error('Error fetching todos:', error);
    }
  };

  const updateTodo = async (modifiedTodo) => {
    try {
      const response = await axios.put('http://localhost:8080/api/todos/', modifiedTodo, {
        headers: {
          'Authorization': `Bearer ${authStore.jwtToken}`
        }
      });

      if(response.status === 200){
        const index = todos.value.findIndex(t => t.id === modifiedTodo.id);
        
        if(index !== -1){
          todos.value[index] = modifiedTodo          
        }
        
      }
      
    } catch (error) {
      console.error('Error fetching todos:', error);
    }
  };

  const deleteTodo = async (id) => {
    try {
      const response = await axios.delete(`http://localhost:8080/api/todos/${id}`, {
        headers: {
          'Authorization': `Bearer ${authStore.jwtToken}`
        }
      });

      if(response.status === 200){
        const index = todos.value.findIndex(t => t.id === id);
        
        if(index !== -1){
          todos.value.splice(index, 1);
        }
        
      }
      
    } catch (error) {
      console.error('Error fetching todos:', error);
    }
  };

  return {todos, isTodosFetched, todo, isLoading, error, fetchTodos, createTodo, updateTodo, deleteTodo}
})
