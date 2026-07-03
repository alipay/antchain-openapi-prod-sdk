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
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("main_company_id")]
        [Validation(Required=false)]
        public string MainCompanyId { get; set; }

        // 主企业名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("main_company_name")]
        [Validation(Required=false)]
        public string MainCompanyName { get; set; }

        // 节点唯一ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("node_id")]
        [Validation(Required=false)]
        public string NodeId { get; set; }

        // 节点名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("node_name")]
        [Validation(Required=false)]
        public string NodeName { get; set; }

        // 节点证件号码
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("node_cert_no")]
        [Validation(Required=false)]
        public string NodeCertNo { get; set; }

        // 节点类型，枚举值
        /// <summary>
        /// <b>Example:</b>
        /// <para>company</para>
        /// </summary>
        [NameInMap("node_type")]
        [Validation(Required=false)]
        public string NodeType { get; set; }

        // 节点扩展信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>节点扩展信息</para>
        /// </summary>
        [NameInMap("node_ext_json")]
        [Validation(Required=false)]
        public string NodeExtJson { get; set; }

        // 基因模式
        /// <summary>
        /// <b>Example:</b>
        /// <para>risk_label</para>
        /// </summary>
        [NameInMap("risk_label")]
        [Validation(Required=false)]
        public string RiskLabel { get; set; }

        // 基因模式
        /// <summary>
        /// <b>Example:</b>
        /// <para>基因模式</para>
        /// </summary>
        [NameInMap("risk_mode")]
        [Validation(Required=false)]
        public string RiskMode { get; set; }

    }

}
