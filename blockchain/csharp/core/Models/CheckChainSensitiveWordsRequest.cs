// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CheckChainSensitiveWordsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用途KEY
        [NameInMap("chain_purpose_key")]
        [Validation(Required=true)]
        public string ChainPurposeKey { get; set; }

        // 敏感词检查条目内容
        [NameInMap("chain_purpose_item")]
        [Validation(Required=true)]
        public string ChainPurposeItem { get; set; }

    }

}
