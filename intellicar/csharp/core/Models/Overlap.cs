// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 高德潜客record重叠指数
    public class Overlap : TeaModel {
        // 重叠指数uv指数
        [NameInMap("uv")]
        [Validation(Required=true)]
        public GdCustomerUv Uv { get; set; }

        // 重叠指数pv指数
        [NameInMap("pv")]
        [Validation(Required=true)]
        public GdCustomerPv Pv { get; set; }

        // 重叠品牌id
        [NameInMap("brand_id")]
        [Validation(Required=true)]
        public string BrandId { get; set; }

        // 重叠店铺id，数据类型为店铺时返回该属性与值
        [NameInMap("shop_id")]
        [Validation(Required=true)]
        public string ShopId { get; set; }

        // 重叠城市编码，数据类型为城市时返回该属性与值
        [NameInMap("citycode")]
        [Validation(Required=true)]
        public string Citycode { get; set; }

    }

}
