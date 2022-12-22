// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryAuthIdentityauthRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 授权宝生成的bizId 与 核身token 用 ; 拼接成的字符串
        [NameInMap("security_id")]
        [Validation(Required=true)]
        public string SecurityId { get; set; }

        // 核身的userid
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 核身对应的操作类型，目前只有0，代表创建did
        [NameInMap("operation_type")]
        [Validation(Required=true)]
        public long? OperationType { get; set; }

        // 其它类型操作时的参数，json形式字符串
        [NameInMap("params")]
        [Validation(Required=false)]
        public string Params { get; set; }

    }

}
