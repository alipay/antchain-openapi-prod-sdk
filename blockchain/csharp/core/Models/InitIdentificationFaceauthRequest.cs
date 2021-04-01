// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class InitIdentificationFaceauthRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 认证类型,枚举值
        // PC_AUTH、APP_AUTH
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public string AuthType { get; set; }

        //    用户身份信息
        [NameInMap("identity_param")]
        [Validation(Required=true)]
        public IdentityParam IdentityParam { get; set; }

        // 认证接口回调路径，POST接口
        // 请求示例：
        // {
        //   "certifyId":"0242de204e1a2c3ed6ee5e21d8a57a4c",
        //   "status":3,
        // }
        [NameInMap("return_url")]
        [Validation(Required=false)]
        public string ReturnUrl { get; set; }

    }

}
