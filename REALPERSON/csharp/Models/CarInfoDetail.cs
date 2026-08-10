// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    // 车辆资产验证详版车辆信息
    public class CarInfoDetail : TeaModel {
        // 车辆型号
        /// <summary>
        /// <b>Example:</b>
        /// <para>FV7144LBDBG</para>
        /// </summary>
        [NameInMap("clxh")]
        [Validation(Required=false)]
        public string Clxh { get; set; }

        // 发动机号
        /// <summary>
        /// <b>Example:</b>
        /// <para>N10514</para>
        /// </summary>
        [NameInMap("engine_code")]
        [Validation(Required=false)]
        public string EngineCode { get; set; }

        // 发动机型号
        /// <summary>
        /// <b>Example:</b>
        /// <para>CST</para>
        /// </summary>
        [NameInMap("engine_model")]
        [Validation(Required=false)]
        public string EngineModel { get; set; }

        // 生产时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2022-08-17</para>
        /// </summary>
        [NameInMap("production_time")]
        [Validation(Required=false)]
        public string ProductionTime { get; set; }

        // 品牌名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>大众</para>
        /// </summary>
        [NameInMap("brand_name")]
        [Validation(Required=false)]
        public string BrandName { get; set; }

        // 高尔夫(第七代,2014-)
        /// <summary>
        /// <b>Example:</b>
        /// <para>series_name</para>
        /// </summary>
        [NameInMap("series_name")]
        [Validation(Required=false)]
        public string SeriesName { get; set; }

        // 年款
        /// <summary>
        /// <b>Example:</b>
        /// <para>2016</para>
        /// </summary>
        [NameInMap("model_year")]
        [Validation(Required=false)]
        public string ModelYear { get; set; }

        // 款型名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>极狐αT 653S+ 160kW 22款;极狐αT 653S 160kW 22款</para>
        /// </summary>
        [NameInMap("vehicle_name")]
        [Validation(Required=false)]
        public string VehicleName { get; set; }

        // 指导价
        /// <summary>
        /// <b>Example:</b>
        /// <para>28.23万;26.23万</para>
        /// </summary>
        [NameInMap("guide_price")]
        [Validation(Required=false)]
        public string GuidePrice { get; set; }

        // 车身颜色
        /// <summary>
        /// <b>Example:</b>
        /// <para>黑/白</para>
        /// </summary>
        [NameInMap("color")]
        [Validation(Required=false)]
        public string Color { get; set; }

        // 车型级别
        /// <summary>
        /// <b>Example:</b>
        /// <para>vehicle_level</para>
        /// </summary>
        [NameInMap("vehicle_level")]
        [Validation(Required=false)]
        public string VehicleLevel { get; set; }

        // 车型种类
        /// <summary>
        /// <b>Example:</b>
        /// <para>多用途乘用车</para>
        /// </summary>
        [NameInMap("vehicle_type")]
        [Validation(Required=false)]
        public string VehicleType { get; set; }

        // 车身结构
        /// <summary>
        /// <b>Example:</b>
        /// <para>两厢车</para>
        /// </summary>
        [NameInMap("body_struct")]
        [Validation(Required=false)]
        public string BodyStruct { get; set; }

        //  燃料种类
        /// <summary>
        /// <b>Example:</b>
        /// <para>汽油</para>
        /// </summary>
        [NameInMap("fuel_type")]
        [Validation(Required=false)]
        public string FuelType { get; set; }

        // 驱动方式
        /// <summary>
        /// <b>Example:</b>
        /// <para>前置前驱</para>
        /// </summary>
        [NameInMap("drive_way")]
        [Validation(Required=false)]
        public string DriveWay { get; set; }

        // 底盘型号-商用车用
        /// <summary>
        /// <b>Example:</b>
        /// <para>chassis_model</para>
        /// </summary>
        [NameInMap("chassis_model")]
        [Validation(Required=false)]
        public string ChassisModel { get; set; }

        // 排放标准
        /// <summary>
        /// <b>Example:</b>
        /// <para>GB18352.5-2013</para>
        /// </summary>
        [NameInMap("emission_standard")]
        [Validation(Required=false)]
        public string EmissionStandard { get; set; }

        // 排量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.4T</para>
        /// </summary>
        [NameInMap("displacement")]
        [Validation(Required=false)]
        public string Displacement { get; set; }

        // 长
        /// <summary>
        /// <b>Example:</b>
        /// <para>4255</para>
        /// </summary>
        [NameInMap("length")]
        [Validation(Required=false)]
        public string Length { get; set; }

        // 宽
        /// <summary>
        /// <b>Example:</b>
        /// <para>1799</para>
        /// </summary>
        [NameInMap("width")]
        [Validation(Required=false)]
        public string Width { get; set; }

        // 高
        /// <summary>
        /// <b>Example:</b>
        /// <para>1452</para>
        /// </summary>
        [NameInMap("height")]
        [Validation(Required=false)]
        public string Height { get; set; }

        // 总质量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1760</para>
        /// </summary>
        [NameInMap("total_mass")]
        [Validation(Required=false)]
        public string TotalMass { get; set; }

        // 整备质量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1280</para>
        /// </summary>
        [NameInMap("curb_weight")]
        [Validation(Required=false)]
        public string CurbWeight { get; set; }

        // 前轮距
        /// <summary>
        /// <b>Example:</b>
        /// <para>1549</para>
        /// </summary>
        [NameInMap("tire_distance_before")]
        [Validation(Required=false)]
        public string TireDistanceBefore { get; set; }

        // 后轮距
        /// <summary>
        /// <b>Example:</b>
        /// <para>1640</para>
        /// </summary>
        [NameInMap("tire_distance_after")]
        [Validation(Required=false)]
        public string TireDistanceAfter { get; set; }

        // 轴数
        /// <summary>
        /// <b>Example:</b>
        /// <para>2</para>
        /// </summary>
        [NameInMap("axes_number")]
        [Validation(Required=false)]
        public string AxesNumber { get; set; }

        // 轴距 
        /// <summary>
        /// <b>Example:</b>
        /// <para>2637</para>
        /// </summary>
        [NameInMap("wheel_base")]
        [Validation(Required=false)]
        public string WheelBase { get; set; }

        // 座位数
        /// <summary>
        /// <b>Example:</b>
        /// <para>5</para>
        /// </summary>
        [NameInMap("seating_capacity")]
        [Validation(Required=false)]
        public string SeatingCapacity { get; set; }

        // 核定载质量
        /// <summary>
        /// <b>Example:</b>
        /// <para>approved_load</para>
        /// </summary>
        [NameInMap("approved_load")]
        [Validation(Required=false)]
        public string ApprovedLoad { get; set; }

        // 准牵引总质量 
        /// <summary>
        /// <b>Example:</b>
        /// <para>quasi_traction</para>
        /// </summary>
        [NameInMap("quasi_traction")]
        [Validation(Required=false)]
        public string QuasiTraction { get; set; }

        // 轮胎规格
        /// <summary>
        /// <b>Example:</b>
        /// <para>tire_size</para>
        /// </summary>
        [NameInMap("tire_size")]
        [Validation(Required=false)]
        public string TireSize { get; set; }

        // 轮胎数
        /// <summary>
        /// <b>Example:</b>
        /// <para>4</para>
        /// </summary>
        [NameInMap("tire_number")]
        [Validation(Required=false)]
        public string TireNumber { get; set; }

        //  变速箱
        /// <summary>
        /// <b>Example:</b>
        /// <para>7挡双离合</para>
        /// </summary>
        [NameInMap("transmission")]
        [Validation(Required=false)]
        public string Transmission { get; set; }

        //  功率
        /// <summary>
        /// <b>Example:</b>
        /// <para>额定功率:70/峰值功率:160</para>
        /// </summary>
        [NameInMap("power")]
        [Validation(Required=false)]
        public string Power { get; set; }

        // 油耗
        /// <summary>
        /// <b>Example:</b>
        /// <para>5.80</para>
        /// </summary>
        [NameInMap("fuel_consumption")]
        [Validation(Required=false)]
        public string FuelConsumption { get; set; }

        // 环保标准
        /// <summary>
        /// <b>Example:</b>
        /// <para>国IV(国V)</para>
        /// </summary>
        [NameInMap("environmental_standards")]
        [Validation(Required=false)]
        public string EnvironmentalStandards { get; set; }

    }

}
