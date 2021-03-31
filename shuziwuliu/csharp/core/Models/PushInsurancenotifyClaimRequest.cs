// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class PushInsurancenotifyClaimRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 通知类型：
        // claims_pay:理赔支付信息
        // claims_info: 理赔信息
        [NameInMap("category")]
        [Validation(Required=true, MaxLength=16)]
        public string Category { get; set; }

        // 通知内容
        [NameInMap("content")]
        [Validation(Required=true, MaxLength=3000)]
        public string Content { get; set; }

    }

}
