<template>
  <div class=" bg-gray-100 mt-20 pb-20">
    <h2 class="text-center pt-16 mb-10 text-3xl font-bold">How Donevo changed lives</h2>
    <section class="lg:mx-52 md:mx-32 sm:mx-16 mx-8">
      <div class="grid sm:grid-cols-2 md:gap-8 gap-4">
        <!-- cards -->
        <div v-for="i in 6" :key="i" >
          <section class="bg-white p-4 rounded-2xl">
            <p class="font-medium text-lg text-gray-700">Lorem ipsum, dolor sit amet consectetur adipisicing elit. Excepturi consequuntur magni sed iusto tenetur, libero nemo quam inventore!</p>
            <div class="flex mt-8 mb-3">
              <div class="w-9 h-9 rounded-full bg-gray-300"></div>
              <div class="w-9 h-9 rounded-full bg-black"></div>
            </div>
            <p>
              <span class="block font-bold text-gray-700">Doe, John</span>
              <span class="text-sm font-medium text-gray-400">Lorem ipsum dolor sit amet.</span>
            </p>
          </section>
          
        </div>
        <!-- cards -->
      </div>
    </section>
    
  </div>
</template>

<script>
export default {

}
</script>

<style>

</style>