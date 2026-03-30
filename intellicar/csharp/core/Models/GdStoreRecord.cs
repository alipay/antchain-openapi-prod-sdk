// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 高德店铺基本系返回record
    public class GdStoreRecord : TeaModel {
        // 店铺ID
        [NameInMap("shop_id")]
        [Validation(Required=true)]
        public string ShopId { get; set; }

        // 店铺名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 店铺地址
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

        // 店铺所在省份
        [NameInMap("pname")]
        [Validation(Required=true)]
        public string Pname { get; set; }

        // 店铺所在城市
        [NameInMap("cityname")]
        [Validation(Required=true)]
        public string Cityname { get; set; }

        // 品牌id
        [NameInMap("brand_id")]
        [Validation(Required=true)]
        public string BrandId { get; set; }

        // 品牌名称
        [NameInMap("brand_name")]
        [Validation(Required=true)]
        public string BrandName { get; set; }

        // 经销商代码
        [NameInMap("office_code")]
        [Validation(Required=true)]
        public string OfficeCode { get; set; }

        // 经度
        [NameInMap("lon")]
        [Validation(Required=true)]
        public string Lon { get; set; }

        // 纬度
        [NameInMap("lat")]
        [Validation(Required=true)]
        public string Lat { get; set; }

        // 店铺数据版本集合
        [NameInMap("version_list")]
        [Validation(Required=true)]
        public List<string> VersionList { get; set; }

    }

}
