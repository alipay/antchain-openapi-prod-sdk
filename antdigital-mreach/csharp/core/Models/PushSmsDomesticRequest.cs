// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MREACH.Models
{
    public class PushSmsDomesticRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务流水号，最长64字符
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 接收手机号列表
        [NameInMap("phone_numbers")]
        [Validation(Required=true)]
        public List<string> PhoneNumbers { get; set; }

        // 模板ID
        [NameInMap("template_id")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

        // 短信签名
        [NameInMap("sign_name")]
        [Validation(Required=true)]
        public string SignName { get; set; }

        // 模板参数
        [NameInMap("template_params")]
        [Validation(Required=false)]
        public string TemplateParams { get; set; }

        // 扩展参数
        [NameInMap("extra_params")]
        [Validation(Required=false)]
        public string ExtraParams { get; set; }

    }

}
