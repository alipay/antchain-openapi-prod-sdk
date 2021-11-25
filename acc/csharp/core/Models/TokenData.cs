// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    // 返回数据结构体
    public class TokenData : TeaModel {
        // 授权token
        [NameInMap("access_token")]
        [Validation(Required=true)]
        public string AccessToken { get; set; }

        // 授权类型
        [NameInMap("token_type")]
        [Validation(Required=true)]
        public string TokenType { get; set; }

        // 过期时间
        [NameInMap("expiresln")]
        [Validation(Required=true)]
        public long? Expiresln { get; set; }

        // 重新刷新Token
        [NameInMap("refresh_token")]
        [Validation(Required=true)]
        public string RefreshToken { get; set; }

        // sessionid
        [NameInMap("session_id")]
        [Validation(Required=false)]
        public string SessionId { get; set; }

    }

}
