// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTX.Models
{
    public class ApplyOauthTokenRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 1.authorization_code，表示换取使用用户授权码code换取授权令牌access_token。
        // 2.refresh_token，表示使用refresh_token刷新获取新授权令牌。
        // 本期只支持authorization_code
        [NameInMap("grant_type")]
        [Validation(Required=true)]
        public string GrantType { get; set; }

        // 授权码，用户对应用授权后得到。
        // 本参数在 grant_type 为 authorization_code 时必填；为 refresh_token 时不填。
        [NameInMap("auth_code")]
        [Validation(Required=false)]
        public string AuthCode { get; set; }

        // 刷新令牌，上次换取访问令牌时得到。本参数在 grant_type 为 authorization_code 时不填；为 refresh_token 时必填
        [NameInMap("refresh_token")]
        [Validation(Required=false)]
        public string RefreshToken { get; set; }

    }

}
