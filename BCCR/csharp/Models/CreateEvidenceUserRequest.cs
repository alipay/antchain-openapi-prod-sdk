// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class CreateEvidenceUserRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 取证主体证件名称
        [NameInMap("cert_name")]
        [Validation(Required=true)]
        public string CertName { get; set; }

        // 取证主体证件号
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 用户类型（个人/企业）
        [NameInMap("user_type")]
        [Validation(Required=true)]
        public string UserType { get; set; }

        // 法人姓名（企业用户必填）
        [NameInMap("legal_person_cert_name")]
        [Validation(Required=false)]
        public string LegalPersonCertName { get; set; }

        // 法人证件号（企业用户必填）
        [NameInMap("legal_person_cert_no")]
        [Validation(Required=false)]
        public string LegalPersonCertNo { get; set; }

        // 取证操作人证件姓名（企业用户必填）
        [NameInMap("operator_name")]
        [Validation(Required=false)]
        public string OperatorName { get; set; }

        // 取证操作人证件号（企业用户必填）
        [NameInMap("operator_cert_no")]
        [Validation(Required=false)]
        public string OperatorCertNo { get; set; }

        // 幂等字段
        [NameInMap("client_token")]
        [Validation(Required=true)]
        public string ClientToken { get; set; }

    }

}
