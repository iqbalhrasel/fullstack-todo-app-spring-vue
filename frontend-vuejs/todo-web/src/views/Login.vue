<template>
  <div>
    <div class="grid md:grid-cols-2">
      <div class="col-span-1">
        <div class="bg-red-100 h-[36rem] md:flex hidden items-center place-content-center md:ml-5 mx-10 md:mx-0 mt-5 shadow-lg ">
          <img src="../assets/images/flower.png" alt="" class="md:h-[25rem] h-72 object-cover">
        </div>
      </div>
      <div class="col-span-1">
        <div class="h-[36rem] md:mr-5 mx-10 md:mx-0  mt-5 shadow-lg">
          <DonevoLogo class="place-content-center pt-16"/>

          <p class="mt-16 mb-10 text-center text-2xl font-medium text-gray-500">Welcome to Donevo</p>

          <form class="lg:mx-32 mx-20" @submit.prevent="handleLogin">
            <label class="text-sm text-gray-400">Username</label>
            <input v-model="account.username" type="text" class="border-b-2 block w-full py-1 px-2 mt-1 mb-4">

            <label class="text-sm text-gray-400">Password</label>
            <input v-model="account.password" type="password" class="border-b-2 block w-full py-1 px-2 mt-1">

            <div v-if="authStore.showLoginErrorMsg" class="text-center mt-5 font-bold text-red-600 bg-red-200 py-2 rounded-lg">Bad credentials. Try login again.</div>

            <div class="text-center mt-10">
              <button type="submit" class="bg-slate-600 hover:bg-slate-500 text-white text-sm font-bold px-10 py-2 rounded-full">Sign in</button>
            </div>
            
          </form>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue';
import { useAuthStore } from '@/stores/authStore';
import DonevoLogo from '@/components/DonevoLogo.vue';

const authStore = useAuthStore();

const account = ref({
  username: '',
  password: ''
})

function handleLogin() {
  authStore.login(account.value)  
}
</script>