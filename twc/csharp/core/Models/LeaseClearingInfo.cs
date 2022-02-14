// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 融资租赁清分信息
    public class LeaseClearingInfo : TeaModel {
        // 还款批次
        [NameInMap("return_index")]
        [Validation(Required=true)]
        public long? ReturnIndex { get; set; }

        // 清分状态
        [NameInMap("clearing_state")]
        [Validation(Required=true)]
        public long? ClearingState { get; set; }

        // 清分金额,精确到毫厘，即123400表示12.34元
        [NameInMap("clearing_money")]
        [Validation(Required=true)]
        public long? ClearingMoney { get; set; }

        // 开始清分时间
        [NameInMap("start_time")]
        [Validation(Required=true)]
        public string StartTime { get; set; }

        // 结束清分时间
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public string EndTime { get; set; }

        // 清分单号
        [NameInMap("clearing_order_id")]
        [Validation(Required=true)]
        public string ClearingOrderId { get; set; }

        // 清分收款账号
        [NameInMap("clearing_account")]
        [Validation(Required=true)]
        public string ClearingAccount { get; set; }

        // 清分额外说明
        [NameInMap("memo")]
        [Validation(Required=true)]
        public string Memo { get; set; }

    }

}
