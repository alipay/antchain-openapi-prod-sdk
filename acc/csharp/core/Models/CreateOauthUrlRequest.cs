// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class CreateOauthUrlRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 回调地址
        [NameInMap("callback_url")]
        [Validation(Required=true)]
        public string CallbackUrl { get; set; }

        // 登录渠道(web,h5)
        [NameInMap("login_channel")]
        [Validation(Required=true)]
        public string LoginChannel { get; set; }

        // 客户端口令
        [NameInMap("client_token")]
        [Validation(Required=true)]
        public string ClientToken { get; set; }

    }

}
