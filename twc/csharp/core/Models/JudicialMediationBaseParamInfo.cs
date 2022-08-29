// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 司法调解基础参数
    public class JudicialMediationBaseParamInfo : TeaModel {
        // 委托调解时长(天), 仅支持:30,60,90
        [NameInMap("mediation_day_limit")]
        [Validation(Required=true)]
        public long? MediationDayLimit { get; set; }

        // 调解总标的金额
        [NameInMap("mediation_total_amount")]
        [Validation(Required=true)]
        public string MediationTotalAmount { get; set; }

        // 可接受最低调解回款金额
        [NameInMap("min_amount")]
        [Validation(Required=true)]
        public string MinAmount { get; set; }

    }

}
