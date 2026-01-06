// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 车辆业务价格
    public class CarBusinessPrice : TeaModel {
        // 品牌id
        [NameInMap("brand_id")]
        [Validation(Required=false)]
        public string BrandId { get; set; }

        // 品牌名称
        [NameInMap("brand_name")]
        [Validation(Required=false)]
        public string BrandName { get; set; }

        // 车系id
        [NameInMap("car_series_id")]
        [Validation(Required=false)]
        public string CarSeriesId { get; set; }

        // 车系名称
        [NameInMap("car_series")]
        [Validation(Required=false)]
        public string CarSeries { get; set; }

        // 车型id
        [NameInMap("car_id")]
        [Validation(Required=false)]
        public string CarId { get; set; }

        // 车型名称
        [NameInMap("car_name")]
        [Validation(Required=false)]
        public string CarName { get; set; }

        // 年款
        [NameInMap("car_year")]
        [Validation(Required=false)]
        public string CarYear { get; set; }

        // 城市code
        [NameInMap("city_code")]
        [Validation(Required=false)]
        public string CityCode { get; set; }

        // 城市名称
        [NameInMap("city_name")]
        [Validation(Required=false)]
        public string CityName { get; set; }

        // 车系指导价（范围值） 单位到分
        [NameInMap("series_guide_price")]
        [Validation(Required=false)]
        public string SeriesGuidePrice { get; set; }

        // 车型指导价（具体值）单位到分
        [NameInMap("official_price")]
        [Validation(Required=false)]
        public long? OfficialPrice { get; set; }

        // 车主成交价（具体值）单位到分
        [NameInMap("full_price")]
        [Validation(Required=false)]
        public long? FullPrice { get; set; }

        // 车主裸车价（具体值）单位到分
        [NameInMap("naked_price")]
        [Validation(Required=false)]
        public long? NakedPrice { get; set; }

        // 购置税（具体值）单位到分
        [NameInMap("purchase_tax")]
        [Validation(Required=false)]
        public long? PurchaseTax { get; set; }

        // 车船税（具体值）单位到分
        [NameInMap("vehicle_vessel_tax")]
        [Validation(Required=false)]
        public long? VehicleVesselTax { get; set; }

        // 商业险（具体值）单位到分
        [NameInMap("business_insurance")]
        [Validation(Required=false)]
        public long? BusinessInsurance { get; set; }

        // json 扩展字段
        [NameInMap("extra_content")]
        [Validation(Required=false)]
        public string ExtraContent { get; set; }

    }

}
