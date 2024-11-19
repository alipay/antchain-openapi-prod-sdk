// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    public class CreateAntchainAtoWithholdActivepayResponse : TeaModel {
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

        // 支付宝支付订单号，用于拉起主动支付页面
        [NameInMap("trade_no")]
        [Validation(Required=false)]
        public string TradeNo { get; set; }

        // 签名字符串，用于APP支付场景，客户端唤起支付宝收银台使用。
        [NameInMap("order_str")]
        [Validation(Required=false)]
        public string OrderStr { get; set; }

    }

}
