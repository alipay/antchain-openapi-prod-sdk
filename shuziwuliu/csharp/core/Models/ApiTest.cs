// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 接口测试
    public class ApiTest : TeaModel {
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

        // 凭证列表_stringList
        [NameInMap("string_list")]
        [Validation(Required=true)]
        public List<string> StringList { get; set; }

        // 凭证列表_ints
        [NameInMap("ints")]
        [Validation(Required=true)]
        public List<long?> Ints { get; set; }

        // 凭证列表_longs
        [NameInMap("longs")]
        [Validation(Required=true)]
        public List<long?> Longs { get; set; }

        // 凭证列表_integerList
        [NameInMap("integer_list")]
        [Validation(Required=true)]
        public List<long?> IntegerList { get; set; }

        // 凭证列表_longList
        [NameInMap("long_list")]
        [Validation(Required=true)]
        public List<long?> LongList { get; set; }

        // 凭证列表_booleanList
        [NameInMap("boolean_list")]
        [Validation(Required=true)]
        public List<bool?> BooleanList { get; set; }

        // 凭证列表_dateList
        [NameInMap("date_list")]
        [Validation(Required=true)]
        public List<string> DateList { get; set; }

        // 凭证列表_apiTestList
        [NameInMap("api_test_list")]
        [Validation(Required=true)]
        public List<ApiTestInfo> ApiTestList { get; set; }

        // 测试apiTestInfo
        [NameInMap("api_test_info")]
        [Validation(Required=true)]
        public ApiTest ApiTestInfo { get; set; }

    }

}
