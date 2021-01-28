// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateContractCommontriggerRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 代扣规则详情
        [NameInMap("repayment_order_info")]
        [Validation(Required=true)]
        public List<RepaymentOrderRequest> RepaymentOrderInfo { get; set; }

        // 合同id
        [NameInMap("flow_id")]
        [Validation(Required=true)]
        public string FlowId { get; set; }

        // 用户在智能合同平台的身份
        [NameInMap("user_tuid")]
        [Validation(Required=true)]
        public string UserTuid { get; set; }

    }

}
