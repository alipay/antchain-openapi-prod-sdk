// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENT.Models
{
    // 粉丝粒操作流水
    public class TokenOperationDetail : TeaModel {
        // 粉丝粒操作流水状态，pending：发放中，confirmed：已到账，canceled：已取消
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 粉丝粒数量，单位分个
        [NameInMap("token_amount")]
        [Validation(Required=true)]
        public long? TokenAmount { get; set; }

        // 明细发生时间
        [NameInMap("time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string Time { get; set; }

        // 明细信息
        [NameInMap("info")]
        [Validation(Required=true)]
        public string Info { get; set; }

        // 唯一业务单号
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 订单编号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

    }

}
