// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 监测企业的特征信息
    public class RtopMonitorCompanyFeature : TeaModel {
        // 特征的描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>有企业地址变更历史，变更过经营范围</para>
        /// </summary>
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 特征的名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>关联风险</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 特征里的风险标签列表
        [NameInMap("risk_tags")]
        [Validation(Required=false)]
        public List<string> RiskTags { get; set; }

        // 特征的评分
        /// <summary>
        /// <b>Example:</b>
        /// <para>80</para>
        /// </summary>
        [NameInMap("score")]
        [Validation(Required=true)]
        public int? Score { get; set; }

    }

}
