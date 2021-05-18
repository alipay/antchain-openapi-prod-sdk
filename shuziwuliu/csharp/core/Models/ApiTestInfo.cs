// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 接口测试
    public class ApiTestInfo : TeaModel {
        // 测试String
        [NameInMap("test_string")]
        [Validation(Required=true, MaxLength=100)]
        public string TestString { get; set; }

        // 测试Int
        [NameInMap("test_int")]
        [Validation(Required=true)]
        public long? TestInt { get; set; }

        // 测试Integer
        [NameInMap("test_integer")]
        [Validation(Required=true)]
        public long? TestInteger { get; set; }

        // 测试Long
        [NameInMap("test_long")]
        [Validation(Required=true)]
        public long? TestLong { get; set; }

        // 测试Boolean
        [NameInMap("test_boolean")]
        [Validation(Required=true)]
        public bool? TestBoolean { get; set; }

        // 测试Date
        [NameInMap("test_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string TestDate { get; set; }

    }

}
