// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class ApplyChainUseDeclarationRequest : TeaModel {
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

        // 选择其他类型时，用户输入（必填）
        [NameInMap("chain_purpose_extend")]
        [Validation(Required=false)]
        public string ChainPurposeExtend { get; set; }

        // 简短说明用途
        // 
        // 选择其他类型时，用户输入
        [NameInMap("chain_purpose_item")]
        [Validation(Required=false)]
        public string ChainPurposeItem { get; set; }

    }

}
