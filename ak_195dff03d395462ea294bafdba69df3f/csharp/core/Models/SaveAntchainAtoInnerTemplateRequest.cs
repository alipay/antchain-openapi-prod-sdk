// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    public class SaveAntchainAtoInnerTemplateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商户对应租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 魔法库模板code
        [NameInMap("template_code")]
        [Validation(Required=true)]
        public string TemplateCode { get; set; }

        // 魔法库模板版本
        [NameInMap("template_version")]
        [Validation(Required=true)]
        public string TemplateVersion { get; set; }

        // 文件预览地址
        [NameInMap("preview_address")]
        [Validation(Required=true)]
        public string PreviewAddress { get; set; }

        // 创建模板的元素列表
        [NameInMap("template_element_list")]
        [Validation(Required=false)]
        public string TemplateElementList { get; set; }

        // 文件oss存储的key
        [NameInMap("file_key")]
        [Validation(Required=true)]
        public string FileKey { get; set; }

        // 是否确认保存。点击”保存“按钮传false、点击”下一步“按钮传true
        [NameInMap("confirm")]
        [Validation(Required=true)]
        public bool? Confirm { get; set; }

    }

}
