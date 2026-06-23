// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 范围value
    public class RangeValue : TeaModel {
        // 范围类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>()</para>
        /// </summary>
        [NameInMap("range_type")]
        [Validation(Required=true)]
        public string RangeType { get; set; }

        // 范围最小值
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("min_value")]
        [Validation(Required=false)]
        public long? MinValue { get; set; }

        // 范围最大值
        /// <summary>
        /// <b>Example:</b>
        /// <para>10000</para>
        /// </summary>
        [NameInMap("max_value")]
        [Validation(Required=false)]
        public long? MaxValue { get; set; }

        // 范围类型时候步长
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("step")]
        [Validation(Required=false)]
        public long? Step { get; set; }

    }

}
