// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    // 结算订单分账明细对象
    public class SettleOrderRoyaltyDetail : TeaModel {
        // 分账金额，单位：分
        [NameInMap("amount")]
        [Validation(Required=false)]
        public long? Amount { get; set; }

        // 分账状态，SUCCESS成功，FAIL失败，PROCESSING处理中
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // 分账执行时间
        [NameInMap("execute_dt")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ExecuteDt { get; set; }

        // 分账转出账号
        [NameInMap("trans_out_account")]
        [Validation(Required=false)]
        public string TransOutAccount { get; set; }

        // 分账失败错误码，只在分账失败时返回
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // 分账错误描述信息
        [NameInMap("error_desc")]
        [Validation(Required=false)]
        public string ErrorDesc { get; set; }

        // 分账转入账号
        [NameInMap("trans_in_account")]
        [Validation(Required=false)]
        public string TransInAccount { get; set; }

    }

}
