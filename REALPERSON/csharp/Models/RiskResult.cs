// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    // 综合风险
    public class RiskResult : TeaModel {
        // 活体检测标签
        /// <summary>
        /// <b>Example:</b>
        /// <para>{}</para>
        /// </summary>
        [NameInMap("image_labels")]
        [Validation(Required=false)]
        public string ImageLabels { get; set; }

        // 设备风险等级
        /// <summary>
        /// <b>Example:</b>
        /// <para>safe</para>
        /// </summary>
        [NameInMap("device_risk_level")]
        [Validation(Required=false)]
        public string DeviceRiskLevel { get; set; }

        // 设备风险标签
        /// <summary>
        /// <b>Example:</b>
        /// <para>{}</para>
        /// </summary>
        [NameInMap("device_risk_labels")]
        [Validation(Required=false)]
        public string DeviceRiskLabels { get; set; }

        // 行为风险等级
        /// <summary>
        /// <b>Example:</b>
        /// <para>safe</para>
        /// </summary>
        [NameInMap("behavior_risk_level")]
        [Validation(Required=false)]
        public string BehaviorRiskLevel { get; set; }

        // 行为风险标签
        /// <summary>
        /// <b>Example:</b>
        /// <para>{}</para>
        /// </summary>
        [NameInMap("behavior_risk_labels")]
        [Validation(Required=false)]
        public string BehaviorRiskLabels { get; set; }

        // 是否关联攻击
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("is_correlate")]
        [Validation(Required=false)]
        public bool? IsCorrelate { get; set; }

    }

}
