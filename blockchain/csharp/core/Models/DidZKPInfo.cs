// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // did中使用ZKP生成证明需要的信息
    public class DidZKPInfo : TeaModel {
        // 需要生成证明的路径
        [NameInMap("path")]
        [Validation(Required=true)]
        public string Path { get; set; }

        // 生成ZKP证明的公共信息
        [NameInMap("public_inputs")]
        [Validation(Required=true)]
        public string PublicInputs { get; set; }

        // zkp方法
        [NameInMap("zkp_type")]
        [Validation(Required=true)]
        public string ZkpType { get; set; }

    }

}
