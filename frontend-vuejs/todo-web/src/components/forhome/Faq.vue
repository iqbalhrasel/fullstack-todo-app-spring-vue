<template>
  <div class="lg:mx-52 md:mx-32 sm:mx-20 mx-10">
    <section class="grid md:grid-cols-2 ">
      <div class="col-span-1">
        <h2 class="text-3xl font-bold mr-40 mt-20">Frequently Asked Questions</h2>

        <div class="md:inline-block hidden border border-gray-200 mt-40 px-7 py-1 rounded-full">
          <p class="inline-block text-sm font-medium text-gray-700 mr-2">Have other question?</p>
          <arrowright class="inline-block size-4 text-orange-600"/>
        </div>

      </div>

      <div class="col-span-1 md:my-20 mt-10">
        <div v-for="i in 5" :key="i">
          <div class="flex justify-between border-b-2 py-4">
            <p class="inline-block ml-3 text-sm font-medium text-gray-800">Lorem ipsum dolor sit amet consectetur.</p>
            <plusicon class="inline-block mr-3 text-orange-600 size-5"/>
          </div>          
        </div>
      </div>
      <!-- add accordion above -->

      <div class="inline-block md:hidden border border-gray-200 mt-16 mb-20 px-7 py-1 rounded-full w-60">
          <p class="inline-block text-sm font-medium text-gray-700 mr-2">Have other question?</p>
          <arrowright class="inline-block size-4 text-orange-600"/>
        </div>
    </section>
  </div>
</template>

<script setup>
import arrowright from '../icons/arrowright.vue';
import plusicon from '../icons/plusicon.vue';
</script>