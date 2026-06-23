// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 成本法信息
    public class CostInfo : TeaModel {
        // 成本法原因
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("cost_reason")]
        [Validation(Required=false)]
        public string CostReason { get; set; }

        // 预期毛利率
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("predict_profit")]
        [Validation(Required=false)]
        public string PredictProfit { get; set; }

    }

}
