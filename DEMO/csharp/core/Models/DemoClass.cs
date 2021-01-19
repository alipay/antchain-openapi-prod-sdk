// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // Demo类
    public class DemoClass : TeaModel {
        // 字符串测试
        [NameInMap("someString")]
        [Validation(Required=false)]
        public string SomeString { get; set; }

        // 日期测试
        [NameInMap("someDate")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string SomeDate { get; set; }

        // Boolean测试
        [NameInMap("someBoolean")]
        [Validation(Required=false)]
        public bool? SomeBoolean { get; set; }

        // 整数测试
        [NameInMap("someInt")]
        [Validation(Required=false)]
        public int? SomeInt { get; set; }

        // 列表测试
        [NameInMap("someList")]
        [Validation(Required=false)]
        public List<string> SomeList { get; set; }

    }

}
