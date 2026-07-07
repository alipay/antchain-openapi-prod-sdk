// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class UpdateDciUserRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // dci用户ID
        [NameInMap("dci_user_id")]
        [Validation(Required=true)]
        public string DciUserId { get; set; }

        // 证件正面oss fileId
        [NameInMap("cert_front_file_id")]
        [Validation(Required=true)]
        public string CertFrontFileId { get; set; }

        // 证件背面oss fileId
        [NameInMap("cert_back_file_id")]
        [Validation(Required=false)]
        public string CertBackFileId { get; set; }

        // 手机号
        [NameInMap("phone")]
        [Validation(Required=false)]
        public string Phone { get; set; }

        // 客户端令牌
        [NameInMap("client_token")]
        [Validation(Required=false)]
        public string ClientToken { get; set; }

        // 版权认证方式:UGC-用户生成内容，AIGC-AI生成内容，SOFTWARE_WORKS-软件作品认证，如果不传默认为UGC
        [NameInMap("copyright_certification_type")]
        [Validation(Required=false)]
        public string CopyrightCertificationType { get; set; }

        // 法人信息
        [NameInMap("legal_person_info")]
        [Validation(Required=false)]
        public EnterpriseLegalPersonInfo LegalPersonInfo { get; set; }

        // true,false
        [NameInMap("long_term_valid")]
        [Validation(Required=false)]
        public bool? LongTermValid { get; set; }

        // 证件有效期开始时间
        [NameInMap("certificate_start_time")]
        [Validation(Required=false)]
        public string CertificateStartTime { get; set; }

        // 证件有效期终止时间
        [NameInMap("certificate_end_time")]
        [Validation(Required=false)]
        public string CertificateEndTime { get; set; }

        // 成立日期或出生日期
        [NameInMap("identity_start_time")]
        [Validation(Required=false)]
        public string IdentityStartTime { get; set; }

        // 地址信息
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 著作权人名称
        [NameInMap("cert_name")]
        [Validation(Required=false)]
        public string CertName { get; set; }

        // 著作权人证件号
        [NameInMap("certificate_number")]
        [Validation(Required=false)]
        public string CertificateNumber { get; set; }

        // 著作权人证件类型
        [NameInMap("certificate_type")]
        [Validation(Required=false)]
        public string CertificateType { get; set; }

    }

}
