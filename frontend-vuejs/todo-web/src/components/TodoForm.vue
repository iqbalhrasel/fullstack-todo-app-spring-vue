<template>
  <div>
    <div @click.self="$emit('closeForm')" class="fixed bg-black bg-opacity-35 flex justify-center top-0 right-0 left-0 bottom-0 ">
      
      <form @submit.prevent="handleForm" class="bg-white h-96 w-80 mt-20 p-6 rounded-xl">
        <p class="text-xl font-bold text-center mb-5">DETAILS</p>

        <input type="hidden" v-model="todoForm.id">

        <label class="uppercase text-gray-500 font-medium">Description</label>
        <textarea v-model="todoForm.description" required class="block w-full border rounded-md mt-1"></textarea>

        <label class="block uppercase text-gray-500 font-medium mt-4">Target date</label>
        <input v-model="todoForm.targetDate" required type="date" class="mt-1 border px-4 py-1 rounded-md">

        <div class="mt-4">
          <input v-model="todoForm.done" type="checkbox" class="mr-2">
          <label class="uppercase text-gray-500 font-medium">Done</label>
        </div>
        
        <div class="flex justify-center mt-6">
          <button type="submit" class="bg-green-600 hover:bg-green-500 text-white font-semibold px-8 py-2 rounded-full mr-3">Save</button>

          <button @click="$emit('closeForm')" type="submit" class="bg-orange-600 hover:bg-orange-500 text-white font-semibold px-8 py-2 rounded-full">Cancel</button>
        </div>
        
      </form>
    </div>
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue';

const emit = defineEmits(['closeForm', 'createTodo', 'updateTodo'])
const props = defineProps(['todo'])

const todoForm = ref({id:0, description: '', targetDate: new Date(), done: false})

function handleForm() {
  emit('closeForm')
  if(todoForm.value.id === 0){
    emit('createTodo', todoForm.value)
  }
  else {
    emit('updateTodo', todoForm.value)
  }
}

onMounted(() => {
  if(Object.keys(props.todo).length === 0){
    const newTodo = {id:0, description: '', targetDate: new Date(), done: false}

    todoForm.value = newTodo
  }
  else {
    todoForm.value = props.todo    
  }  
})
</script>