// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // identity parameter
    public class IdentityParam : TeaModel {
        // 经办人姓名
        [NameInMap("agent")]
        [Validation(Required=false)]
        public string Agent { get; set; }

        // 经办人身份证号
        [NameInMap("agent_id")]
        [Validation(Required=false)]
        public string AgentId { get; set; }

        // 用户的姓名
        [NameInMap("cert_name")]
        [Validation(Required=true)]
        public string CertName { get; set; }

        // 用户的身份证号
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 用户证件类型，目前只支持IDENTITY_CARD
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 法人姓名，企业认证必选
        [NameInMap("legal_person")]
        [Validation(Required=false)]
        public string LegalPerson { get; set; }

        // 法人身份证，企业认证必选
        [NameInMap("legal_person_id")]
        [Validation(Required=false)]
        public string LegalPersonId { get; set; }

        // 手机号码
        [NameInMap("mobile_no")]
        [Validation(Required=false)]
        public string MobileNo { get; set; }

        // 扩展属性字段
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

        // 用户类型，默认为PERSON
        [NameInMap("user_type")]
        [Validation(Required=false)]
        public string UserType { get; set; }

    }

}
