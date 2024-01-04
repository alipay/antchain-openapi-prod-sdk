// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    public class QueryAntchainAtoWithholdActivepayResponse : TeaModel {
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

        // 当前支付单
        [NameInMap("current_order")]
        [Validation(Required=false)]
        public ActivePayOrder CurrentOrder { get; set; }

        // 主动支付单列表，当不通过trade_no查询时有值
        [NameInMap("orders")]
        [Validation(Required=false)]
        public List<ActivePayOrder> Orders { get; set; }

    }

}
