<template>
  <div>
    <div class="hidden sm:flex sm:justify-between bg-orange-100 px-10 py-1 items-center sticky top-0 z-50">
      <DonevoLogo/>
      <p class="text-sm font-bold text-green-600 uppercase">{{ authStore.fullName }}</p>
      <ButtonLogout/>
    </div>

    <div class="block sm:hidden sticky top-0">
      <SideNav>
        <template #logout>
          <ButtonLogout/>
        </template>
      </SideNav>
    </div>
    <div class="grid grid-cols-12">

      <div class="col-span-1 sm:block hidden ">
        <SideNav/>
      </div>

      <div class="sm:col-span-11 col-span-12">
        <router-view />
      </div>
    </div>
  </div>
</template>

<script setup>
import { useAuthStore } from '@/stores/authStore';
import DonevoLogo from '@/components/DonevoLogo.vue';
import SideNav from '@/components/navbar/SideNav.vue';
import ButtonLogout from '@/components/ButtonLogout.vue';

const authStore = useAuthStore()

</script>
