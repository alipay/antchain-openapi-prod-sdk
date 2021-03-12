// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // VC链上传输结果
    public class VcTransmitResult : TeaModel {
        // 成功或者失败
        [NameInMap("is_success")]
        [Validation(Required=true)]
        public bool? IsSuccess { get; set; }

        // 失败信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 验证verifier did
        [NameInMap("target_verifier")]
        [Validation(Required=true)]
        public string TargetVerifier { get; set; }

        // 交易hash
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

    }

}
