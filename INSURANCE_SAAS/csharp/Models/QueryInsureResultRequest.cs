// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class QueryInsureResultRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 保险产品编码
        [NameInMap("trustworthy_value_insurance_type_code")]
        [Validation(Required=true)]
        public string TrustworthyValueInsuranceTypeCode { get; set; }

        // 保司编码
        [NameInMap("insurance_company_no")]
        [Validation(Required=true)]
        public string InsuranceCompanyNo { get; set; }

        // 通知单号,投保申请时会返回
        [NameInMap("notice_no")]
        [Validation(Required=true)]
        public string NoticeNo { get; set; }

    }

}
