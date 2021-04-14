// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateContractMerchantrefundResponse : TeaModel {
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

        // 错误码
        [NameInMap("code")]
        [Validation(Required=false)]
        public long? Code { get; set; }

        // 错误信息描述
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 本次请求对应的操作单号
        [NameInMap("out_request_no")]
        [Validation(Required=false)]
        public string OutRequestNo { get; set; }

        // 订单id
        [NameInMap("out_trade_no")]
        [Validation(Required=false)]
        public string OutTradeNo { get; set; }

    }

}
