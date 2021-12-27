// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 反欺诈风险数据服务风险信息
    public class RiskInfo : TeaModel {
        // 反欺诈风险数据服务风险组描述
        [NameInMap("risk_group_desc")]
        [Validation(Required=true)]
        public string RiskGroupDesc { get; set; }

        // 反欺诈风险数据服务风险组名
        [NameInMap("risk_group")]
        [Validation(Required=true)]
        public string RiskGroup { get; set; }

        // 反欺诈风险数据服务风险组类别
        [NameInMap("risk_group_category")]
        [Validation(Required=true)]
        public string RiskGroupCategory { get; set; }

        // 反欺诈风险数据服务风险组信息
        [NameInMap("risk_details")]
        [Validation(Required=true)]
        public List<RiskDetail> RiskDetails { get; set; }

    }

}
