// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 创建凭证One
    public class VoucherTestOne : TeaModel {
        // 测试Long
        [NameInMap("voucher_test_one_long")]
        [Validation(Required=true)]
        public long? VoucherTestOneLong { get; set; }

        // 测试String
        [NameInMap("voucher_test_one_string")]
        [Validation(Required=true, MaxLength=10)]
        public string VoucherTestOneString { get; set; }

        // 测试Int
        [NameInMap("voucher_test_one_int")]
        [Validation(Required=true)]
        public long? VoucherTestOneInt { get; set; }

        // 测试Date
        [NameInMap("voucher_test_one_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string VoucherTestOneDate { get; set; }

        // 测试Integer
        [NameInMap("voucher_test_one_integer")]
        [Validation(Required=true)]
        public long? VoucherTestOneInteger { get; set; }

        // 测试Boolean
        [NameInMap("voucher_test_one_boolean")]
        [Validation(Required=true)]
        public bool? VoucherTestOneBoolean { get; set; }

    }

}
