// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class AddDciUsernocertRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户名称
        [NameInMap("certificate_name")]
        [Validation(Required=true)]
        public string CertificateName { get; set; }

        // 证件类型
        [NameInMap("certificate_type")]
        [Validation(Required=true)]
        public string CertificateType { get; set; }

        // 证件号
        [NameInMap("certificate_number")]
        [Validation(Required=true)]
        public string CertificateNumber { get; set; }

        // 企业用户必填
        [NameInMap("legal_person_cert_name")]
        [Validation(Required=false)]
        public string LegalPersonCertName { get; set; }

        // 企业用户必填
        [NameInMap("legal_person_cert_type")]
        [Validation(Required=false)]
        public string LegalPersonCertType { get; set; }

        // 企业用户必填
        [NameInMap("legal_person_cert_no")]
        [Validation(Required=false)]
        public string LegalPersonCertNo { get; set; }

        // 手机号
        [NameInMap("phone")]
        [Validation(Required=true)]
        public string Phone { get; set; }

        // 代理信息
        [NameInMap("proxy_data")]
        [Validation(Required=false)]
        public ProxyData ProxyData { get; set; }

        // 幂等字段
        [NameInMap("client_token")]
        [Validation(Required=true)]
        public string ClientToken { get; set; }

    }

}
