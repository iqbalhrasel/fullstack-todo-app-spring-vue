<template>
  <HeroSection/>
  <TodoDemo/>
  <FeatureTile/>
  <UserOpinion/>
  <Faq/>
  <DownloadApp/>

  <RouterView />
</template>

<script setup>
import HeroSection from '@/components/forhome/HeroSection.vue';
import TodoDemo from '@/components/forhome/TodoDemo.vue';
import FeatureTile from '@/components/forhome/FeatureTile.vue';
import UserOpinion from '@/components/forhome/UserOpinion.vue';
import Faq from '@/components/forhome/Faq.vue';
import DownloadApp from '@/components/forhome/DownloadApp.vue';
</script>