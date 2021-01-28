// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class InitCertificationResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 返回值状态码，0000则为成功
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 异常状态时的错误信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 后端生成的存证证明申请订单ID
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 如果是记账模式则为空，其余情况返回支付宝SDK生成的支付内容信息
        [NameInMap("pay_content")]
        [Validation(Required=false)]
        public string PayContent { get; set; }

    }

}
