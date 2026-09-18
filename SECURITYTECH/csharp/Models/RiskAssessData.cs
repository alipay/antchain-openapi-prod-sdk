// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 风险评估响应结果
    public class RiskAssessData : TeaModel {
        // 响应头
        [NameInMap("head")]
        [Validation(Required=true)]
        public ResponseHead Head { get; set; }

        // 风险评估结果
        /// <summary>
        /// <b>Example:</b>
        /// <para>A238EE36A9E096A97BF49C568EE7D0F4543043E21CE1A9831303EFDD</para>
        /// </summary>
        [NameInMap("risk_result")]
        [Validation(Required=true)]
        public string RiskResult { get; set; }

    }

}
