// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class PushRbbCustomerStatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 统一社会信用代码
        [NameInMap("credit_code")]
        [Validation(Required=true)]
        public string CreditCode { get; set; }

        // 相关产品id
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 企业名称
        [NameInMap("company_name")]
        [Validation(Required=true)]
        public string CompanyName { get; set; }

        // 状态编号
        [NameInMap("status_code")]
        [Validation(Required=true)]
        public string StatusCode { get; set; }

        // 状态文本
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
