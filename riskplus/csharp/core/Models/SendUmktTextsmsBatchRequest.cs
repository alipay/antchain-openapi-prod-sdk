// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class SendUmktTextsmsBatchRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // cpassAccessKey
        [NameInMap("cpass_ak")]
        [Validation(Required=false)]
        public string CpassAk { get; set; }

        // 行业标签
        [NameInMap("industry_tag")]
        [Validation(Required=true)]
        public string IndustryTag { get; set; }

        // 手机号json
        [NameInMap("phone_number_json")]
        [Validation(Required=true)]
        public string PhoneNumberJson { get; set; }

        // 签名信息
        [NameInMap("sign_name_json")]
        [Validation(Required=true)]
        public string SignNameJson { get; set; }

        // 文本短信模板code
        [NameInMap("template_code")]
        [Validation(Required=true)]
        public string TemplateCode { get; set; }

        // 文本短信模板参数
        [NameInMap("template_param_json")]
        [Validation(Required=true)]
        public string TemplateParamJson { get; set; }

        // 上行短信扩展码
        [NameInMap("sms_up_extend_code_json")]
        [Validation(Required=false)]
        public string SmsUpExtendCodeJson { get; set; }

        // 透传字段
        [NameInMap("out_id")]
        [Validation(Required=false)]
        public string OutId { get; set; }

    }

}
