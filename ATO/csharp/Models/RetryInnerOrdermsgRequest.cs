// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class RetryInnerOrdermsgRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // SANDBOX 沙箱 PROD 生产
        [NameInMap("env")]
        [Validation(Required=true)]
        public string Env { get; set; }

        // 订单id
        // 
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 消息ID
        // 
        [NameInMap("msg_id")]
        [Validation(Required=true)]
        public string MsgId { get; set; }

        // 使用租户新回调地址
        [NameInMap("using_new_callback_url")]
        [Validation(Required=true)]
        public bool? UsingNewCallbackUrl { get; set; }

    }

}
