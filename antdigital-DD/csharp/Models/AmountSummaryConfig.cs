// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 发票申请额度配置
    public class AmountSummaryConfig : TeaModel {
        // 汇总KEY
        /// <summary>
        /// <b>Example:</b>
        /// <para>2334445</para>
        /// </summary>
        [NameInMap("summary_key")]
        [Validation(Required=true)]
        public string SummaryKey { get; set; }

        // 汇总金额，单位为元
        /// <summary>
        /// <b>Example:</b>
        /// <para>230</para>
        /// </summary>
        [NameInMap("summary_value")]
        [Validation(Required=true)]
        public string SummaryValue { get; set; }

    }

}
