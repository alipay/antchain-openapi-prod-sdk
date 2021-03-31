// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class CancelInsurancepolicyUniversalResponse : TeaModel {
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

        // 投保订单号
        [NameInMap("apply_trade_no")]
        [Validation(Required=false)]
        public string ApplyTradeNo { get; set; }

        // 保单号
        [NameInMap("pol_no")]
        [Validation(Required=false)]
        public string PolNo { get; set; }

        // 退还保费
        [NameInMap("send_back_premium")]
        [Validation(Required=false)]
        public string SendBackPremium { get; set; }

        // 成功退保时间, 时间格式 "yyyy-MM-dd HH:mm:ss"
        [NameInMap("success_surrender_time")]
        [Validation(Required=false)]
        public string SuccessSurrenderTime { get; set; }

        // 退保生效时间, 时间格式 "yyyy-MM-dd HH:mm:ss"
        [NameInMap("surrender_effective_time")]
        [Validation(Required=false)]
        public string SurrenderEffectiveTime { get; set; }

    }

}
