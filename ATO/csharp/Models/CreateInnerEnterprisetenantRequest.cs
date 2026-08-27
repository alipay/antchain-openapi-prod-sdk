// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class CreateInnerEnterprisetenantRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 企业id
        [NameInMap("enterprise_id")]
        [Validation(Required=true)]
        public string EnterpriseId { get; set; }

        // 企业全称
        [NameInMap("company_name")]
        [Validation(Required=true)]
        public string CompanyName { get; set; }

        // 统一社会信用代码
        [NameInMap("tax_registration_no")]
        [Validation(Required=true)]
        public string TaxRegistrationNo { get; set; }

    }

}
