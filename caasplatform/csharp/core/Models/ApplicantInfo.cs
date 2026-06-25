// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAASPLATFORM.Models
{
    // 申请主体信息（公证处Identity结构）
    public class ApplicantInfo : TeaModel {
        // 用户类型：PERSON / ENTERPRISE
        [NameInMap("user_type")]
        [Validation(Required=true)]
        public string UserType { get; set; }

        // 用户名称
        [NameInMap("cert_name")]
        [Validation(Required=true)]
        public string CertName { get; set; }

        // 证件类型：IDENTITY_CARD/SOCIAL_CREDIT_CODE/MTP_HM/FOREIGN_PASSPORT/MTP_TW/ENTERPRISE_REGISTERED_NO
        [NameInMap("cert_doc_type")]
        [Validation(Required=true)]
        public string CertDocType { get; set; }

        // 证件号码
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 是否对证件号码脱敏，默认true
        [NameInMap("applicant_masking")]
        [Validation(Required=false)]
        public bool? ApplicantMasking { get; set; }

        // 手机号码
        [NameInMap("mobile_no")]
        [Validation(Required=false)]
        public string MobileNo { get; set; }

        // 法人姓名
        [NameInMap("legal_person")]
        [Validation(Required=false)]
        public string LegalPerson { get; set; }

        // 法人身份证
        [NameInMap("legal_person_id")]
        [Validation(Required=false)]
        public string LegalPersonId { get; set; }

        // 经办人姓名
        [NameInMap("agent")]
        [Validation(Required=false)]
        public string Agent { get; set; }

        // 经办人身份证
        [NameInMap("agent_id")]
        [Validation(Required=false)]
        public string AgentId { get; set; }

    }

}
