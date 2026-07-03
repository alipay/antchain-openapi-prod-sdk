// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 涉众风险企业特征
    public class RtopCrowdRiskFeatureTag : TeaModel {
        // 标签描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>XXX公司法人发生变更</para>
        /// </summary>
        [NameInMap("tag_explanation")]
        [Validation(Required=true)]
        public string TagExplanation { get; set; }

        // 标签名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>法人变更</para>
        /// </summary>
        [NameInMap("tag_name")]
        [Validation(Required=true)]
        public string TagName { get; set; }

    }

}
