// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    // 银行支行信息
    public class PbcInfo : TeaModel {
        // 支行名称
        [NameInMap("branch_name")]
        [Validation(Required=true)]
        public string BranchName { get; set; }

        // 联行号数据
        [NameInMap("bank_code")]
        [Validation(Required=true)]
        public string BankCode { get; set; }

    }

}
