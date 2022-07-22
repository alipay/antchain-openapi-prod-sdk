// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateStubClearingRequest : TeaModel {
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

        // 待分账金额，单位：分。如传100，即为100分，1元
        [NameInMap("stub_amount")]
        [Validation(Required=true)]
        public long? StubAmount { get; set; }

        // 清分状态，CLEARING_SUCCESS（清分成功）；CLEARING_FAIL（清分失败）；CLEARING_NONEED（不需要进行清分）
        [NameInMap("clearing_status")]
        [Validation(Required=true)]
        public string ClearingStatus { get; set; }

        // 数字票根计量字段，当clearing_status为CLEARING_SUCCESS时，该字段必填
        [NameInMap("metric_info")]
        [Validation(Required=false)]
        public MetricInfo MetricInfo { get; set; }

    }

}
