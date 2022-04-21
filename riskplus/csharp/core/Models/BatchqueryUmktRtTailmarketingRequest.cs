// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class BatchqueryUmktRtTailmarketingRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 营销计划id
        [NameInMap("plan_id")]
        [Validation(Required=true)]
        public long? PlanId { get; set; }

        // 	
        // 用户列表传输模版
        [NameInMap("query_template")]
        [Validation(Required=true)]
        public string QueryTemplate { get; set; }

        // 	
        // 用户查询凭证列表
        [NameInMap("customer_keys")]
        [Validation(Required=true)]
        public List<string> CustomerKeys { get; set; }

        // 业务方流水号
        [NameInMap("biz_serial_no")]
        [Validation(Required=true)]
        public string BizSerialNo { get; set; }

    }

}
