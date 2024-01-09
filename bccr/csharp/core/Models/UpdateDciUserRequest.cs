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

    }

}
