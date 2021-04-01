// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class ExecOcpTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 事件类型：开通（AF_OPEN）、变更（AF_MODIFY）、释放（AF_RELEASE）、创建（AF_PROVISION）、停止（AF_STOP）、恢复（AF_RESUME）等。
        [NameInMap("event")]
        [Validation(Required=true)]
        public string Event { get; set; }

        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 订单号码
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 请求平台来源
        [NameInMap("platform")]
        [Validation(Required=true)]
        public string Platform { get; set; }

        // 产品码
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 产品规格
        [NameInMap("specification")]
        [Validation(Required=true)]
        public string Specification { get; set; }

        // 租户Id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

    }

}
