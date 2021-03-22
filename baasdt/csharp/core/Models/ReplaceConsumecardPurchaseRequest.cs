// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class ReplaceConsumecardPurchaseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequest BaseRequest { get; set; }

        // 交易ID
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 附言(补发商品信息)
        [NameInMap("remark")]
        [Validation(Required=true)]
        public string Remark { get; set; }

    }

}
