<template>
  <div>
    <section class="mt-20">
      <p class="text-center flex flex-col text-3xl font-bold">
        <span>Say good bye to boring list,</span>
        <span>shout out to the fresh style</span>
      </p>
    </section>

    <section class="mt-10 lg:mx-52 flex flex-col lg:flex-row justify-center items-center">
      <div class="bg-gray-100 w-[26rem] md:w-[30rem] lg:w-[33rem] pt-6 px-6 rounded-2xl mb-3 lg:mb-0">
        <div class="text-center mb-14">
          <p class="bg-green-700 px-3 py-1 rounded-full text-sm text-gray-300 font-bold inline-block">Before</p>
        </div>
        
        <div>
          <div class="flex items-center bg-white py-2 px-3 rounded-lg mb-2">
            <span class="px-[0.43rem] bg-black rounded-lg block">
              <tickicon class="w-3 inline-block text-white pb-1"/>
            </span>
            <span class="line-through ml-3 block pb-1">Lorem, ipsum dolor.</span>
          </div>
          
          <div class="flex items-center bg-white py-2 px-3 rounded-lg mb-2">
            <span class="p-[0.70rem] border-2 rounded-lg block"></span>
            <span class="ml-3 block pb-1">Lorem, ipsum dolor.</span>
          </div>

          <div class="flex items-center bg-white py-2 px-3 rounded-lg mb-2">
            <span class="p-[0.70rem] border-2 rounded-lg block"></span>
            <span class="ml-3 block pb-1">Lorem, ipsum dolor.</span>
          </div>
          
          <div class="flex items-center bg-white py-2 px-3 rounded-lg mb-2">
            <span class="p-[0.70rem] border-2 rounded-lg block"></span>
            <span class="ml-3 block pb-1">Lorem, ipsum dolor.</span>
          </div>

          <div class="flex items-center bg-white py-2 px-3 rounded-lg mb-2">
            <span class="p-[0.70rem] border-2 rounded-lg block"></span>
            <span class="ml-3 block pb-1">Lorem, ipsum dolor.</span>
          </div>
        </div>

        <p class="text-center mt-12 pb-6">Lorem ipsum dolor sit amet consectetur adipisicing elit. Laudantium aspernatur adipisci esse</p>
      </div>

      <div class="bg-gray-100 w-[26rem] md:w-[30rem] lg:w-[33rem] pt-6 rounded-2xl md:ml-2">
        <div class="text-center mb-20">
          <p class="bg-orange-500 px-3 py-1 rounded-full text-sm text-gray-300 font-bold inline-block">After</p>
        </div>
        
        <div class="flex justify-between pb-10">
          <div class="w-32 rounded-r-2xl pt-3 pb-4 bg-white mr-2">
            <p class="inline-block bg-gray-50 px-3 font-semibold text-gray-300 rounded-full text-sm">DAY 10</p>
            <p class="font-bold text-xl py-8 line-through text-gray-400">ad Pages 116-128</p>
            <p class="text-sm text-gray-400 font-bold">2:00 - 12:30</p>
          </div>

          <div class="text-center w-48 rounded-2xl pt-3 pb-4 bg-white">
            <p class="inline-block bg-blue-400 px-3 font-semibold text-gray-200 rounded-full text-sm">DAY 10</p>
            <p class="font-bold text-xl py-8">Read Pages 128-138</p>
            <p class="text-sm text-gray-400 font-bold">12:00 - 12:30</p>
          </div>

          <div class="text-right w-32 rounded-l-2xl pt-3 pb-4 bg-white ml-2">
            <p class="inline-block bg-gray-100 px-3 font-semibold rounded-full text-sm">DAY 10</p>
            <p class="font-bold text-xl py-8">Read Pag 138-140</p>
            <p class="text-sm text-gray-400 font-bold">12:00 - 12:3</p>
          </div>
          
        </div>

        <p class="text-center mt-12 pb-6 px-5">Lorem ipsum dolor sit amet consectetur adipisicing elit. Laudantium aspernatur adipisci esse</p>
      </div>
    </section>
  </div>


</template>

<script setup>
import tickicon from '../icons/tickicon.vue';
</script>

<style>

</style>