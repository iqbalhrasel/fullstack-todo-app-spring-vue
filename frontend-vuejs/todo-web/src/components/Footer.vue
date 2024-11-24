<template>
  <div>
    <div class="grid md:grid-cols-3 mx-10 my-12">

      <div class="col-span-1">
        <DonevoLogo />
      </div>

      <div class="col-span-1 mt-5 md:mt-0">
        <div class="flex md:flex-row flex-col md:justify-center space-y-3">
          <div class="font-bold mr-16">
            <p>Solutions</p>
            <p class="text-gray-400">Lorem, ipsum.</p>
            <p class="text-gray-400">Lorem, ipsum.</p>
            <p class="text-gray-400">Lorem, ipsum.</p>
          </div>
          <div class="font-bold mr-16">
            <p>Services</p>
            <p class="text-gray-400">lorem</p>
            <p class="text-gray-400">lorem</p>
            <p class="text-gray-400">lorem</p>
            <p class="text-gray-400">lorem</p>
          </div>
          <div class="font-bold">
            <p>Policy</p>
            <p class="text-gray-400">Lorem, ipsum.</p>
            <p class="text-gray-400">Lorem, ipsum.</p>
            <p class="text-gray-400">Lorem, ipsum.</p>
          </div>
        </div>
      </div>

      <div class="col-span-1 mt-3 md:mt-0">
        <div class="flex md:justify-end">
          <div class="font-bold">
            <p>Let's Talk</p>
            <p class="text-gray-400">Lorem, ipsum.</p>
            <p class="text-gray-400">Lorem, ipsum dolor.</p>
            <p class="text-gray-400">[+00] 000 000 000</p>
          </div>          
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import DonevoLogo from './DonevoLogo.vue';
</script>