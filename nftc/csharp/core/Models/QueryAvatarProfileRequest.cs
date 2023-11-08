// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTC.Models
{
    public class QueryAvatarProfileRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 在antchain.nftc.oauth.token.apply接口内获取到的AccessToken，带过期时间，可唯一确定当前用户
        [NameInMap("access_token")]
        [Validation(Required=true)]
        public string AccessToken { get; set; }

    }

}
