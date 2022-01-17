// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    public class DownloadApimodelCodegenRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // APp标识列表
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // 租户标识
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // api_group_id
        [NameInMap("api_group_id")]
        [Validation(Required=false)]
        public string ApiGroupId { get; set; }

        // package_name
        [NameInMap("package_name")]
        [Validation(Required=false)]
        public string PackageName { get; set; }

    }

}
