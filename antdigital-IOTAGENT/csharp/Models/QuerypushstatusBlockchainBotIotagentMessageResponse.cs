// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class QuerypushstatusBlockchainBotIotagentMessageResponse : TeaModel {
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

        // 推送消息的受理标识
        [NameInMap("receipt_id")]
        [Validation(Required=false)]
        public string ReceiptId { get; set; }

        // 消息ID
        [NameInMap("message_id")]
        [Validation(Required=false)]
        public string MessageId { get; set; }

        // 客户端ID
        [NameInMap("client_id")]
        [Validation(Required=false)]
        public string ClientId { get; set; }

        // 最后的状态更新时间
        [NameInMap("update_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UpdateTime { get; set; }

        // 失败的异常信息
        [NameInMap("failed_reason")]
        [Validation(Required=false)]
        public string FailedReason { get; set; }

        // 状态，取值范围：PENDING->已入队；WAITING->等待中（设备离线/忙碌）;EXECUTING->已下发设备、执行中；SUCCEEDED->成功；FAILED->失败；EXPIRED->已过期
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
