<template>
    <ve-bmap
            :settings="chartSettings"
            :series="chartSeries"
            :tooltip="chartTooltip">
    </ve-bmap>
</template>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script src="https://cdn.jsdelivr.net/npm/echarts/dist/echarts.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/v-charts/lib/index.min.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/v-charts/lib/style.min.css">
<!--使用百度地图或高德地图时需要额外引入相应的模块如下：-->
<script src="https://cdn.jsdelivr.net/npm/echarts-amap/dist/echarts-amap.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/echarts/dist/extension/bmap.min.js"></script>
<script type='module'>
    export default {
        data () {
            return {
                chartData: {
                    columns: ['type', 'a', 'b', 'value'],
                    rows: [
                        { type: '速度', value: 80, a: 1, b: 2 }
                    ]
                }
            }
        }
    }
</script>