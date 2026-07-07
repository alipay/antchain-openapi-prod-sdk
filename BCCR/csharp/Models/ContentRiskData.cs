// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 安全识别结果
    public class ContentRiskData : TeaModel {
        // 风险名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>风险名称</para>
        /// </summary>
        [NameInMap("risk_name")]
        [Validation(Required=true)]
        public string RiskName { get; set; }

        // 风险是否通过审查
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("risk_result")]
        [Validation(Required=true)]
        public bool? RiskResult { get; set; }

    }

}
