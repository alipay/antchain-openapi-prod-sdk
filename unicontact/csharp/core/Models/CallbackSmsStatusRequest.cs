// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.UNICONTACT.Models
{
    public class CallbackSmsStatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // TEXT_SMS_REPORT
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 手机号
        [NameInMap("phone_number")]
        [Validation(Required=true)]
        public string PhoneNumber { get; set; }

        // 发送时间
        [NameInMap("send_time")]
        [Validation(Required=true)]
        public string SendTime { get; set; }

        // 状态报告时间。
        [NameInMap("report_time")]
        [Validation(Required=true)]
        public string ReportTime { get; set; }

        // 是否接收成功。取值：true：接收成功false：接收失败
        [NameInMap("success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

        // 状态报告编码。发送成功情况下为“DELIVERED”
        [NameInMap("err_code")]
        [Validation(Required=true)]
        public string ErrCode { get; set; }

        // 状态报告说明。发送成功情况下为“用户接收成功”
        [NameInMap("err_msg")]
        [Validation(Required=true)]
        public string ErrMsg { get; set; }

        // 短信长度。
        [NameInMap("sms_size")]
        [Validation(Required=true)]
        public string SmsSize { get; set; }

        // 发送回执ID，即发送流水号。
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 业务扩展字段，回执时透传，JSON格式
        [NameInMap("biz_properties")]
        [Validation(Required=true)]
        public string BizProperties { get; set; }

        // 发送卡片短信时，文本短信状态报告中才会有该字段，且取值为CARD_SMS，发送纯文本短信时，状态报告中没有该字段
        [NameInMap("sms_type")]
        [Validation(Required=false)]
        public string SmsType { get; set; }

        // 运营商
        [NameInMap("service_provider")]
        [Validation(Required=true)]
        public string ServiceProvider { get; set; }

        // 手机号归属地
        [NameInMap("city")]
        [Validation(Required=true)]
        public string City { get; set; }

    }

}
