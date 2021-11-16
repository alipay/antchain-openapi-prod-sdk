// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 存证关联实体（个人/企业）的身份识别信息
    public class NotaryUser : TeaModel {
        // 用户类型，PERSON或者ENTERPRISE
        [NameInMap("user_type")]
        [Validation(Required=true)]
        public string UserType { get; set; }

        // 证件类型
        // ● 个人：支持身份证IDENTITY_CARD
        // ● 企业：支持UNIFIED_SOCIAL_CREDIT_CODE（统一社会信用代码）和ENTERPRISE_REGISTERED_NUMBER（企业工商注册号）
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 证件用户名称
        // ● 个人：身份证姓名
        // ● 企业：企业名称
        [NameInMap("cert_name")]
        [Validation(Required=true)]
        public string CertName { get; set; }

        // 证件号
        // ● 个人：身份证号
        // ● 企业：社会统一信用代码或企业工商注册号，与证件类型保持一致即可
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 个人必填，用户手机号码
        [NameInMap("person_mobile_no")]
        [Validation(Required=false)]
        public string PersonMobileNo { get; set; }

        // 企业选填，法人证件类型，仅支持身份证，IDENTITY_CARD
        [NameInMap("legal_person_cert_type")]
        [Validation(Required=false)]
        public string LegalPersonCertType { get; set; }

        // 企业选填，法人身份证姓名
        [NameInMap("legal_person_cert_name")]
        [Validation(Required=false)]
        public string LegalPersonCertName { get; set; }

        // 企业选填，法人身份证号
        [NameInMap("legal_person_cert_no")]
        [Validation(Required=false)]
        public string LegalPersonCertNo { get; set; }

        // 企业选填，法人手机号
        [NameInMap("legal_person_mobile_no")]
        [Validation(Required=false)]
        public string LegalPersonMobileNo { get; set; }

        // 扩展属性
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

    }

}
