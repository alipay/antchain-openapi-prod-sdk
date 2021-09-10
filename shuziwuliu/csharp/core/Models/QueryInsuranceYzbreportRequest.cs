// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class QueryInsuranceYzbreportRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 保司编码，PAIC---平安
        // 
        [NameInMap("external_channel_code")]
        [Validation(Required=true, MaxLength=10)]
        public string ExternalChannelCode { get; set; }

        // 保单号
        [NameInMap("policy_no")]
        [Validation(Required=true, MaxLength=200)]
        public string PolicyNo { get; set; }

        // 报案号
        [NameInMap("report_no")]
        [Validation(Required=true, MaxLength=100)]
        public string ReportNo { get; set; }

    }

}
