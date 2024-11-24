<template>
  <div class="bg-blue-50 flex justify-center">
    <div class="w-96 border border-gray-300 bg-blue-100 shadow-xl my-20 rounded-xl">
      <p class="text-center mt-7 text-3xl text-gray-500 font-medium">Sign Up</p>

      <div class="border-b-2 border-gray-300 m-6"></div>

      <form @submit.prevent="handleRegister" class="space-y-4 m-6">
        <div class="flex">
          <label class="bg-blue-600 px-4 py-2 rounded-l-md border-1 border-blue-600">
            <emailico class="w-5 inline-block text-white pb-1"/>
          </label>

          <input v-model="account.username" type="text" placeholder="Username" class="border-2 py-1 px-2 text-lg rounded-r-md w-full">
        </div>
        

        <div class="flex">
          <label class="bg-blue-600 px-4 py-2 rounded-l-md border-1 border-blue-600">
            <userico class="w-5 inline-block text-white pb-1"/>
          </label>

          <input v-model="account.fullName" type="text" placeholder="Name" class="border-2 py-1 px-2 text-lg rounded-r-md w-full">
        </div>

        <div class="flex">
          <label class="bg-blue-600 px-4 py-2 rounded-l-md border-1 border-blue-600">
            <lockico class="w-5 inline-block text-white pb-1"/>
          </label>

          <input v-model="account.password" type="password" placeholder="Password" class="border-2 py-1 px-2 text-lg rounded-r-md w-full">
        </div>

        <div class="border-b-2 border-gray-300"></div>

        <div v-if="!authStore.isRegistered" class="text-center text-red-500 font-bold bg-white py-2 rounded-lg">Couldn't register. Try again!</div>

        <div>
          <button type="submit" class=" text-white block w-full rounded-md py-2 font-bold bg-blue-600 hover:bg-blue-500 mt-10">Submit</button>
        </div>
             
        
      </form>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue';
import { useAuthStore } from '@/stores/authStore';
import emailico from '@/components/icons/emailico.vue';
import userico from '@/components/icons/userico.vue';
import lockico from '@/components/icons/lockico.vue';

const authStore = useAuthStore();

const account = ref({
  fullName: '',
  username: '',
  password: ''
})

function handleRegister() {
  authStore.register(account.value);
}
</script>