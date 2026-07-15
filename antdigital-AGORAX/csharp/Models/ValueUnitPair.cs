// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 带单位的值
    public class ValueUnitPair : TeaModel {
        // 数值
        [NameInMap("value")]
        [Validation(Required=true)]
        public long? Value { get; set; }

        // 单位
        /// <summary>
        /// <b>Example:</b>
        /// <para>d</para>
        /// </summary>
        [NameInMap("unit")]
        [Validation(Required=true)]
        public string Unit { get; set; }

    }

}
