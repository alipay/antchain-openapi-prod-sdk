// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    // AIGC风险专项检测
    public class AigcRiskResult : TeaModel {
        // AIGC风险检测评分
        /// <summary>
        /// <b>Example:</b>
        /// <para>safe</para>
        /// </summary>
        [NameInMap("aigc_risk_level")]
        [Validation(Required=false)]
        public string AigcRiskLevel { get; set; }

        // 图像伪造分数
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.2</para>
        /// </summary>
        [NameInMap("deepfake_score")]
        [Validation(Required=false)]
        public string DeepfakeScore { get; set; }

        // 图像伪造结论
        /// <summary>
        /// <b>Example:</b>
        /// <para>T</para>
        /// </summary>
        [NameInMap("deepfake_result")]
        [Validation(Required=false)]
        public string DeepfakeResult { get; set; }

        // 视频伪造分数
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.2</para>
        /// </summary>
        [NameInMap("video_forgery_score")]
        [Validation(Required=false)]
        public string VideoForgeryScore { get; set; }

        // 视频伪造结论
        /// <summary>
        /// <b>Example:</b>
        /// <para>T</para>
        /// </summary>
        [NameInMap("video_forgery_result")]
        [Validation(Required=false)]
        public string VideoForgeryResult { get; set; }

    }

}
