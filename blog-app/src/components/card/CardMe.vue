<template>
  <el-card>
    <router-link to="/cardme">
      <h1 class="me-author-name">很想瘦瘦的鱼</h1>
    <div class="me-author-description">
      <span><i class="el-icon-location-outline"></i> &nbsp;湖南 衡阳</span>
      <span><i class="me-icon-job"></i> &nbsp;高级营养师</span>
    </div>
    </router-link>
    <div class="me-author-tool">
      <i @click="showTool(qq)" :title="qq.title" class="me-icon-QQ"></i>
      <i @click="showTool(github)" :title="github.title" class=""></i>
    </div>
  </el-card>

</template>

<script>
  export default {
    name: 'CardMe',
    data() {
      return {
        qq: {title: 'QQ', message: '请求添加薯友qq，请求已发送'},
        github: {
          title: 'github',
          message: '已关注'
        }
      }
    },
    methods: {
      showTool(tool) {
        this.$message({
          duration: 0,
          showClose: true,
          dangerouslyUseHTMLString: true,
          message: '<strong>' + tool.message + '</strong>'
        });
      }
    }
  }
</script>

<style scoped>
  .me-author-name {
    text-align: center;
    font-size: 32px;
    border-bottom: 1px solid #5FB878;
     text-decoration: none;
    list-style: none;
    font-weight: normal;
    color: #5FB878;
  }
span{
 text-decoration: none;
    list-style: none;
    color: #5FB878;
}
  .me-author-description {
    padding: 8px 0;
  }

  .me-icon-job {
    padding-left: 16px;
  }

  .me-author-tool {
    text-align: center;
    padding-top: 10px;
  }

  .me-author-tool i {
    cursor: pointer;
    padding: 4px 10px;
    font-size: 30px;
  }




</style>
