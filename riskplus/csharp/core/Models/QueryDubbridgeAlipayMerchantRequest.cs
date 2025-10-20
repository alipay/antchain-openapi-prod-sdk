// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeAlipayMerchantRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // request请求单号，每次请求唯一，如uuid
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 入驻申请单号，store_id二选一
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 门店id，配合traffic_platform使用
        [NameInMap("store_id")]
        [Validation(Required=false)]
        public string StoreId { get; set; }

        // 门店所属子品牌，配合store_id使用
        [NameInMap("traffic_platform")]
        [Validation(Required=false)]
        public string TrafficPlatform { get; set; }

    }

}
