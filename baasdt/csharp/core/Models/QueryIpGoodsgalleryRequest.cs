// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryIpGoodsgalleryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // 账户链上ID
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // IP链上ID，只有版权方可以根据IPID查询图库信息
        [NameInMap("ip_id")]
        [Validation(Required=false)]
        public string IpId { get; set; }

        // IP授权订单ID，版权方和商家均可根据订单ID查询图库信息
        [NameInMap("ip_order_id")]
        [Validation(Required=false)]
        public string IpOrderId { get; set; }

    }

}
