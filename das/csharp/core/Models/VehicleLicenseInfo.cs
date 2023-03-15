// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 行驶证证信息
    public class VehicleLicenseInfo : TeaModel {
        // 品牌名称
        [NameInMap("brand_name")]
        [Validation(Required=false)]
        public string BrandName { get; set; }

        // 车身颜色
        [NameInMap("body_color")]
        [Validation(Required=false)]
        public string BodyColor { get; set; }

        // 使用性质
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

        // 车型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 车辆类型
        [NameInMap("vehicle_type")]
        [Validation(Required=false)]
        public string VehicleType { get; set; }

        // 发动机号
        [NameInMap("engine_number")]
        [Validation(Required=false)]
        public string EngineNumber { get; set; }

        // 发动机型号
        [NameInMap("engine_model")]
        [Validation(Required=false)]
        public string EngineModel { get; set; }

        // 初次登记日期
        [NameInMap("first_registry_date")]
        [Validation(Required=false)]
        public string FirstRegistryDate { get; set; }

        // 检验失效日期
        [NameInMap("inspection_expire_date")]
        [Validation(Required=false)]
        public string InspectionExpireDate { get; set; }

        // 车辆状态
        [NameInMap("vehicle_status")]
        [Validation(Required=false)]
        public string VehicleStatus { get; set; }

        // 核定载客数
        [NameInMap("passengers")]
        [Validation(Required=false)]
        public string Passengers { get; set; }

        // 强制报废期止
        [NameInMap("retirement_date")]
        [Validation(Required=false)]
        public string RetirementDate { get; set; }

        // 燃料种类
        [NameInMap("fuel_type")]
        [Validation(Required=false)]
        public string FuelType { get; set; }

        // 排量
        [NameInMap("displacement")]
        [Validation(Required=false)]
        public string Displacement { get; set; }

        // 出厂日期
        [NameInMap("pps_date")]
        [Validation(Required=false)]
        public string PpsDate { get; set; }

        // 最大功率
        [NameInMap("maximum_power")]
        [Validation(Required=false)]
        public string MaximumPower { get; set; }

        // 轴数
        [NameInMap("shaft")]
        [Validation(Required=false)]
        public string Shaft { get; set; }

        // 轴距
        [NameInMap("wheel_base")]
        [Validation(Required=false)]
        public string WheelBase { get; set; }

        // 前轮距
        [NameInMap("front_tread")]
        [Validation(Required=false)]
        public string FrontTread { get; set; }

        // 后轮距
        [NameInMap("rear_tread")]
        [Validation(Required=false)]
        public string RearTread { get; set; }

        // 总重量
        [NameInMap("cross_weight")]
        [Validation(Required=false)]
        public string CrossWeight { get; set; }

        // 整备质量
        [NameInMap("curb_weight")]
        [Validation(Required=false)]
        public string CurbWeight { get; set; }

        // 核定载质量
        [NameInMap("load_weight")]
        [Validation(Required=false)]
        public string LoadWeight { get; set; }

        // 车架号
        [NameInMap("vin")]
        [Validation(Required=false)]
        public string Vin { get; set; }

        // 车牌号
        [NameInMap("plate_number")]
        [Validation(Required=false)]
        public string PlateNumber { get; set; }

        // 车牌种类
        [NameInMap("plate_type")]
        [Validation(Required=false)]
        public string PlateType { get; set; }

        // 检车日期
        [NameInMap("inspection_date")]
        [Validation(Required=false)]
        public string InspectionDate { get; set; }

    }

}
