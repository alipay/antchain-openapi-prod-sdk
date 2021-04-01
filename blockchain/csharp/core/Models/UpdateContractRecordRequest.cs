// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class UpdateContractRecordRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // abi对应oss key
        [NameInMap("abi_oss_key")]
        [Validation(Required=true)]
        public string AbiOssKey { get; set; }

        // 区块链唯一标识
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

        // bytecode对应oss key
        [NameInMap("bytecode_oss_key")]
        [Validation(Required=true)]
        public string BytecodeOssKey { get; set; }

        // 16进制表示的合约identity
        [NameInMap("identity")]
        [Validation(Required=true)]
        public string Identity { get; set; }

    }

}
