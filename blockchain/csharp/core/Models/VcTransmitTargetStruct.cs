// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // VC可信传输时，指定的目标did信息
    public class VcTransmitTargetStruct : TeaModel {
        // 目标did的公钥
        [NameInMap("public_key")]
        [Validation(Required=false)]
        public string PublicKey { get; set; }

        // 传输vc使用的区块链id
        [NameInMap("vc_channel")]
        [Validation(Required=false, MaxLength=32)]
        public string VcChannel { get; set; }

        // 验证者did
        [NameInMap("verifier_did")]
        [Validation(Required=true)]
        public string VerifierDid { get; set; }

    }

}
