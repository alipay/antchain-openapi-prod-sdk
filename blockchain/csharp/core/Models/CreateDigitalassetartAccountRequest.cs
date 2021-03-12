// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateDigitalassetartAccountRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户手机号
        [NameInMap("phone")]
        [Validation(Required=true)]
        public string Phone { get; set; }

        // 用户的支付宝账号
        [NameInMap("user_account")]
        [Validation(Required=true)]
        public string UserAccount { get; set; }

        // 用户姓名
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

    }

}
