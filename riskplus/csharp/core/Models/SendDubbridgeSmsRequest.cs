// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class SendDubbridgeSmsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 接收短信的手机号码。支持对多个手机号码发送短信，手机号码之间以英文逗号（,）分隔。上限为1000个手机号码。批量调用相对于单条调用及时性稍有延迟。
        [NameInMap("phone_numbers")]
        [Validation(Required=true)]
        public string PhoneNumbers { get; set; }

        // 短信签名
        [NameInMap("sign_name")]
        [Validation(Required=true)]
        public string SignName { get; set; }

        // 短信模板CODE
        [NameInMap("template_code")]
        [Validation(Required=true)]
        public string TemplateCode { get; set; }

        // 短信模板变量对应的值，JSON格式
        [NameInMap("template_param")]
        [Validation(Required=false)]
        public string TemplateParam { get; set; }

        // 上行短信扩展码
        [NameInMap("sms_up_extend_code")]
        [Validation(Required=false)]
        public string SmsUpExtendCode { get; set; }

        // 外部流水扩展
        [NameInMap("out_id")]
        [Validation(Required=true)]
        public string OutId { get; set; }

    }

}
