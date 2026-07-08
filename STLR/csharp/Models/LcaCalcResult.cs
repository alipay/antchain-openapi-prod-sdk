// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // Lca速算记录
    public class LcaCalcResult : TeaModel {
        // 速算记录编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>0340340000000704</para>
        /// </summary>
        [NameInMap("record_no")]
        [Validation(Required=true)]
        public string RecordNo { get; set; }

        // 碳足迹排放量
        /// <summary>
        /// <b>Example:</b>
        /// <para>123.12</para>
        /// </summary>
        [NameInMap("carbon_amount")]
        [Validation(Required=true)]
        public string CarbonAmount { get; set; }

        // 各阶段评估数据明细
        [NameInMap("lca_stage_assessment_datum")]
        [Validation(Required=true)]
        public List<EnterpriseLcaStageAssessmentItem> LcaStageAssessmentDatum { get; set; }

        // 速算发起时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2024-05-01</para>
        /// </summary>
        [NameInMap("record_date")]
        [Validation(Required=true)]
        public string RecordDate { get; set; }

        // 自定义业务标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>bizNo001</para>
        /// </summary>
        [NameInMap("custom_context")]
        [Validation(Required=false)]
        public string CustomContext { get; set; }

    }

}
