// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class SavePlatformDepositDepositRequest : TeaModel {
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

        // 存证数据
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

        // 用户的did地址
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 任意用户自定义的keyId(需要唯一)，根据该keyId可以查找存证的内容，若不填则使用txHash作为keyId
        [NameInMap("key_id")]
        [Validation(Required=true)]
        public string KeyId { get; set; }

    }

}
