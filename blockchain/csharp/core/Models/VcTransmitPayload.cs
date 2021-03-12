// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // Vc可信传输实际参数
    public class VcTransmitPayload : TeaModel {
        // 目标did相关信息列表
        [NameInMap("target_verifier")]
        [Validation(Required=true)]
        public List<VcTransmitTargetStruct> TargetVerifier { get; set; }

        // 要传输的vc_id
        [NameInMap("vc_id")]
        [Validation(Required=true)]
        public string VcId { get; set; }

        // vc原文，如果vc原文出现在传输接口，那么VC仓库不会从本地查找，而是直接将传输的VC上链
        [NameInMap("vc_content")]
        [Validation(Required=false)]
        public string VcContent { get; set; }

    }

}
