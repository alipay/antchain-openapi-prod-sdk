// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class SaveBusinessDepositEncryptRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务链对应的bizId    
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 要加密存储的内容
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

        // 用户did地址
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 业务唯一id，只需要本用户的应用唯一即可，因为最终会与用户的accountId拼接起来
        [NameInMap("key_id")]
        [Validation(Required=false)]
        public string KeyId { get; set; }

    }

}
