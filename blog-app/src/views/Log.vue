<template>
<div style="width:100%">
  <div style="width:100%;">
    <div class="swiper-container">
      <el-carousel trigger="click" height="450px">
        <el-carousel-item v-for="item in imgList" :key="item.name" :name="item.name">
          <img style="width:100%; height:100%" :src="item.url" alt="">
        </el-carousel-item>
      </el-carousel>
    </div>
  </div>
  <div class="more_log">
  <h1>薯卡官方资讯推荐</h1>
  <div class="swiper-wrapper" id="swiper-wrapper-2c55091bab515965" aria-live="polite" style="transform: translate3d(0px, 0px, 0px);">

        <div class="border-box swiper-slide swiper-slide-active" role="group" aria-label="1 / 7" style="width: 162.857px; margin-right: 10px;">
          <a target="_blank" class="clean-link" href="https://www.bilibili.com/video/BV1264y1u7HT">
            <div class="cover">
              <img src="http://up.boohee.cn/house/u/site/pc/channel/kshafpqd.jpg" class="left">
            </div>

            <p>真的可以躺瘦</p>
          </a>
        </div>

        <div class="border-box swiper-slide swiper-slide-next" role="group" aria-label="2 / 7" style="width: 162.857px; margin-right: 10px;">
          <a target="_blank" class="clean-link" href="https://www.bilibili.com/video/BV1v5411t7uW">
            <div class="cover">
              <img src="http://up.boohee.cn/house/u/site/pc/channel/ehvsokiu.jpg" class="left">
            </div>

            <p>为什么吃那么少还不瘦？</p>
          </a>
        </div>

        <div class="border-box swiper-slide" role="group" aria-label="3 / 7" style="width: 162.857px; margin-right: 10px;">
          <a target="_blank" class="clean-link" href="https://www.bilibili.com/video/BV1Ak4y1R7PB">
            <div class="cover">
              <img src="http://up.boohee.cn/house/u/site/pc/channel/aeqvxifk.jpg" class="left">
            </div>

            <p>微博-真正的减脂餐</p>
          </a>
        </div>

        <div class="border-box swiper-slide" role="group" aria-label="4 / 7" style="width: 162.857px; margin-right: 10px;">
          <a target="_blank" class="clean-link" href="https://www.bilibili.com/video/BV1EE411L7Tn">
            <div class="cover">
              <img src="http://up.boohee.cn/house/u/site/pc/channel/oxtgeadk.jpg" class="left">
            </div>

            <p>十大谷物</p>
          </a>
        </div>

        <div class="border-box swiper-slide" role="group" aria-label="5 / 7" style="width: 162.857px; margin-right: 10px;">
          <a target="_blank" class="clean-link" href="https://www.bilibili.com/video/BV1E64y1T71L">
            <div class="cover">
              <img src="http://up.boohee.cn/house/u/site/pc/channel/zdtcqhxt.jpg" class="left">
            </div>

            <p>热量不超就不会胖吗？</p>
          </a>
        </div>

        <div class="border-box swiper-slide" role="group" aria-label="6 / 7" style="width: 162.857px; margin-right: 10px;">
          <a target="_blank" class="clean-link" href="https://www.bilibili.com/video/BV17K4y1k7yC?from=search&amp;seid=489928371802078205">
            <div class="cover">
              <img src="http://up.boohee.cn/house/u/site/pc/channel/zvaxzpgq.jpg" class="left">
            </div>

            <p>鸡蛋豆浆能不能一起吃？</p>
          </a>
        </div>



      </div>
  </div>
</div>
</template>
<script>
export default {
  name: 'Log',


  data() {
    return {

      imgList:[
        {
          name:'1',
          url:'http://up.boohee.cn/house/u/site/pc/channel/1.png'
        },
         {
          name:'2',
          url:'http://up.boohee.cn/house/u/site/pc/channel/2.png'
        },
         {
          name:'3',
          url:'http://up.boohee.cn/house/u/site/pc/channel/3.png'
        },
        {
          name:'4',
          url:'http://up.boohee.cn/house/u/site/pc/index/food-database-bg.png'
        },
      ]


    }

  }

}
</script>

<style scoped>
.more_log{
  width: 1200px;
  padding-left: 80px;
  align-content: center;

}
  h1{
    padding-top: 50px;
  }
   .border-box{
    width: 200px;
    float: left;
    padding: 12px;
   }
   .left{
         -webkit-text-size-adjust: 100%;
    --swiper-theme-color: #007aff;
    --swiper-navigation-size: 44px;
    list-style: none;
    border-style: none;
    user-select: none;
    float: left;
    width: 146.855px;
    height: 82.58px;
   }
   p{
     width: 146.855px;
    height: 82.58px;
        -webkit-text-size-adjust: 100%;
    --swiper-navigation-size: 44px;
    list-style: none;
    font-weight: normal;
    color: #373D53;
    font-size: 15px;
    line-height: 18px;
    margin: 10px 0 0 0;
   }
</style>>


</style>
