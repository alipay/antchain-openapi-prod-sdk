// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateBclPayeeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 企业证件姓名
        [NameInMap("cert_name")]
        [Validation(Required=true, MaxLength=96)]
        public string CertName { get; set; }

        // 企业证件号
        [NameInMap("cert_no")]
        [Validation(Required=true, MaxLength=32)]
        public string CertNo { get; set; }

        // 企业证件类型
        // unified_social_credit_code（统一社会信用代码）
        // enterprise_registered_number（企业工商注册号）
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 企业法定代表人名称
        [NameInMap("legal_person_cert_name")]
        [Validation(Required=true, MaxLength=32)]
        public string LegalPersonCertName { get; set; }

        // 企业法定代表人证件号
        [NameInMap("legal_person_cert_no")]
        [Validation(Required=true, MaxLength=32)]
        public string LegalPersonCertNo { get; set; }

    }

}
