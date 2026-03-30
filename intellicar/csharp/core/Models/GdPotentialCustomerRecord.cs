// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 高德潜客指数record
    public class GdPotentialCustomerRecord : TeaModel {
        // uv指数
        [NameInMap("uv")]
        [Validation(Required=true)]
        public GdCustomerUv Uv { get; set; }

        // 城市编码，数据类型为店铺或者城市时返回该属性与值
        [NameInMap("citycode")]
        [Validation(Required=false)]
        public string Citycode { get; set; }

        // pv指数
        [NameInMap("pv")]
        [Validation(Required=true)]
        public GdCustomerPv Pv { get; set; }

        // 店铺id，数据类型为店铺时返回该属性与值
        [NameInMap("shop_id")]
        [Validation(Required=false)]
        public string ShopId { get; set; }

        // 品牌id
        [NameInMap("brand_id")]
        [Validation(Required=true)]
        public string BrandId { get; set; }

        // 店铺数量（dataType!=SHOP时返回该字段）
        [NameInMap("shop_num")]
        [Validation(Required=false)]
        public long? ShopNum { get; set; }

        // 时间（时间类型为天时：yyyyMMdd；时间类型为周时：yyyyWW；时间类型为月时：yyyyMM）
        [NameInMap("time")]
        [Validation(Required=true)]
        public string Time { get; set; }

        // 省份编码，数据类型为省份时返回该属性与值
        [NameInMap("pcode")]
        [Validation(Required=false)]
        public string Pcode { get; set; }

        // 数据类型为全国时返回该属性与值
        [NameInMap("countrycode")]
        [Validation(Required=false)]
        public string Countrycode { get; set; }

    }

}
