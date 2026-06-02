// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MREACH.Models
{
    // 卡片短信查询结果
    public class CradSmsSendDetail : TeaModel {
        // 消息ID
        [NameInMap("message_id")]
        [Validation(Required=true)]
        public string MessageId { get; set; }

        // 接收手机号
        [NameInMap("phone_number")]
        [Validation(Required=true)]
        public string PhoneNumber { get; set; }

        // 卡片短信模板ID
        [NameInMap("template_id")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

        // 最终接收类型: CARD_SMS-卡片短信送达, SMS-回落为普通短信送达。
        [NameInMap("final_receive_type")]
        [Validation(Required=true)]
        public string FinalReceiveType { get; set; }

        // 短信发送状态。1-等待回执，2-发送失败，3-发送成功。
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 错误码（发送失败时返回）
        [NameInMap("error_code")]
        [Validation(Required=true)]
        public string ErrorCode { get; set; }

        // 错误描述（发送失败时返回）
        [NameInMap("error_message")]
        [Validation(Required=true)]
        public string ErrorMessage { get; set; }

        // 回执时间,yyyy-MM-dd HH:mm:ss格式
        [NameInMap("report_time")]
        [Validation(Required=true)]
        public string ReportTime { get; set; }

        // 回落短信正文（仅 finalReceiveType=SMS 时有值）
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

    }

}
