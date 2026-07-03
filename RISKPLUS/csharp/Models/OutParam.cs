// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 输出参数
    public class OutParam : TeaModel {
        // 输出参数名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>creditLimit</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 输出参数值
        /// <summary>
        /// <b>Example:</b>
        /// <para>19000</para>
        /// </summary>
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
