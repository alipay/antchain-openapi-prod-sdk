// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 钱包的统计信息
    public class StatisticalInfo : TeaModel {
        // 可用于消费的信用Token等值金额(单位:元, 精确到小数点后12位)	
        [NameInMap("credit_token_balance")]
        [Validation(Required=true)]
        public string CreditTokenBalance { get; set; }

        // 可用于消费的Token等值金额(单位:元, 精确到小数点后12位)
        [NameInMap("debit_token_balance")]
        [Validation(Required=true)]
        public string DebitTokenBalance { get; set; }

        // 目前持有的他人Token的金额(单位:元, 精确到小数点后12位)
        [NameInMap("other_token_balance")]
        [Validation(Required=true)]
        public string OtherTokenBalance { get; set; }

        // 已消费的累积金额(单位:元, 精确到小数点后12位)
        [NameInMap("used_token_balance")]
        [Validation(Required=true)]
        public string UsedTokenBalance { get; set; }

    }

}
