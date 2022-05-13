// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class ExistStubRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 流程id
        [NameInMap("flow_id")]
        [Validation(Required=true)]
        public string FlowId { get; set; }

        // 客户id。支付宝情况下传支付宝id，2088打头；景区情况下为自定义的客户id
        [NameInMap("customer_id")]
        [Validation(Required=true)]
        public string CustomerId { get; set; }

        // 景区名称
        [NameInMap("scene_name")]
        [Validation(Required=true)]
        public string SceneName { get; set; }

    }

}
