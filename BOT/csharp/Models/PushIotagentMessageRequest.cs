// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class PushIotagentMessageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 消息ID，用于幂等
        [NameInMap("message_id")]
        [Validation(Required=true)]
        public string MessageId { get; set; }

        // 指令类型。消息播报用 AUDIO_BROADCAST；未来可扩展其他指令
        [NameInMap("operation_type")]
        [Validation(Required=true)]
        public string OperationType { get; set; }

        // 播报/指令文案
        [NameInMap("instruction")]
        [Validation(Required=true)]
        public string Instruction { get; set; }

        // 已解析的设备身份（tenantId/agentId/clientType/clientId/sessionId），非aiotdatalink调用时，需传；
        // aiotdatalink调用时，不传。
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

        // 用户身份ID，source 没传时用，当aiotdatalink调用时必传
        [NameInMap("out_user_id")]
        [Validation(Required=false)]
        public string OutUserId { get; set; }

        // 用户身份类型，source没传时用，当aiotdatalink调用时必传
        // 取值范围：ALIPAY_UID->支付宝UID;
        [NameInMap("out_user_type")]
        [Validation(Required=false)]
        public string OutUserType { get; set; }

        // 业务扩展信息宽字段，值是有效的json。aiotdatalink调用时的AntFinanceAssistant业务消息字段（screenText/screenTip/messageType/generatedTime/contextId/contextExpireTime/priority 等）放这里
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 最晚允许播放时间。超时消息不播报
        [NameInMap("expire_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ExpireTime { get; set; }

    }

}
