// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class RegisterDevicecorpCustomerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 项目code
        [NameInMap("project_code")]
        [Validation(Required=true)]
        public string ProjectCode { get; set; }

        // 企业名称
        [NameInMap("company_name")]
        [Validation(Required=true)]
        public string CompanyName { get; set; }

        // 企业品牌名称
        [NameInMap("company_brand_name")]
        [Validation(Required=true)]
        public string CompanyBrandName { get; set; }

        // 主联系人
        [NameInMap("contacts")]
        [Validation(Required=false)]
        public string Contacts { get; set; }

        // 主联系方式
        [NameInMap("contact_number")]
        [Validation(Required=false)]
        public string ContactNumber { get; set; }

    }

}
