// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateDistributionUserRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户在ISV中的唯一标识
        [NameInMap("identity")]
        [Validation(Required=true)]
        public string Identity { get; set; }

        // 其他说明
        [NameInMap("info")]
        [Validation(Required=false)]
        public string Info { get; set; }

        // 用户手机号码
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 来源: 微信朋友圈/微信小程序/支付宝小程序/H5/商户自有APP/其他
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

    }

}
