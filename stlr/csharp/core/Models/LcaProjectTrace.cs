// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 溯源碳足迹项目
    public class LcaProjectTrace : TeaModel {
        // 碳足迹编码
        [NameInMap("project_no")]
        [Validation(Required=true)]
        public string ProjectNo { get; set; }

        // 碳足迹生命周期边界
        [NameInMap("life_cycle_boundary")]
        [Validation(Required=true)]
        public string LifeCycleBoundary { get; set; }

        // 产品编码
        [NameInMap("product_no")]
        [Validation(Required=true)]
        public string ProductNo { get; set; }

        // 碳足迹项目排放量
        [NameInMap("lca_carbon_amount")]
        [Validation(Required=true)]
        public string LcaCarbonAmount { get; set; }

        // 产品名称
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

        // 产品规格型号
        [NameInMap("specification")]
        [Validation(Required=true)]
        public string Specification { get; set; }

        // 碳足迹开始时间
        [NameInMap("lca_start_date")]
        [Validation(Required=true)]
        public string LcaStartDate { get; set; }

        // 碳足迹结束时间
        [NameInMap("lca_end_date")]
        [Validation(Required=true)]
        public string LcaEndDate { get; set; }

        // 溯源状态
        [NameInMap("trace_status")]
        [Validation(Required=true)]
        public string TraceStatus { get; set; }

    }

}
