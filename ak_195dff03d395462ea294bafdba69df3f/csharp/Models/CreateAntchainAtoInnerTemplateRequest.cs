// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    public class CreateAntchainAtoInnerTemplateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 	
        // 商户对应租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 创建的模板名称
        [NameInMap("template_name")]
        [Validation(Required=true, MaxLength=32)]
        public string TemplateName { get; set; }

        // 文件oss存储的key
        [NameInMap("file_key")]
        [Validation(Required=false)]
        public string FileKey { get; set; }

        // 模板文件的名称
        [NameInMap("file_name")]
        [Validation(Required=false)]
        public string FileName { get; set; }

    }

}
