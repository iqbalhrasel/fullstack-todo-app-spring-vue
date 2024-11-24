<template>
  <button @click="handleLogout" class="text-sm font-bold text-white px-2 py-1 rounded-lg bg-orange-400 hover:bg-orange-300">Logout</button>
</template>

<script setup>
import { useAuthStore } from '@/stores/authStore';

const authStore = useAuthStore();

function handleLogout() {
  authStore.logout();
}
</script>