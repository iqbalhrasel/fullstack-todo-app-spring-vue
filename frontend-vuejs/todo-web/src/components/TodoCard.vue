<template>
  <div class="border-2 border-gray-200 rounded-xl ">
    <div class="flex justify-between">
      <p class="pl-4 mr-2 pt-4 text-gray-800">{{ props.todo.description }}</p>

      <div class="pt-4 mr-2 relative">
        <button @click="toggleOption" class="hover:bg-orange-200 rounded-lg py-1"><elipseico class="size-6 text-gray-500"/></button>        

        <div class="absolute w-24 bg-orange-200 shadow-lg flex flex-col right-0 mr-1 rounded-xl text-sm text-gray-600 overflow-hidden" v-show="showOptions">

          <button @click="handleUpdate" class="hover:bg-orange-100 px-2 py-2 font-bold">Edit</button>

          <button @click="handleDelete" class="hover:bg-orange-100 px-2 py-2 font-bold">Delete</button>
        </div>
      </div>
      
    </div>
    

    <div class="mx-4 mt-10 text-gray-500 inline-block px-3 pb-1 items-center border rounded-full">
      <alarmclockico class="size-3 inline-block"/>
      <p class="text-sm ml-2 inline-block">{{format(new Date(props.todo.targetDate), 'd MMM yyyy')}}</p>
    </div>
    
    <section class="p-4 text-gray-600 flex justify-between items-center">
      <p class="text-sm">{{format(new Date(props.todo.creationDate), 'MMMM dd, yyyy')}}</p>

      <div class="inline-flex items-center">
        <label class="flex items-center cursor-pointer relative">

          <input v-model="isDone" type="checkbox" class="peer h-6 w-6 cursor-pointer transition-all appearance-none rounded-full shadow hover:shadow-md border border-slate-300 checked:bg-slate-800 checked:border-slate-800" id="check-custom-style" />

          <span class="absolute text-white opacity-0 peer-checked:opacity-100 top-1/2 left-1/2 transform -translate-x-1/2 -translate-y-1/2">
          <svg xmlns="http://www.w3.org/2000/svg" class="h-3.5 w-3.5" viewBox="0 0 20 20" fill="currentColor" stroke="currentColor" stroke-width="1">
            <path fill-rule="evenodd" d="M16.707 5.293a1 1 0 010 1.414l-8 8a1 1 0 01-1.414 0l-4-4a1 1 0 011.414-1.414L8 12.586l7.293-7.293a1 1 0 011.414 0z" clip-rule="evenodd"></path>
          </svg>
          </span>
        </label>
      </div>
    </section>

  </div>
</template>

<script setup>
import { ref, watch, onMounted, onBeforeUnmount } from 'vue';
import { format } from 'date-fns';
import { useTodoStore } from '@/stores/todoStore';
import alarmclockico from './icons/alarmclockico.vue';
import elipseico from './icons/elipseico.vue';

const todoStore = useTodoStore();

const props = defineProps(['todo'])
const emits = defineEmits(['update', 'delete'])

const isDone = ref(false);

watch(isDone, (newVal, oldVal) => {  
  const modifiedTodo = props.todo;
  modifiedTodo.done = newVal
  todoStore.updateTodo(modifiedTodo)
})


function handleUpdate() {
  emits('update', props.todo)
}

function handleDelete(params) {
  emits('delete', props.todo.id)
}

// dropdown settings
const showOptions = ref(false)

function toggleOption() {
  showOptions.value = !showOptions.value
}

const closeDropdown = (e) => {
  if(!e.target.closest(".relative")){
    showOptions.value = false
  }
}

onMounted(() => {
  isDone.value = props.todo.done
  document.addEventListener('click', closeDropdown)
})

onBeforeUnmount(() => {
  document.removeEventListener('click', closeDropdown)
})
</script>