// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    public class SyncAntchainAtoInnerTemplateRequest : TeaModel {
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

        // 来源魔法库模板code
        [NameInMap("source_template_code")]
        [Validation(Required=true)]
        public string SourceTemplateCode { get; set; }

        // 目标魔法库模板名称
        [NameInMap("target_template_name")]
        [Validation(Required=false)]
        public string TargetTemplateName { get; set; }

        // 模板同步的场景，值参考：CREATE_TEMPLATE、SYNC_PROD
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 魔法库来源模板版本
        [NameInMap("source_template_version")]
        [Validation(Required=true)]
        public string SourceTemplateVersion { get; set; }

    }

}
