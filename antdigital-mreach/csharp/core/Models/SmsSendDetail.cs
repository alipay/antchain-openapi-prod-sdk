// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MREACH.Models
{
    // 短信发送详情
    public class SmsSendDetail : TeaModel {
        // 错误码
        [NameInMap("err_code")]
        [Validation(Required=true)]
        public string ErrCode { get; set; }

        // 接受日期
        [NameInMap("receive_date")]
        [Validation(Required=true)]
        public string ReceiveDate { get; set; }

        // 发送日期
        [NameInMap("send_date")]
        [Validation(Required=true)]
        public string SendDate { get; set; }

        // 接收短信的手机号码
        [NameInMap("phone_number")]
        [Validation(Required=true)]
        public string PhoneNumber { get; set; }

        // 短信内容
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 模板id
        [NameInMap("template_id")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

        // 短信发送状态：1-等待回执，2-发送失败，3-发送成功。
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

    }

}
