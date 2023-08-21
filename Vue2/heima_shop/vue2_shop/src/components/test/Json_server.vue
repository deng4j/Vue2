<template>
  <div>
    <button v-on:click="getFunc">get请求，查询数据</button>
    <ul>
      <li v-for="item in jsonData">{{ item }}</li>
    </ul>
    <hr>
    <form action="">
      <input type="text" v-model="obj.name"><br>
      <input type="text" v-model="obj.age"><br>
      <button v-on:click="postFunc">post请求，新增数据</button>
    </form>
    <hr>
    <input type="text" v-model="delID"><br>
    <button v-on:click="deleteFunc">delete请求，删除数据</button>
    <hr>
    <input type="text" v-model="obj.id"><br>
    <input type="text" v-model="obj.name"><br>
    <input type="text" v-model="obj.age"><br>
    <button v-on:click="putFunc">put请求，覆盖数据</button>
  </div>
</template>

<script>
async function updateData(thisObj){
  const { data: res } = await thisObj.$http.get('jsonData')
  thisObj.jsonData=res
  thisObj.delID = thisObj.jsonData[thisObj.jsonData.length-1].id
}

export default {
  data(){
    return{
      jsonData:null,
      obj:{
        id:1,
        name:'张三',
        age:18
      },
      delID:0
    }
  },
  methods:{
    async getFunc(){
      const { data: res } = await this.$http.get('jsonData')
      this.jsonData=res
    },
    async postFunc(){
      await this.$http.post('jsonData',{
        "name":"李四",
        "age":21
      })
      updateData(this)
    },
    async deleteFunc(){
      // http://localhost:3000/{接口名}/{id}
      await this.$http.delete(`jsonData/${this.delID}`)
      updateData(this)
    },
    async putFunc(){
      await this.$http.put(`jsonData/${this.obj.id}`,{
        "name":this.obj.name,
        "age":this.obj.age
      })
      updateData(this)
    }
  }
}
</script>
<style>

</style>
