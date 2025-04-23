// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMOSDK.Models
{
    // Demo类1
    public class DemoClass : TeaModel {
        // 字符串测试
        [NameInMap("some_string")]
        [Validation(Required=true)]
        public string SomeString { get; set; }

        // 日期测试
        [NameInMap("some_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string SomeDate { get; set; }

        // Boolean测试
        [NameInMap("some_boolean")]
        [Validation(Required=true)]
        public bool? SomeBoolean { get; set; }

        // 整数测试
        [NameInMap("some_int")]
        [Validation(Required=true)]
        public long? SomeInt { get; set; }

        // 列表测试
        [NameInMap("some_list")]
        [Validation(Required=true)]
        public List<string> SomeList { get; set; }

    }

}
