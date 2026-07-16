// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 模型结果详情
    public class RiskModel : TeaModel {
        // 风险场景编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>风险场景编码</para>
        /// </summary>
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 该风险场景的风险分值
        /// <summary>
        /// <b>Example:</b>
        /// <para>该风险场景的风险分值</para>
        /// </summary>
        [NameInMap("score")]
        [Validation(Required=true)]
        public string Score { get; set; }

        // 逾期率
        /// <summary>
        /// <b>Example:</b>
        /// <para>2%</para>
        /// </summary>
        [NameInMap("delinquency_rate")]
        [Validation(Required=false)]
        public string DelinquencyRate { get; set; }

        // 风险建议
        /// <summary>
        /// <b>Example:</b>
        /// <para>风险等级低，建议快速通过</para>
        /// </summary>
        [NameInMap("risk_advice")]
        [Validation(Required=false)]
        public string RiskAdvice { get; set; }

        // 风险等级
        /// <summary>
        /// <b>Example:</b>
        /// <para>rank1</para>
        /// </summary>
        [NameInMap("risk_rank")]
        [Validation(Required=false)]
        public string RiskRank { get; set; }

        // 流程id
        /// <summary>
        /// <b>Example:</b>
        /// <para>10000009000001804441658067824640</para>
        /// </summary>
        [NameInMap("flow_id")]
        [Validation(Required=true)]
        public string FlowId { get; set; }

        // 拒量模型捞回分
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.00570491</para>
        /// </summary>
        [NameInMap("mob_three_score")]
        [Validation(Required=false)]
        public string MobThreeScore { get; set; }

        // 拒量模型首逾分
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.00570491</para>
        /// </summary>
        [NameInMap("fpd_thirty_score")]
        [Validation(Required=false)]
        public string FpdThirtyScore { get; set; }

    }

}
