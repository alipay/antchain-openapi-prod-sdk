// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 批量查询输出模型分
    public class BatchQueryOutputModelInfo : TeaModel {
        // 变量名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>aft_v3</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 变量值
        /// <summary>
        /// <b>Example:</b>
        /// <para>4.0</para>
        /// </summary>
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // 变量值类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>Double</para>
        /// </summary>
        [NameInMap("value_type")]
        [Validation(Required=true)]
        public string ValueType { get; set; }

    }

}
