<template>
  <div>
    <section class="mt-28">
      <p class="text-center flex flex-col text-3xl font-bold">
        <span>Awesome feature you'll like,</span>
        <span>everything in a simple way</span>
      </p>
    </section>

    <section class="mt-10">
      <div class="grid lg:grid-cols-2 grid-cols-1 bg-yellow-400 rounded-xl lg:mx-52 mx-20">
        <div class="col-span-1">          
          <div class="text-3xl font-bold ml-12 mt-10 mb-4">
            <p>Easily tracing your task,</p>
            <p>every day, every week,</p>
            <p>with ease</p>
          </div>
          
          <p class="mx-12 mb-5">Lorem ipsum dolor, sit amet consectetur adipisicing elit. Vero voluptate nostrum delectus.</p>          
        </div>

        <div class="col-span-1">
          <div class="flex justify-center">
            <div class="bg-gray-50 sm:w-[25rem] w-[18rem] pt-6 mt-3 rounded-t-xl">
              <div class="flex justify-between px-10">
                <p class="font-bold">9:41</p>
                <div class="flex justify-end">
                  <networkicon class="mr-1 w-5"/>
                  <wifiicon class="mr-1 w-6"/>
                  <batteryicon/>
                </div>
              </div>

              <div class="mt-7 mx-5">
                <p class="bg-gray-200 pl-3 py-2 rounded-full space-x-3 text-sm text-gray-500 font-bold text-center">
                  <span>Monday</span>
                  <span class="bg-white px-2 py-1 rounded-full">Tuesday</span>
                  <span>Wednesday</span>
                  <span class="hidden lg:inline-block">Thursday</span>
                  <span class="hidden lg:inline-block">Fr</span>
                </p>
              </div>

              <div class="text-center mt-8 mb-4 font-bold text-xl">Welcome back, Jimmy!</div>

              <div class="flex justify-between bg-orange-400 mx-7 rounded-xl">
                <div class="text-white font-bold text-xl ml-4 mt-4">
                  <p>102 Task completed,</p>
                  <p>you are masterpiece</p>
                </div>
                <div class="mr-4">
                  <p class="flex flex-col text-center text-sm font-semibold">
                    <span class="bg-orange-300 px-3 pb-1 rounded-full text-orange-400 hidden lg:inline-block">Day 98</span>
                    <span class="bg-orange-300 px-3 py-1 rounded-full text-orange-400 mt-1">Day 99</span>
                    <span class="bg-gray-100 px-3 py-1 rounded-full text-orange-400 mt-1">Day 100</span>
                    <span class="bg-orange-300 px-3 py-1 rounded-full text-orange-400 mt-1">Day 101</span>
                    <span class="bg-orange-300 px-3 pt-1 rounded-full text-orange-400 mt-1 lg:inline-block hidden">Day 102</span>
                  </p>
                </div>
              </div>

              <div class="text-center mt-10 mb-4">
                <div class="bg-white px-3 py-2 shadow rounded-full inline-block">
                  <span><plusicon class="inline-block w-5 pb-1"/></span>
                  <span class="font-semibold ml-2">Create new goal</span>
                </div>
              </div>
            </div>

            
          </div>
        </div>
      </div>
    </section>

    <section>
      <div class="grid md:grid-cols-2 grid-cols-1 text-white mt-10 gap-3">
        <div class="col-span-1 bg-orange-500 lg:ml-52 ml-20 md:mr-3 mr-20 rounded-xl">
          <p class="px-8 pt-8 font-bold text-3xl">Progress preview in a fun way, yes, it's fun</p>

          <p class="px-8 pt-3">Lorem ipsum dolor, sit amet consectetur adipisicing elit. Laborum tempora quos et, ut tempore assumenda.</p>

          <div class="flex flex-col items-center mt-16">
            <emojismile class="size-20 text-yellow-300"/>
            <p class="mb-20 mt-2">
              <span class="bg-white text-black font-bold px-3 py-1 rounded-full">64%</span>
            </p>
          </div>
          
        </div>

        <div class="col-span-1 bg-blue-300 lg:mr-52 mr-20 md:ml-3 ml-20 rounded-xl">
          <p class="px-8 pt-8 font-bold text-3xl">Effortlessly manage your task with the help by AI</p>

          <p class="px-8 pt-3">Lorem ipsum dolor, sit amet consectetur adipisicing elit. Laborum tempora quos et, ut tempore assumenda.</p>

          <div class="flex flex-col mt-10">
            <div class="text-center">
              <p class="bg-white inline-block text-gray-600 px-3 py-1 rounded-full font-bold">Change reading time</p>
            </div>
            <div class="text-center mt-3">
              <p class="bg-white inline-block text-gray-600 text-center px-3 py-1 rounded-full font-bold">Add your daily today</p>
            </div>
            <div class="text-center mt-3 mb-20">
              <p class="bg-white inline-block text-gray-600 text-center px-3 py-1 rounded-full font-bold">Move reading time next week</p>
            </div>
          </div>
        </div>
      </div>
    </section>
  </div>
</template>

<script setup>
import networkicon from '../icons/networkicon.vue';
import wifiicon from '../icons/wifiicon.vue';
import batteryicon from '../icons/batteryicon.vue';
import plusicon from '../icons/plusicon.vue';
import emojismile from '../icons/emojismile.vue';

</script>

<style>

</style>