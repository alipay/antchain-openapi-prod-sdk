// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryUmktCardsmsSupportRequest : TeaModel {
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
        [NameInMap("template_code")]
        [Validation(Required=true)]
        public string TemplateCode { get; set; }

        // 手机号
        [NameInMap("mobiles")]
        [Validation(Required=true)]
        public string Mobiles { get; set; }

    }

}
