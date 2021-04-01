// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartDidIdentificationFaceauthRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 认证类型,枚举值 PC_AUTH、APP_AUTH
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public string AuthType { get; set; }

        // 颁发证书的subject did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 用户身份信息
        [NameInMap("identity_param")]
        [Validation(Required=true)]
        public IdentityParam IdentityParam { get; set; }

        // 认证接口回调路径，POST接口 请求示例： { "certifyId":"0242de204e1a2c3ed6ee5e21d8a57a4c", "did":"xxxxx","vcId":"xxxxx" }
        [NameInMap("return_url")]
        [Validation(Required=false)]
        public string ReturnUrl { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
