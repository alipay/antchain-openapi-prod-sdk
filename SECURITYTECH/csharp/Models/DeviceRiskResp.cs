// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 设备风险查询data
    public class DeviceRiskResp : TeaModel {
        // apdid
        /// <summary>
        /// <b>Example:</b>
        /// <para>.</para>
        /// </summary>
        [NameInMap("apdid")]
        [Validation(Required=true)]
        public string Apdid { get; set; }

        // apdid_token
        /// <summary>
        /// <b>Example:</b>
        /// <para>.</para>
        /// </summary>
        [NameInMap("apdid_token")]
        [Validation(Required=true)]
        public string ApdidToken { get; set; }

        // risk_level
        /// <summary>
        /// <b>Example:</b>
        /// <para>.</para>
        /// </summary>
        [NameInMap("risk_level")]
        [Validation(Required=true)]
        public long? RiskLevel { get; set; }

        // risk_desc
        /// <summary>
        /// <b>Example:</b>
        /// <para>.</para>
        /// </summary>
        [NameInMap("risk_desc")]
        [Validation(Required=true)]
        public string RiskDesc { get; set; }

        // sug_action
        /// <summary>
        /// <b>Example:</b>
        /// <para>.</para>
        /// </summary>
        [NameInMap("sug_action")]
        [Validation(Required=true)]
        public string SugAction { get; set; }

        // risk_labels
        /// <summary>
        /// <b>Example:</b>
        /// <para>.</para>
        /// </summary>
        [NameInMap("risk_labels")]
        [Validation(Required=true)]
        public List<string> RiskLabels { get; set; }

    }

}
