// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MEDIA_SMS.Models
{
    public class CreateTemplateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 请求唯一id
        [NameInMap("request_unique_id")]
        [Validation(Required=true)]
        public string RequestUniqueId { get; set; }

        // 是否为变量类型模版，默认true
        [NameInMap("variable_template")]
        [Validation(Required=false)]
        public bool? VariableTemplate { get; set; }

        // 短信标题，不超过50个长度，收件人可感知
        [NameInMap("sms_title")]
        [Validation(Required=true)]
        public string SmsTitle { get; set; }

        // 签名名称
        [NameInMap("sign_name")]
        [Validation(Required=true)]
        public string SignName { get; set; }

        // 扩展字段
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

        // 素材内容
        [NameInMap("material")]
        [Validation(Required=true)]
        public List<SmsMaterial> Material { get; set; }

    }

}
