// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // air引擎决策流输出信息
    public class AirDecisionFlows : TeaModel {
        // 决策结果
        [NameInMap("decision")]
        [Validation(Required=false)]
        public string Decision { get; set; }

        // air引擎输出的infoCodes信息
        [NameInMap("info_codes")]
        [Validation(Required=false)]
        public List<AirInfoCodes> InfoCodes { get; set; }

        // 策略名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

    }

}
