// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 创建凭证Two
    public class VoucherTestTwo : TeaModel {
        // 测试Boolean
        [NameInMap("voucher_test_two_boolean")]
        [Validation(Required=true)]
        public bool? VoucherTestTwoBoolean { get; set; }

        // 凭证列表_apiTestList
        [NameInMap("voucher_test_two_api_test_list")]
        [Validation(Required=true)]
        public List<VoucherTestOne> VoucherTestTwoApiTestList { get; set; }

        // 测试Int
        [NameInMap("voucher_test_two_int")]
        [Validation(Required=true)]
        public long? VoucherTestTwoInt { get; set; }

        // 测试Integer
        [NameInMap("voucher_test_two_integer")]
        [Validation(Required=true)]
        public long? VoucherTestTwoInteger { get; set; }

        // 凭证列表_dateList
        [NameInMap("voucher_test_two_date_list")]
        [Validation(Required=true)]
        public List<string> VoucherTestTwoDateList { get; set; }

        // 测试String
        [NameInMap("voucher_test_two_string")]
        [Validation(Required=true, MaxLength=10)]
        public string VoucherTestTwoString { get; set; }

        // 测试Date
        [NameInMap("voucher_test_two_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string VoucherTestTwoDate { get; set; }

        // 凭证列表_integerList
        [NameInMap("voucher_test_two_integer_list")]
        [Validation(Required=true)]
        public List<long?> VoucherTestTwoIntegerList { get; set; }

        // 测试Long
        [NameInMap("voucher_test_two_long")]
        [Validation(Required=true)]
        public long? VoucherTestTwoLong { get; set; }

        // 凭证列表_longList
        [NameInMap("voucher_test_two_long_list")]
        [Validation(Required=true)]
        public List<long?> VoucherTestTwoLongList { get; set; }

        // 凭证列表_stringList
        [NameInMap("voucher_test_two_string_list")]
        [Validation(Required=true)]
        public List<string> VoucherTestTwoStringList { get; set; }

        // 测试apiTestInfo
        [NameInMap("voucher_test_two_api_test_info")]
        [Validation(Required=true)]
        public VoucherTestOne VoucherTestTwoApiTestInfo { get; set; }

        // 凭证列表_booleanList
        [NameInMap("voucher_test_two_boolean_list")]
        [Validation(Required=true)]
        public List<bool?> VoucherTestTwoBooleanList { get; set; }

    }

}
