// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class QueryPfPaymentResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 入账状态: 10-受理 20-在途 00-成功 99-失败
        [NameInMap("accountin_status")]
        [Validation(Required=false)]
        public string AccountinStatus { get; set; }

        // 交易时间
        [NameInMap("trade_time")]
        [Validation(Required=false)]
        public string TradeTime { get; set; }

    }

}
