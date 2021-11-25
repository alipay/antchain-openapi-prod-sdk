// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class CreateDidRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // ⾃定义唯⼀id
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 租户类型
        // 
        [NameInMap("tenant_type")]
        [Validation(Required=true)]
        public string TenantType { get; set; }

        // 认证类型，企业：FIRM，个人：PERSON
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 企业营业执照号(当认证类型为企业时为必传)
        [NameInMap("cert_reg_num")]
        [Validation(Required=false)]
        public string CertRegNum { get; set; }

        // 法人姓名
        [NameInMap("legal_name")]
        [Validation(Required=false)]
        public string LegalName { get; set; }

        // 法人身份证号
        [NameInMap("legal_cert_num")]
        [Validation(Required=false)]
        public string LegalCertNum { get; set; }

        // 企业名称(当认证类型为企业时为必传)
        [NameInMap("firm_name")]
        [Validation(Required=false)]
        public string FirmName { get; set; }

        // 个人email
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 个人身份证号
        [NameInMap("cert_num")]
        [Validation(Required=true)]
        public string CertNum { get; set; }

        // 个人手机号
        [NameInMap("phone")]
        [Validation(Required=false)]
        public string Phone { get; set; }

        // 个人姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 个人did(当认证类型为企业时为必传)
        [NameInMap("user_did")]
        [Validation(Required=false)]
        public string UserDid { get; set; }

    }

}
