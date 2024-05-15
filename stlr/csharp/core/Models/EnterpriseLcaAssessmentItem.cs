// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 阶段评估明细数据
    public class EnterpriseLcaAssessmentItem : TeaModel {
        // 物料编码
        [NameInMap("material_code")]
        [Validation(Required=true)]
        public string MaterialCode { get; set; }

        // 数据明细名称
        [NameInMap("assessment_item_name")]
        [Validation(Required=true)]
        public string AssessmentItemName { get; set; }

        // 物料直接碳排放评估量
        [NameInMap("emission_amount")]
        [Validation(Required=true)]
        public string EmissionAmount { get; set; }

        // 物料运输碳排放评估量
        [NameInMap("transport_emission_amount")]
        [Validation(Required=true)]
        public string TransportEmissionAmount { get; set; }

    }

}
