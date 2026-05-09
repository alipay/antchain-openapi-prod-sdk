// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // 风险评估因子明细
    public class RiskFactorDetail : TeaModel {
        // 风险评估因子类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>BLACKLIST</para>
        /// </summary>
        [NameInMap("factor_type")]
        [Validation(Required=false)]
        public string FactorType { get; set; }

        // 分数
        /// <summary>
        /// <b>Example:</b>
        /// <para>85</para>
        /// </summary>
        [NameInMap("score")]
        [Validation(Required=false)]
        public long? Score { get; set; }

        // 风险事件
        /// <summary>
        /// <b>Example:</b>
        /// <para>[&quot;关联账户被冻结&quot;, &quot;高频异常交易&quot;]</para>
        /// </summary>
        [NameInMap("evidence")]
        [Validation(Required=false)]
        public List<string> Evidence { get; set; }

    }

}
