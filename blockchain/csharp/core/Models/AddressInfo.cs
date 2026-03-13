// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 经营地址
    public class AddressInfo : TeaModel {
        // 城市编码
        [NameInMap("city_code")]
        [Validation(Required=true)]
        public string CityCode { get; set; }

        // 区县编码
        [NameInMap("district_code")]
        [Validation(Required=true)]
        public string DistrictCode { get; set; }

        // 地址
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

        // 省份编码
        [NameInMap("province_code")]
        [Validation(Required=true)]
        public string ProvinceCode { get; set; }

        // 高德 poiid
        [NameInMap("poiid")]
        [Validation(Required=false)]
        public string Poiid { get; set; }

        // 经度
        [NameInMap("longitude")]
        [Validation(Required=false)]
        public string Longitude { get; set; }

        // 纬度
        [NameInMap("latitude")]
        [Validation(Required=false)]
        public string Latitude { get; set; }

        // 地址类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
