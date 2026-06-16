// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS_SPI.Models
{
    // 分账通知明细
    public class SettleOrderRoyaltyDetail : TeaModel {
        // 分账金额，单位：分
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

        // 分账执行时间
        [NameInMap("execute_time")]
        [Validation(Required=true)]
        public string ExecuteTime { get; set; }

        // 分账转出账号
        [NameInMap("trans_out_account")]
        [Validation(Required=true)]
        public string TransOutAccount { get; set; }

        // 分账转入账号
        [NameInMap("trans_in_account")]
        [Validation(Required=true)]
        public string TransInAccount { get; set; }

    }

}
