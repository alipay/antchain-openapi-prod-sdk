// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    public class CreatewithoptionsAntcloudTradeComboResponse : TeaModel {
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

        // 套餐订单ID
        [NameInMap("combo_order_id")]
        [Validation(Required=false)]
        public string ComboOrderId { get; set; }

        // 订单状态，创建成功为 WAIT_CONFIRM（待确认）
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
