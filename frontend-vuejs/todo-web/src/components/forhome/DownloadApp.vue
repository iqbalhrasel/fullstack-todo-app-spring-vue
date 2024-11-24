<template>
  <div class="bg-orange-500 flex justify-center py-14 md:py-0 relative">
    <div class="lg:size-72 md:size-52 sm:size-36 size-32 rounded-full bg-orange-400"></div>
    <div class="lg:size-72 md:size-52 sm:size-36 size-32 rounded-full bg-orange-400"></div>
    <div class="lg:size-72 md:size-52 sm:size-36 size-32 rounded-full bg-orange-400"></div>
    <div class="lg:size-72 md:size-52 sm:size-36 size-32 rounded-full bg-orange-400"></div>
    <div class="lg:size-72 md:size-52 sm:size-36 size-32 rounded-full bg-orange-400 sm:block hidden"></div>

    <div class="absolute">

      <p class="text-center sm:mt-10 lg:mt-16 mb-2 text-white font-bold text-2xl">Download for Free!</p>

      <p class="text-center text-sm text-white font-medium">
        <span class="block">Lorem ipsum, dolor sit amet consectetur adipisicing elit.</span>
        <span>Molestias sapiente quibusdam</span>
      </p>
      
      <div class="flex justify-center mt-3">
        <div class="mr-2">
          <p class="text-center inline-block border bg-white px-4 py-2 rounded-full">
            <span><playicon class="inline-block w-5 mr-2"/></span>
            <span class="text-sm font-bold">App Store</span>
          </p>
        </div>
        <div>
          <p class="text-center inline-block border bg-white px-4 py-2 rounded-full">
            <span><playicon class="inline-block w-5 mr-2"/></span>
            <span class="text-sm font-bold">Play Store</span>
          </p>
        </div>
        
      </div>
    </div>
  </div>
</template>

<script setup>
import playicon from '../icons/playicon.vue';
</script>