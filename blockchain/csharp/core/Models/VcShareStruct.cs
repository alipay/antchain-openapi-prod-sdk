// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 分享可验证声明时的核心内容
    public class VcShareStruct : TeaModel {
        // 分享的目标VC的id
        [NameInMap("vc_id")]
        [Validation(Required=true)]
        public string VcId { get; set; }

        // 目标的VC持有者的did
        [NameInMap("owner_did")]
        [Validation(Required=true)]
        public string OwnerDid { get; set; }

        // 在支持声明的claim字段级别分享能力时使用，可以指定哪些字段隐藏，哪些字段分享。示例中标记为”1“的是隐藏，”0“的是分享明文。
        [NameInMap("index")]
        [Validation(Required=false)]
        public string Index { get; set; }

        // 非托管模式下owner_did的签名，作为授权凭证
        [NameInMap("signature")]
        [Validation(Required=false)]
        public string Signature { get; set; }

    }

}
