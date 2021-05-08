// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    public class InitVerifyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 被授权机构ID（统一社会信用代码）
        [NameInMap("authorized_identity")]
        [Validation(Required=true)]
        public string AuthorizedIdentity { get; set; }

        // 核身发起端
        [NameInMap("authorized_platform_identity")]
        [Validation(Required=true)]
        public string AuthorizedPlatformIdentity { get; set; }

        // 刷脸产品类型
        [NameInMap("certification_type")]
        [Validation(Required=true)]
        public string CertificationType { get; set; }

        // 核身初始化请求信息
        [NameInMap("certification_request")]
        [Validation(Required=true)]
        public string CertificationRequest { get; set; }

    }

}
