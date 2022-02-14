// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class PushPrivatecontractGaugeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 私有云合同服务实例ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 计量数量
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

        // 本次上报的唯一订单幂等ID，用流程ID和文件ID拼接生成
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

    }

}
