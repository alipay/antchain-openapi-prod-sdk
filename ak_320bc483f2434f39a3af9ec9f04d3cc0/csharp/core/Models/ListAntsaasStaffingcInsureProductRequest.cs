// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models
{
    public class ListAntsaasStaffingcInsureProductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 企业名称
        [NameInMap("enterprise_name")]
        [Validation(Required=true)]
        public string EnterpriseName { get; set; }

        // 统一社会信用代码
        [NameInMap("social_credit_code")]
        [Validation(Required=true)]
        public string SocialCreditCode { get; set; }

        // 保险场景码: 
        // FLEXIBLE_EMPLOYMENT-日单（实时生效）
        // INITIATIVE_EMPLOYMENT-长期（次日0点生效）
        [NameInMap("biz_code")]
        [Validation(Required=true)]
        public string BizCode { get; set; }

        // 险种编码:
        //  ACCIDENT: 意外险
        //  EMPLOYER_LIABILITY: 雇主险
        [NameInMap("insurance_type_code")]
        [Validation(Required=true)]
        public string InsuranceTypeCode { get; set; }

    }

}
