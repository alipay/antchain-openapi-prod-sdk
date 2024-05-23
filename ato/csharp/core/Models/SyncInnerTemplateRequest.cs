// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SyncInnerTemplateRequest : TeaModel {
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

        // 目标模板名称
        [NameInMap("target_template_name")]
        [Validation(Required=false)]
        public string TargetTemplateName { get; set; }

    }

}
