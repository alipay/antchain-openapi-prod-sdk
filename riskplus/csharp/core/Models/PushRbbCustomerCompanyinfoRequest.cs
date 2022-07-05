// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class PushRbbCustomerCompanyinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 企业的统一社会信用代码
        [NameInMap("uc_code")]
        [Validation(Required=false)]
        public string UcCode { get; set; }

        // 企业名称
        [NameInMap("company_name")]
        [Validation(Required=false)]
        public string CompanyName { get; set; }

        // 企业信息的类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 企业信息的内容
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

    }

}
