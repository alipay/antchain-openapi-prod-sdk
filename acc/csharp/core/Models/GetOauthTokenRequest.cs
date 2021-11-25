// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class GetOauthTokenRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 授权类型
        [NameInMap("grant_type")]
        [Validation(Required=true)]
        public string GrantType { get; set; }

        // 授权码
        [NameInMap("auth_code")]
        [Validation(Required=true)]
        public string AuthCode { get; set; }

        // client端申请oauth时的口令
        [NameInMap("client_token")]
        [Validation(Required=true)]
        public string ClientToken { get; set; }

        // 过期时间
        [NameInMap("expires")]
        [Validation(Required=false)]
        public long? Expires { get; set; }

    }

}
