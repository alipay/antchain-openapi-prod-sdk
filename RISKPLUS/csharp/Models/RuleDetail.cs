// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 反欺诈风险数据服务规则细节信息
    public class RuleDetail : TeaModel {
        // 规则细节名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>出现次数</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 规则细节值
        /// <summary>
        /// <b>Example:</b>
        /// <para>19</para>
        /// </summary>
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
