// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // air引擎输出的决策域信息
    public class AirDomainInfos : TeaModel {
        // 决策域信息
        [NameInMap("domain_code")]
        [Validation(Required=false)]
        public string DomainCode { get; set; }

        // 决策域信息
        [NameInMap("domain_decision")]
        [Validation(Required=false)]
        public string DomainDecision { get; set; }

        // 决策流输出
        [NameInMap("decision_flows")]
        [Validation(Required=false)]
        public List<AirDecisionFlows> DecisionFlows { get; set; }

    }

}
