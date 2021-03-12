// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // VC传输确认
    public class VcTransmitCnf : TeaModel {
        // 针对tx_hash的签名
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

        // 交易hash
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // vc传输目标did
        [NameInMap("verifier_id")]
        [Validation(Required=true)]
        public string VerifierId { get; set; }

    }

}
