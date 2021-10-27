// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 企业四要素校验
    public class CompanyFourMetaInfo : TeaModel {
        // 企业证件名称
        [NameInMap("company_cert_name")]
        [Validation(Required=true)]
        public string CompanyCertName { get; set; }

        // 企业证件号码
        [NameInMap("company_cert_no")]
        [Validation(Required=true)]
        public string CompanyCertNo { get; set; }

        // 证件类型, 默认社会统一信用代码  NATIONAL_LEGAL_MERGE:统一社会信用代码，NATIONAL_LEGAL：营业执照号码
        [NameInMap("company_cert_type")]
        [Validation(Required=false)]
        public string CompanyCertType { get; set; }

        // 法人证件名称
        [NameInMap("legal_person_cert_name")]
        [Validation(Required=true)]
        public string LegalPersonCertName { get; set; }

        // 法人证件号码
        [NameInMap("legal_person_cert_no")]
        [Validation(Required=true)]
        public string LegalPersonCertNo { get; set; }

        // 法人证件类型 RESIDENT：居民身份证号，PASSPORT：护照，MILITARY：军官证
        [NameInMap("legal_person_cert_type")]
        [Validation(Required=false)]
        public string LegalPersonCertType { get; set; }

    }

}
