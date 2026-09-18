// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 人脸盾结果
    public class FaceShieldResult : TeaModel {
        // 设备token
        /// <summary>
        /// <b>Example:</b>
        /// <para>uYxLZlL5YGpLvdwO5+4pyCkjgf3/FF4XxOqzrmG/XY+jyFilhgEAAA==</para>
        /// </summary>
        [NameInMap("apdid_token")]
        [Validation(Required=true)]
        public string ApdidToken { get; set; }

        // 风险等级，-1参数异常，0无风险，1-3表示低、中、高
        /// <summary>
        /// <b>Example:</b>
        /// <para>3</para>
        /// </summary>
        [NameInMap("risk_level")]
        [Validation(Required=true)]
        public long? RiskLevel { get; set; }

        // 风险描述，对风险等级的补充
        /// <summary>
        /// <b>Example:</b>
        /// <para>本次咨询设备风险水平很高,风险编号:10000010.8.0</para>
        /// </summary>
        [NameInMap("risk_desc")]
        [Validation(Required=true)]
        public string RiskDesc { get; set; }

        // 处理的建议，如PAAS
        /// <summary>
        /// <b>Example:</b>
        /// <para>建议直接拦截</para>
        /// </summary>
        [NameInMap("sug_action")]
        [Validation(Required=true)]
        public string SugAction { get; set; }

    }

}
