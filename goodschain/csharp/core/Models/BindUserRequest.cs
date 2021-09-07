// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GOODSCHAIN.Models
{
    public class BindUserRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 支付宝：ALIPAY
        [NameInMap("platform")]
        [Validation(Required=true)]
        public string Platform { get; set; }

        // 开放平台用户id
        [NameInMap("open_id")]
        [Validation(Required=true)]
        public string OpenId { get; set; }

    }

}
