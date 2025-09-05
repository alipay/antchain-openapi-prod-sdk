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
        [NameInMap("clxh")]
        [Validation(Required=false)]
        public string Clxh { get; set; }

        // 发动机号
        [NameInMap("engine_code")]
        [Validation(Required=false)]
        public string EngineCode { get; set; }

        // 发动机型号
        [NameInMap("engine_model")]
        [Validation(Required=false)]
        public string EngineModel { get; set; }

        // 生产时间
        [NameInMap("production_time")]
        [Validation(Required=false)]
        public string ProductionTime { get; set; }

        // 品牌名称
        [NameInMap("brand_name")]
        [Validation(Required=false)]
        public string BrandName { get; set; }

        // 高尔夫(第七代,2014-)
        [NameInMap("series_name")]
        [Validation(Required=false)]
        public string SeriesName { get; set; }

        // 年款
        [NameInMap("model_year")]
        [Validation(Required=false)]
        public string ModelYear { get; set; }

        // 款型名称
        [NameInMap("vehicle_name")]
        [Validation(Required=false)]
        public string VehicleName { get; set; }

        // 指导价
        [NameInMap("guide_price")]
        [Validation(Required=false)]
        public string GuidePrice { get; set; }

        // 车身颜色
        [NameInMap("color")]
        [Validation(Required=false)]
        public string Color { get; set; }

        // 车型级别
        [NameInMap("vehicle_level")]
        [Validation(Required=false)]
        public string VehicleLevel { get; set; }

        // 车型种类
        [NameInMap("vehicle_type")]
        [Validation(Required=false)]
        public string VehicleType { get; set; }

        // 车身结构
        [NameInMap("body_struct")]
        [Validation(Required=false)]
        public string BodyStruct { get; set; }

        //  燃料种类
        [NameInMap("fuel_type")]
        [Validation(Required=false)]
        public string FuelType { get; set; }

        // 驱动方式
        [NameInMap("drive_way")]
        [Validation(Required=false)]
        public string DriveWay { get; set; }

        // 底盘型号-商用车用
        [NameInMap("chassis_model")]
        [Validation(Required=false)]
        public string ChassisModel { get; set; }

        // 排放标准
        [NameInMap("emission_standard")]
        [Validation(Required=false)]
        public string EmissionStandard { get; set; }

        // 排量
        [NameInMap("displacement")]
        [Validation(Required=false)]
        public string Displacement { get; set; }

        // 长
        [NameInMap("length")]
        [Validation(Required=false)]
        public string Length { get; set; }

        // 宽
        [NameInMap("width")]
        [Validation(Required=false)]
        public string Width { get; set; }

        // 高
        [NameInMap("height")]
        [Validation(Required=false)]
        public string Height { get; set; }

        // 总质量
        [NameInMap("total_mass")]
        [Validation(Required=false)]
        public string TotalMass { get; set; }

        // 整备质量
        [NameInMap("curb_weight")]
        [Validation(Required=false)]
        public string CurbWeight { get; set; }

        // 前轮距
        [NameInMap("tire_distance_before")]
        [Validation(Required=false)]
        public string TireDistanceBefore { get; set; }

        // 后轮距
        [NameInMap("tire_distance_after")]
        [Validation(Required=false)]
        public string TireDistanceAfter { get; set; }

        // 轴数
        [NameInMap("axes_number")]
        [Validation(Required=false)]
        public string AxesNumber { get; set; }

        // 轴距 
        [NameInMap("wheel_base")]
        [Validation(Required=false)]
        public string WheelBase { get; set; }

        // 座位数
        [NameInMap("seating_capacity")]
        [Validation(Required=false)]
        public string SeatingCapacity { get; set; }

        // 核定载质量
        [NameInMap("approved_load")]
        [Validation(Required=false)]
        public string ApprovedLoad { get; set; }

        // 准牵引总质量 
        [NameInMap("quasi_traction")]
        [Validation(Required=false)]
        public string QuasiTraction { get; set; }

        // 轮胎规格
        [NameInMap("tire_size")]
        [Validation(Required=false)]
        public string TireSize { get; set; }

        // 轮胎数
        [NameInMap("tire_number")]
        [Validation(Required=false)]
        public string TireNumber { get; set; }

        //  变速箱
        [NameInMap("transmission")]
        [Validation(Required=false)]
        public string Transmission { get; set; }

        //  功率
        [NameInMap("power")]
        [Validation(Required=false)]
        public string Power { get; set; }

        // 油耗
        [NameInMap("fuel_consumption")]
        [Validation(Required=false)]
        public string FuelConsumption { get; set; }

        // 环保标准
        [NameInMap("environmental_standards")]
        [Validation(Required=false)]
        public string EnvironmentalStandards { get; set; }

    }

}
