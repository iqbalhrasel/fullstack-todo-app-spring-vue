<template>
  <NavBar/>
  <RouterView />
  <Footer/>
</template>

<script setup>
import NavBar from '@/components/navbar/NavBar.vue';
import Footer from '@/components/Footer.vue';
</script>