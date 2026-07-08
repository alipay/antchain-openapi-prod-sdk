// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 阶段评估数据明细
    public class EnterpriseLcaStageAssessmentItem : TeaModel {
        // LCA阶段
        /// <summary>
        /// <b>Example:</b>
        /// <para>ProductManufacture</para>
        /// </summary>
        [NameInMap("lca_stage")]
        [Validation(Required=true)]
        public string LcaStage { get; set; }

        // 阶段排放占比
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("lca_stage_carbon_rate")]
        [Validation(Required=true)]
        public string LcaStageCarbonRate { get; set; }

        // 阶段排放量
        /// <summary>
        /// <b>Example:</b>
        /// <para>123.12</para>
        /// </summary>
        [NameInMap("lca_stage_carbon_emissions")]
        [Validation(Required=true)]
        public string LcaStageCarbonEmissions { get; set; }

        // 阶段评估明细数据
        [NameInMap("lca_assessment_datum")]
        [Validation(Required=true)]
        public List<EnterpriseLcaAssessmentItem> LcaAssessmentDatum { get; set; }

    }

}
