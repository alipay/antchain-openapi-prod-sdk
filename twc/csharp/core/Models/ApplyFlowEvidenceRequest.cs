// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class ApplyFlowEvidenceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 流程id
        [NameInMap("flow_id")]
        [Validation(Required=true)]
        public string FlowId { get; set; }

        // 证据包类型，默认为ChainEvidencePack(链上证据包)，按需填写，目前支持ChainEvidencePack(链上证据包)，其他包括LocalEvidencePack(链下证据包)，链下证据包前置依赖链上证据包，因此填写链下证据包会先生成链上证据包。
        // 链上证据包，即全流程所有阶段存证关系链上固化，生成全流程链上证据统一txHash；
        // 链下证据包，即全流程所有内容生成链下压缩包文件。
        [NameInMap("evidence_pack_type")]
        [Validation(Required=true)]
        public string EvidencePackType { get; set; }

    }

}
