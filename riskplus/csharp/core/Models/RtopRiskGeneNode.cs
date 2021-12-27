// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 风险基因-点
    public class RtopRiskGeneNode : TeaModel {
        // 主企业唯一ID
        [NameInMap("main_company_id")]
        [Validation(Required=false)]
        public string MainCompanyId { get; set; }

        // 主企业名称
        [NameInMap("main_company_name")]
        [Validation(Required=false)]
        public string MainCompanyName { get; set; }

        // 节点唯一ID
        [NameInMap("node_id")]
        [Validation(Required=false)]
        public string NodeId { get; set; }

        // 节点名称
        [NameInMap("node_name")]
        [Validation(Required=false)]
        public string NodeName { get; set; }

        // 节点证件号码
        [NameInMap("node_cert_no")]
        [Validation(Required=false)]
        public string NodeCertNo { get; set; }

        // 节点类型，枚举值
        [NameInMap("node_type")]
        [Validation(Required=false)]
        public string NodeType { get; set; }

        // 节点扩展信息
        [NameInMap("node_ext_json")]
        [Validation(Required=false)]
        public string NodeExtJson { get; set; }

        // 基因模式
        [NameInMap("risk_label")]
        [Validation(Required=false)]
        public string RiskLabel { get; set; }

        // 基因模式
        [NameInMap("risk_mode")]
        [Validation(Required=false)]
        public string RiskMode { get; set; }

    }

}
