// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class ExecConsumecardOrdertrywithdrawResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 试算总提现金额(单位:元,精确到分)
        [NameInMap("withdraw_total_amount")]
        [Validation(Required=false)]
        public string WithdrawTotalAmount { get; set; }

        // 试算提现订单总笔数
        [NameInMap("withdraw_total_count")]
        [Validation(Required=false)]
        public long? WithdrawTotalCount { get; set; }

    }

}
