// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class VerifyUserPwdRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 登录账号
        [NameInMap("login_id")]
        [Validation(Required=true)]
        public string LoginId { get; set; }

        // 登录密码
        [NameInMap("password")]
        [Validation(Required=true)]
        public string Password { get; set; }

        // 过期时间指定(单位 秒)，默认30分钟
        [NameInMap("expires")]
        [Validation(Required=false)]
        public long? Expires { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 公钥名称
        [NameInMap("pubkey_name")]
        [Validation(Required=true)]
        public string PubkeyName { get; set; }

    }

}
