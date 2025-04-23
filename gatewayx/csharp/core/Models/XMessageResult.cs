// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GATEWAYX.Models
{
    // 消息发送结果
    public class XMessageResult : TeaModel {
        // 消息key
        [NameInMap("msg_key")]
        [Validation(Required=true)]
        public string MsgKey { get; set; }

        // 发送方租户
        [NameInMap("provider_id")]
        [Validation(Required=true)]
        public string ProviderId { get; set; }

        // 接收方租户
        [NameInMap("consumer_id")]
        [Validation(Required=true)]
        public string ConsumerId { get; set; }

        // 发送结果
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 发送次数（重试次数）
        [NameInMap("push_times")]
        [Validation(Required=true)]
        public long? PushTimes { get; set; }

        // 发送内容
        [NameInMap("biz_content")]
        [Validation(Required=true)]
        public string BizContent { get; set; }

        // 错误码
        [NameInMap("error_code")]
        [Validation(Required=true)]
        public string ErrorCode { get; set; }

        // 错误消息
        [NameInMap("error_msg")]
        [Validation(Required=false)]
        public string ErrorMsg { get; set; }

        // 发送地址
        [NameInMap("target_url")]
        [Validation(Required=true)]
        public string TargetUrl { get; set; }

        // 消息唯一id
        [NameInMap("unique_id")]
        [Validation(Required=true)]
        public string UniqueId { get; set; }

    }

}
