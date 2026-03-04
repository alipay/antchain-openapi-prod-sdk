// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class QueryTwevCarRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单id（tuid+brandId与orderid条件必填。orderid为空时，tuid+brandId必填。orderId不为空时优先使用orderId）
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 车辆中控号 （tuid+brandId与orderid条件必填。orderid为空时，tuid+brandId必填。orderId不为空时优先使用orderId）
        [NameInMap("tuid")]
        [Validation(Required=false)]
        public string Tuid { get; set; }

        // 品牌id（tuid+brandId与orderid条件必填。orderid为空时，tuid+brandId必填。orderId不为空时优先使用orderId）
        [NameInMap("brand_id")]
        [Validation(Required=false)]
        public string BrandId { get; set; }

        // 预留扩展字段 json
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

    }

}
