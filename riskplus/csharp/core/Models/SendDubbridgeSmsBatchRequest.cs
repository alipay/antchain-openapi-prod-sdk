// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class SendDubbridgeSmsBatchRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 短信模板code
        [NameInMap("template_code")]
        [Validation(Required=true)]
        public string TemplateCode { get; set; }

        // 接收短信的手机号码，JSON数组格式
        [NameInMap("phone_number_json")]
        [Validation(Required=true)]
        public string PhoneNumberJson { get; set; }

        // 短信签名名称，JSON数组格式
        [NameInMap("sign_name_json")]
        [Validation(Required=true)]
        public string SignNameJson { get; set; }

        // 短信模板变量对应的实际值，JSON数组格式
        [NameInMap("template_param_json")]
        [Validation(Required=true)]
        public string TemplateParamJson { get; set; }

        // 上行短信扩展码，JSON数组格式。无特殊需要此字段的用户请忽略此字段
        [NameInMap("sms_up_extend_code_json")]
        [Validation(Required=true)]
        public string SmsUpExtendCodeJson { get; set; }

    }

}
