// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 可信存证身份识别信息
    public class Identity : TeaModel {
        // 经办人姓名，企业认证必选
        [NameInMap("agent")]
        [Validation(Required=false)]
        public string Agent { get; set; }

        // 经办人身份证
        [NameInMap("agent_id")]
        [Validation(Required=false)]
        public string AgentId { get; set; }

        // 用户名称
        [NameInMap("cert_name")]
        [Validation(Required=true)]
        public string CertName { get; set; }

        // 证件号
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 证件类型，个人只支持身份证IDENTITY_CARD，企业支持UNIFIED_SOCIAL_CREDIT_CODE（统一社会信用代码）和ENTERPRISE_REGISTERED_NUMBER（企业工商注册号
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 法人姓名，企业认证必选
        [NameInMap("legal_person")]
        [Validation(Required=false)]
        public string LegalPerson { get; set; }

        // 法人身份证,  企业认证必选
        [NameInMap("legal_person_id")]
        [Validation(Required=false)]
        public string LegalPersonId { get; set; }

        // 用户手机号码
        [NameInMap("mobile_no")]
        [Validation(Required=false)]
        public string MobileNo { get; set; }

        // 扩展属性
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

        // 用户类型，PERSON或者ENTERPRISE
        [NameInMap("user_type")]
        [Validation(Required=true)]
        public string UserType { get; set; }

    }

}
