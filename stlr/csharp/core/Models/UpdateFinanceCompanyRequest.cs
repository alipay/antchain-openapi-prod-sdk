// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class UpdateFinanceCompanyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 银行碳账户
        [NameInMap("enterprise_no")]
        [Validation(Required=true)]
        public string EnterpriseNo { get; set; }

        // 企业统一信用代码
        [NameInMap("company_id")]
        [Validation(Required=true)]
        public string CompanyId { get; set; }

        // 企业或者项目名称
        [NameInMap("company_name")]
        [Validation(Required=true)]
        public string CompanyName { get; set; }

        // 行业编码
        [NameInMap("industry_code")]
        [Validation(Required=true)]
        public string IndustryCode { get; set; }

        // 地区编码
        [NameInMap("area_code")]
        [Validation(Required=true)]
        public string AreaCode { get; set; }

    }

}
