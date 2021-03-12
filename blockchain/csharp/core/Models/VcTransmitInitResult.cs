// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // vc传输初始化结果
    public class VcTransmitInitResult : TeaModel {
        // 初始化成功与否
        [NameInMap("is_success")]
        [Validation(Required=true)]
        public bool? IsSuccess { get; set; }

        // 失败时返回的额外信息
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

        // 接受者did
        [NameInMap("target_verifier")]
        [Validation(Required=true)]
        public string TargetVerifier { get; set; }

        // 待签名的交易hash
        [NameInMap("need_signature_tx_hash")]
        [Validation(Required=true)]
        public string NeedSignatureTxHash { get; set; }

    }

}
