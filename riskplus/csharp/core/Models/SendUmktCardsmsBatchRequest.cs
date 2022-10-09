// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class SendUmktCardsmsBatchRequest : TeaModel {
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

        // 卡片短信模板
        [NameInMap("card_template_code")]
        [Validation(Required=true)]
        public string CardTemplateCode { get; set; }

        // {}
        [NameInMap("card_template_param_json")]
        [Validation(Required=true)]
        public string CardTemplateParamJson { get; set; }

        // ["13455","76898"]
        [NameInMap("phone_number_json")]
        [Validation(Required=true)]
        public string PhoneNumberJson { get; set; }

        // ["蚂蚁营销"]
        [NameInMap("sign_name_json")]
        [Validation(Required=true)]
        public string SignNameJson { get; set; }

        // 上行短信扩展码
        [NameInMap("sms_up_extend_code_json")]
        [Validation(Required=false)]
        public string SmsUpExtendCodeJson { get; set; }

        // 回落类型
        [NameInMap("fallback_type")]
        [Validation(Required=false)]
        public string FallbackType { get; set; }

        // 回落短信模版
        [NameInMap("fallback_template_code")]
        [Validation(Required=false)]
        public string FallbackTemplateCode { get; set; }

        // 回落短信模版参数
        [NameInMap("fallback_template_param_json")]
        [Validation(Required=false)]
        public string FallbackTemplateParamJson { get; set; }

        // 卡片短信对应的原始文本短信模板，不传则用默认文本
        [NameInMap("template_code")]
        [Validation(Required=false)]
        public string TemplateCode { get; set; }

        // 默认文本对应参数
        [NameInMap("template_param_json")]
        [Validation(Required=false)]
        public string TemplateParamJson { get; set; }

    }

}
