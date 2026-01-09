// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    // 车辆资产验证简版车辆信息
    public class CarInfoBrief : TeaModel {
        // 生产时间
        [NameInMap("production_time")]
        [Validation(Required=false)]
        public string ProductionTime { get; set; }

        // 品牌名称
        [NameInMap("brand_name")]
        [Validation(Required=false)]
        public string BrandName { get; set; }

        // 车系名称
        [NameInMap("series_name")]
        [Validation(Required=false)]
        public string SeriesName { get; set; }

        // 燃料种类
        [NameInMap("fuel_type")]
        [Validation(Required=false)]
        public string FuelType { get; set; }

        // 轴数
        [NameInMap("axes_number")]
        [Validation(Required=false)]
        public string AxesNumber { get; set; }

        // 轴距
        [NameInMap("wheel_base")]
        [Validation(Required=false)]
        public string WheelBase { get; set; }

        // 排量描述
        [NameInMap("engine_describe")]
        [Validation(Required=false)]
        public string EngineDescribe { get; set; }

        // 车身颜色
        [NameInMap("color")]
        [Validation(Required=false)]
        public string Color { get; set; }

        // 年款
        [NameInMap("year_pattern")]
        [Validation(Required=false)]
        public string YearPattern { get; set; }

        // 生产厂商
        [NameInMap("manufacturer_name")]
        [Validation(Required=false)]
        public string ManufacturerName { get; set; }

        // 发布年月
        [NameInMap("publish_date")]
        [Validation(Required=false)]
        public string PublishDate { get; set; }

        // 款型
        [NameInMap("sale_code")]
        [Validation(Required=false)]
        public string SaleCode { get; set; }

        // 驱动形式
        [NameInMap("drive_form")]
        [Validation(Required=false)]
        public string DriveForm { get; set; }

        // 国产/进口/合资
        [NameInMap("import_flag")]
        [Validation(Required=false)]
        public string ImportFlag { get; set; }

        // 后轮距
        [NameInMap("tire_distance_after")]
        [Validation(Required=false)]
        public string TireDistanceAfter { get; set; }

        // 排量
        [NameInMap("displacement")]
        [Validation(Required=false)]
        public string Displacement { get; set; }

        // 排放标准
        [NameInMap("emission_standard")]
        [Validation(Required=false)]
        public string EmissionStandard { get; set; }

        // 功率
        [NameInMap("power")]
        [Validation(Required=false)]
        public string Power { get; set; }

        // 变速箱类型
        [NameInMap("gearbox")]
        [Validation(Required=false)]
        public string Gearbox { get; set; }

        // 车辆类型
        [NameInMap("vehicle_type")]
        [Validation(Required=false)]
        public string VehicleType { get; set; }

        // 发动机型号
        [NameInMap("engine_model")]
        [Validation(Required=false)]
        public string EngineModel { get; set; }

        // 轮胎数
        [NameInMap("tire_count")]
        [Validation(Required=false)]
        public string TireCount { get; set; }

        // 座位数
        [NameInMap("rated_passengers")]
        [Validation(Required=false)]
        public string RatedPassengers { get; set; }

        // 指导价
        [NameInMap("guided_price")]
        [Validation(Required=false)]
        public string GuidedPrice { get; set; }

        // 车长
        [NameInMap("length")]
        [Validation(Required=false)]
        public string Length { get; set; }

        // 车宽
        [NameInMap("width")]
        [Validation(Required=false)]
        public string Width { get; set; }

        // 车高
        [NameInMap("height")]
        [Validation(Required=false)]
        public string Height { get; set; }

        // 整备质量
        [NameInMap("curb_weight")]
        [Validation(Required=false)]
        public string CurbWeight { get; set; }

        // 总质量
        [NameInMap("total_weight")]
        [Validation(Required=false)]
        public string TotalWeight { get; set; }

        // 前轮距
        [NameInMap("tire_distance_before")]
        [Validation(Required=false)]
        public string TireDistanceBefore { get; set; }

        // 额定载重量
        [NameInMap("rated_plyload")]
        [Validation(Required=false)]
        public string RatedPlyload { get; set; }

        // 牵引总质量
        [NameInMap("trailer_weight")]
        [Validation(Required=false)]
        public string TrailerWeight { get; set; }

    }

}
