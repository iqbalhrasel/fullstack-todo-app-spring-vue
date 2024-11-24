<template>
  <div class="flex justify-between py-5 px-10 items-center border shadow-md sticky top-0 bg-white z-50">
    <RouterLink :to="{name: 'home'}"><DonevoLogo/></RouterLink>   

    <section class="hidden md:block">
      <NavOptions/>
    </section>

    <section>
      <RouterLink :to="{name:'login'}" class="bg-red-100 hover:bg-red-50 py-1 px-4 rounded-full font-semibold text-gray-700">Login</RouterLink>
      <RouterLink :to="{name: 'register'}" class="bg-red-100 hover:bg-red-50 py-1 px-4 rounded-full font-semibold text-gray-700 ml-1">Register</RouterLink>
      
    </section>

    <section class="md:hidden block">
      <div>
        <div @click="toggleNav">
          <burgericon class="w-7 cursor-pointer text-gray-600"/>
        </div>        

        <NavOptions v-if="showMobileNav" class="absolute flex flex-col bg-orange-400 p-10 mt-6 right-0 h-screen"/>
      </div>
      
    </section>
  </div>
</template>

<script setup>
import { ref } from 'vue';
import NavOptions from './NavOptions.vue';
import DonevoLogo from '../DonevoLogo.vue';
import burgericon from '../icons/burgericon.vue';
import { RouterLink } from 'vue-router';

const showMobileNav = ref(false)

function toggleNav() {
  showMobileNav.value = !showMobileNav.value
}
</script>