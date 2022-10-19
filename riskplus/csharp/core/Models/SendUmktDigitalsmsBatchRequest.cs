// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class SendUmktDigitalsmsBatchRequest : TeaModel {
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

        // 手机号列表以,分隔
        [NameInMap("phone_numbers")]
        [Validation(Required=true)]
        public string PhoneNumbers { get; set; }

        // 数字短信模板code
        [NameInMap("template_code")]
        [Validation(Required=true)]
        public string TemplateCode { get; set; }

        // 短信模板参数
        [NameInMap("template_param")]
        [Validation(Required=true)]
        public string TemplateParam { get; set; }

        // 透传字段
        [NameInMap("out_id")]
        [Validation(Required=false)]
        public string OutId { get; set; }

    }

}
