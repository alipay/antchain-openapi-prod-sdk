// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 池融资凭证核验查询结果
    public class PfVoucherCheckResult : TeaModel {
        // 凭证id
        [NameInMap("voucher_id")]
        [Validation(Required=true)]
        public string VoucherId { get; set; }

        // 凭证类型
        [NameInMap("voucher_category")]
        [Validation(Required=true)]
        public string VoucherCategory { get; set; }

        // 状态；PASS:通过，NO_PASS 未通过
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
