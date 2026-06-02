// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MREACH.Models
{
    public class PushCardsmsDomesticRequest : TeaModel {
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

        // 卡片短信模版ID
        [NameInMap("template_id")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

        // 卡片短信签名
        [NameInMap("sign_name")]
        [Validation(Required=true)]
        public string SignName { get; set; }

        // 卡片动参
        [NameInMap("card_params")]
        [Validation(Required=false)]
        public string CardParams { get; set; }

        // 回落类型: SMS-回落为普通短信, NONE-不回落。
        [NameInMap("fallback_type")]
        [Validation(Required=false)]
        public string FallbackType { get; set; }

        // 回落普通短信的平台模板编码。
        [NameInMap("fallback_template_id")]
        [Validation(Required=false)]
        public string FallbackTemplateId { get; set; }

        // 回落普通短信的模板参数，键值对形式Str
        [NameInMap("fallback_params")]
        [Validation(Required=false)]
        public string FallbackParams { get; set; }

        // 卡片短信渲染失败后跳转链接
        [NameInMap("custom_url")]
        [Validation(Required=false)]
        public string CustomUrl { get; set; }

        // 扩展参数
        [NameInMap("extra_params")]
        [Validation(Required=false)]
        public string ExtraParams { get; set; }

    }

}
