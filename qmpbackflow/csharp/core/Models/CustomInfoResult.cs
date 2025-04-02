// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 客户信息结果
    public class CustomInfoResult : TeaModel {
        // 社会信用代码
        [NameInMap("credit_code")]
        [Validation(Required=true)]
        public string CreditCode { get; set; }

        // 公司名称
        [NameInMap("company_name")]
        [Validation(Required=true)]
        public string CompanyName { get; set; }

        // 法人姓名
        [NameInMap("legal_name")]
        [Validation(Required=true)]
        public string LegalName { get; set; }

        // 身份证号
        [NameInMap("id_card")]
        [Validation(Required=true)]
        public string IdCard { get; set; }

        // 手机号
        [NameInMap("phone_number")]
        [Validation(Required=true)]
        public string PhoneNumber { get; set; }

        // 账号
        [NameInMap("account")]
        [Validation(Required=true)]
        public string Account { get; set; }

        // 密码
        [NameInMap("password")]
        [Validation(Required=true)]
        public string Password { get; set; }

    }

}
