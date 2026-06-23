// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 计量项值限制
    public class FieldValueLimit : TeaModel {
        // 枚举值，计量项为配置项的时候使用
        /// <summary>
        /// <b>Example:</b>
        /// <para>code,中文名</para>
        /// </summary>
        [NameInMap("value_list")]
        [Validation(Required=false)]
        public List<StringMap> ValueList { get; set; }

        // 范围value
        [NameInMap("range_value")]
        [Validation(Required=false)]
        public RangeValue RangeValue { get; set; }

        // 范围类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>num</para>
        /// </summary>
        [NameInMap("value_data_type")]
        [Validation(Required=false)]
        public string ValueDataType { get; set; }

    }

}
