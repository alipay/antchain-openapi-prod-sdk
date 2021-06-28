// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    public class VerifyCpfAuthRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务流水
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 用户身份证ID
        [NameInMap("data_owner_identity")]
        [Validation(Required=true)]
        public string DataOwnerIdentity { get; set; }

        // 授权机构ID
        [NameInMap("authorized_identity")]
        [Validation(Required=true)]
        public string AuthorizedIdentity { get; set; }

        // 授权端ID
        [NameInMap("authorized_platform_identity")]
        [Validation(Required=true)]
        public string AuthorizedPlatformIdentity { get; set; }

        // 授权业务码
        [NameInMap("target_code")]
        [Validation(Required=true)]
        public string TargetCode { get; set; }

        // 授权协议
        [NameInMap("auth_agreement")]
        [Validation(Required=true)]
        public AuthAgreement AuthAgreement { get; set; }

        // 扩展参数
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

    }

}
