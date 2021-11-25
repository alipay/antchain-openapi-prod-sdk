// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class DetailFlowPhaseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 流程id，通过twc.notary.instance.create(创建存证流程实例)获取
        [NameInMap("flow_id")]
        [Validation(Required=true)]
        public string FlowId { get; set; }

        // 阶段ID，通过twc.notary.flow.phase.create(创建阶段存证)创建了阶段存证获取
        [NameInMap("phase_id")]
        [Validation(Required=true)]
        public string PhaseId { get; set; }

        // 链上交易Hash，必须成功阶段存证后，通过twc.notary.flow.phase.query获取
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

    }

}
