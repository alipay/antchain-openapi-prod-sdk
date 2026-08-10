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
        /// <summary>
        /// <b>Example:</b>
        /// <para>2015-11-16</para>
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

        // 车系名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>高尔夫</para>
        /// </summary>
        [NameInMap("series_name")]
        [Validation(Required=false)]
        public string SeriesName { get; set; }

        // 燃料种类
        /// <summary>
        /// <b>Example:</b>
        /// <para>汽油</para>
        /// </summary>
        [NameInMap("fuel_type")]
        [Validation(Required=false)]
        public string FuelType { get; set; }

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
        /// <para>2915</para>
        /// </summary>
        [NameInMap("wheel_base")]
        [Validation(Required=false)]
        public string WheelBase { get; set; }

        // 排量描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.3L</para>
        /// </summary>
        [NameInMap("engine_describe")]
        [Validation(Required=false)]
        public string EngineDescribe { get; set; }

        // 车身颜色
        /// <summary>
        /// <b>Example:</b>
        /// <para>黑</para>
        /// </summary>
        [NameInMap("color")]
        [Validation(Required=false)]
        public string Color { get; set; }

        // 年款
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018</para>
        /// </summary>
        [NameInMap("year_pattern")]
        [Validation(Required=false)]
        public string YearPattern { get; set; }

        // 生产厂商
        /// <summary>
        /// <b>Example:</b>
        /// <para>上海通用汽车有限公司</para>
        /// </summary>
        [NameInMap("manufacturer_name")]
        [Validation(Required=false)]
        public string ManufacturerName { get; set; }

        // 发布年月
        /// <summary>
        /// <b>Example:</b>
        /// <para>201711</para>
        /// </summary>
        [NameInMap("publish_date")]
        [Validation(Required=false)]
        public string PublishDate { get; set; }

        // 款型
        /// <summary>
        /// <b>Example:</b>
        /// <para>赛欧3 1.3L 手动挡 舒适天窗版 18款</para>
        /// </summary>
        [NameInMap("sale_code")]
        [Validation(Required=false)]
        public string SaleCode { get; set; }

        // 驱动形式
        /// <summary>
        /// <b>Example:</b>
        /// <para>驱动形式</para>
        /// </summary>
        [NameInMap("drive_form")]
        [Validation(Required=false)]
        public string DriveForm { get; set; }

        // 国产/进口/合资
        /// <summary>
        /// <b>Example:</b>
        /// <para>合资</para>
        /// </summary>
        [NameInMap("import_flag")]
        [Validation(Required=false)]
        public string ImportFlag { get; set; }

        // 后轮距
        /// <summary>
        /// <b>Example:</b>
        /// <para>1468</para>
        /// </summary>
        [NameInMap("tire_distance_after")]
        [Validation(Required=false)]
        public string TireDistanceAfter { get; set; }

        // 排量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1349</para>
        /// </summary>
        [NameInMap("displacement")]
        [Validation(Required=false)]
        public string Displacement { get; set; }

        // 排放标准
        /// <summary>
        /// <b>Example:</b>
        /// <para>国五</para>
        /// </summary>
        [NameInMap("emission_standard")]
        [Validation(Required=false)]
        public string EmissionStandard { get; set; }

        // 功率
        /// <summary>
        /// <b>Example:</b>
        /// <para>73</para>
        /// </summary>
        [NameInMap("power")]
        [Validation(Required=false)]
        public string Power { get; set; }

        // 变速箱类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>手动档</para>
        /// </summary>
        [NameInMap("gearbox")]
        [Validation(Required=false)]
        public string Gearbox { get; set; }

        // 车辆类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>轿车</para>
        /// </summary>
        [NameInMap("vehicle_type")]
        [Validation(Required=false)]
        public string VehicleType { get; set; }

        // 发动机型号
        /// <summary>
        /// <b>Example:</b>
        /// <para>LEW</para>
        /// </summary>
        [NameInMap("engine_model")]
        [Validation(Required=false)]
        public string EngineModel { get; set; }

        // 轮胎数
        /// <summary>
        /// <b>Example:</b>
        /// <para>4</para>
        /// </summary>
        [NameInMap("tire_count")]
        [Validation(Required=false)]
        public string TireCount { get; set; }

        // 座位数
        /// <summary>
        /// <b>Example:</b>
        /// <para>5</para>
        /// </summary>
        [NameInMap("rated_passengers")]
        [Validation(Required=false)]
        public string RatedPassengers { get; set; }

        // 指导价
        /// <summary>
        /// <b>Example:</b>
        /// <para>5.69万</para>
        /// </summary>
        [NameInMap("guided_price")]
        [Validation(Required=false)]
        public string GuidedPrice { get; set; }

        // 车长
        /// <summary>
        /// <b>Example:</b>
        /// <para>4300</para>
        /// </summary>
        [NameInMap("length")]
        [Validation(Required=false)]
        public string Length { get; set; }

        // 车宽
        /// <summary>
        /// <b>Example:</b>
        /// <para>1735</para>
        /// </summary>
        [NameInMap("width")]
        [Validation(Required=false)]
        public string Width { get; set; }

        // 车高
        /// <summary>
        /// <b>Example:</b>
        /// <para>1504</para>
        /// </summary>
        [NameInMap("height")]
        [Validation(Required=false)]
        public string Height { get; set; }

        // 整备质量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1045</para>
        /// </summary>
        [NameInMap("curb_weight")]
        [Validation(Required=false)]
        public string CurbWeight { get; set; }

        // 总质量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1460</para>
        /// </summary>
        [NameInMap("total_weight")]
        [Validation(Required=false)]
        public string TotalWeight { get; set; }

        // 前轮距
        /// <summary>
        /// <b>Example:</b>
        /// <para>1477</para>
        /// </summary>
        [NameInMap("tire_distance_before")]
        [Validation(Required=false)]
        public string TireDistanceBefore { get; set; }

        // 额定载重量
        /// <summary>
        /// <b>Example:</b>
        /// <para>5</para>
        /// </summary>
        [NameInMap("rated_plyload")]
        [Validation(Required=false)]
        public string RatedPlyload { get; set; }

        // 牵引总质量
        /// <summary>
        /// <b>Example:</b>
        /// <para>3</para>
        /// </summary>
        [NameInMap("trailer_weight")]
        [Validation(Required=false)]
        public string TrailerWeight { get; set; }

    }

}
