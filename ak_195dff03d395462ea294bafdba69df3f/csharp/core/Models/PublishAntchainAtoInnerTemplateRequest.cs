// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    public class PublishAntchainAtoInnerTemplateRequest : TeaModel {
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

        // 魔法库版本id
        [NameInMap("template_version_id")]
        [Validation(Required=true)]
        public string TemplateVersionId { get; set; }

        // 合同模板制作版本id
        [NameInMap("template_version")]
        [Validation(Required=false)]
        public string TemplateVersion { get; set; }

    }

}
