// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    public class ResolveApimodelRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 待解析的父类模型名称
        [NameInMap("model_name")]
        [Validation(Required=false)]
        public string ModelName { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 包名
        [NameInMap("package_name")]
        [Validation(Required=false)]
        public string PackageName { get; set; }

        // json
        [NameInMap("json")]
        [Validation(Required=false)]
        public string Json { get; set; }

        // type
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
