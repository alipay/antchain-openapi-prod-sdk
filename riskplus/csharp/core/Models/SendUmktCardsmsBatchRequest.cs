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

    }

}
