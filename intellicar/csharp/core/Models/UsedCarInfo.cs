// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 二手车
    public class UsedCarInfo : TeaModel {
        // 渠道方线索业务id
        [NameInMap("lead_id")]
        [Validation(Required=true)]
        public string LeadId { get; set; }

        // 城市名称
        [NameInMap("city_name")]
        [Validation(Required=true)]
        public string CityName { get; set; }

        // 省份id
        [NameInMap("pid")]
        [Validation(Required=true)]
        public string Pid { get; set; }

        // 城市id
        [NameInMap("cid")]
        [Validation(Required=true)]
        public string Cid { get; set; }

        // 品牌名称
        [NameInMap("brand_name")]
        [Validation(Required=false)]
        public string BrandName { get; set; }

        // 车系名称
        [NameInMap("series_name")]
        [Validation(Required=false)]
        public string SeriesName { get; set; }

        // 汽车之家车型id
        [NameInMap("spec_id")]
        [Validation(Required=true)]
        public string SpecId { get; set; }

        // 车型名称
        [NameInMap("spec_name")]
        [Validation(Required=false)]
        public string SpecName { get; set; }

        // 首次上牌时间格式 yyyy/MM/dd
        [NameInMap("first_reg_time")]
        [Validation(Required=true)]
        public string FirstRegTime { get; set; }

        // 行驶公里数(km)
        [NameInMap("mileage")]
        [Validation(Required=true)]
        public string Mileage { get; set; }

    }

}
