// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 减排情况统计
    public class EmissionsReductionStatistics : TeaModel {
        // 减排措施类型，可选值：EnergySubstitution-能源替代，SelfDefining-自定义
        [NameInMap("reduction_type")]
        [Validation(Required=true)]
        public string ReductionType { get; set; }

        // 减排措施名称
        [NameInMap("reduction_measure_name")]
        [Validation(Required=true)]
        public string ReductionMeasureName { get; set; }

        // 减排方案编码
        [NameInMap("reduction_proposal_no")]
        [Validation(Required=true)]
        public string ReductionProposalNo { get; set; }

        // 减排量
        [NameInMap("reduction_emissions")]
        [Validation(Required=true)]
        public long? ReductionEmissions { get; set; }

        // 减排量单位
        [NameInMap("unit")]
        [Validation(Required=true)]
        public string Unit { get; set; }

    }

}
