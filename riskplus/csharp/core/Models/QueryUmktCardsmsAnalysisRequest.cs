// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryUmktCardsmsAnalysisRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户的卡片短信模板id
        [NameInMap("card_template_code")]
        [Validation(Required=true)]
        public string CardTemplateCode { get; set; }

        // 手机号列表,最多10个手机号
        [NameInMap("phone_number_json")]
        [Validation(Required=true)]
        public string PhoneNumberJson { get; set; }

        // 卡片短信模板参数
        [NameInMap("card_template_param_json")]
        [Validation(Required=true)]
        public string CardTemplateParamJson { get; set; }

        // 短信签名。当前只支持填入一个签名。
        [NameInMap("sign_name_json")]
        [Validation(Required=true)]
        public string SignNameJson { get; set; }

        // 外部流水扩展字段
        [NameInMap("out_id")]
        [Validation(Required=false)]
        public string OutId { get; set; }

    }

}
