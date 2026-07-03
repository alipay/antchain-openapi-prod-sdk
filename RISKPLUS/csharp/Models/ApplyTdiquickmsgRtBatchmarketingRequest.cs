// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class ApplyTdiquickmsgRtBatchmarketingRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景策略id
        [NameInMap("scene_strategy_id")]
        [Validation(Required=true)]
        public long? SceneStrategyId { get; set; }

        // 	
        // 外部流水号
        [NameInMap("out_serial_no")]
        [Validation(Required=true)]
        public string OutSerialNo { get; set; }

        // 	
        // 用户标识类型
        [NameInMap("param_type")]
        [Validation(Required=true)]
        public string ParamType { get; set; }

        // 批量透传字段
        [NameInMap("out_info")]
        [Validation(Required=false)]
        public string OutInfo { get; set; }

        // 用户凭证列表
        [NameInMap("customer_details")]
        [Validation(Required=true)]
        public List<CustomerDetail> CustomerDetails { get; set; }

    }

}
