// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class ConfirmIpPackagetradeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础请求参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // 审核账户ID
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 授权订单ID
        [NameInMap("ip_order_id")]
        [Validation(Required=true)]
        public string IpOrderId { get; set; }

        // 是否同意授权
        // 
        [NameInMap("confirm_result")]
        [Validation(Required=true)]
        public bool? ConfirmResult { get; set; }

    }

}
