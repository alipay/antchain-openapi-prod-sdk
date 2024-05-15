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
        [NameInMap("lca_stage")]
        [Validation(Required=true)]
        public string LcaStage { get; set; }

        // 阶段排放占比
        [NameInMap("lca_stage_carbon_rate")]
        [Validation(Required=true)]
        public string LcaStageCarbonRate { get; set; }

        // 阶段排放量
        [NameInMap("lca_stage_carbon_emissions")]
        [Validation(Required=true)]
        public string LcaStageCarbonEmissions { get; set; }

        // 阶段评估明细数据
        [NameInMap("lca_assessment_datum")]
        [Validation(Required=true)]
        public List<EnterpriseLcaAssessmentItem> LcaAssessmentDatum { get; set; }

    }

}
