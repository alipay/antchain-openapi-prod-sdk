// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class ApplyInsuranceYzbResponse : TeaModel {
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

        // 投保唯一码
        [NameInMap("trade_no")]
        [Validation(Required=false)]
        public string TradeNo { get; set; }

        // 保单号
        [NameInMap("policy_no")]
        [Validation(Required=false)]
        public string PolicyNo { get; set; }

        // 保费
        [NameInMap("premium")]
        [Validation(Required=false)]
        public string Premium { get; set; }

        // 保额
        [NameInMap("insured_amount")]
        [Validation(Required=false)]
        public string InsuredAmount { get; set; }

        // 保险起期
        [NameInMap("insure_start")]
        [Validation(Required=false)]
        public string InsureStart { get; set; }

        // 保险止期
        [NameInMap("insure_end")]
        [Validation(Required=false)]
        public string InsureEnd { get; set; }

    }

}
