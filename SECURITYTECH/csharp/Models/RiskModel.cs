// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // eKYT风险标签
    public class RiskModel : TeaModel {
        // 标签名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>ekyt_risk_tag_100</para>
        /// </summary>
        [NameInMap("model_name")]
        [Validation(Required=true)]
        public string ModelName { get; set; }

        // 风险值
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("model_value")]
        [Validation(Required=true)]
        public string ModelValue { get; set; }

        // 风险标签描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>中风险</para>
        /// </summary>
        [NameInMap("model_comment")]
        [Validation(Required=true)]
        public string ModelComment { get; set; }

    }

}
