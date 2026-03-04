// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // 测试类结构体
    public class TestClass : TeaModel {
        // 字符串字段
        [NameInMap("string_param")]
        [Validation(Required=true)]
        public string StringParam { get; set; }

        // 数字字段
        [NameInMap("number_param")]
        [Validation(Required=true)]
        public long? NumberParam { get; set; }

        // 布尔值参数
        [NameInMap("boolean_param")]
        [Validation(Required=true)]
        public bool? BooleanParam { get; set; }

        // 日期参数
        [NameInMap("date_param")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DateParam { get; set; }

        // 数组参数
        [NameInMap("array_param")]
        [Validation(Required=true)]
        public List<string> ArrayParam { get; set; }

        // 结构体参数
        [NameInMap("struct_param")]
        [Validation(Required=true)]
        public DemoClass StructParam { get; set; }

    }

}
