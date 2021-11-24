// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class QueryInsuranceEpolicyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 投保返回的交易流水号
        [NameInMap("apply_trade_no")]
        [Validation(Required=true, MaxLength=50)]
        public string ApplyTradeNo { get; set; }

        // 保司编码
        [NameInMap("external_channel_code")]
        [Validation(Required=true, MaxLength=64)]
        public string ExternalChannelCode { get; set; }

        // 保单号
        [NameInMap("policy_no")]
        [Validation(Required=true, MaxLength=64)]
        public string PolicyNo { get; set; }

    }

}
