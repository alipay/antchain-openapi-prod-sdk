// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTC.Models
{
    public class ApplyOauthUserinfotokenRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // accessToken请求
        [NameInMap("access_token")]
        [Validation(Required=true)]
        public string AccessToken { get; set; }

        // 拉起页面的场景
        // nft_details 订单详情页
        // oauth_page 授权登陆页
        [NameInMap("page_token_scene")]
        [Validation(Required=true)]
        public string PageTokenScene { get; set; }

    }

}
