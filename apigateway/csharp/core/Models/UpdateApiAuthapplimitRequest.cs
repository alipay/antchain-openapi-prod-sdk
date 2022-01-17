// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    public class UpdateApiAuthapplimitRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // API标识
        [NameInMap("api_id")]
        [Validation(Required=false)]
        public string ApiId { get; set; }

        // 授权应用标识
        [NameInMap("auth_app_info_id")]
        [Validation(Required=false)]
        public string AuthAppInfoId { get; set; }

        // 限流配置
        [NameInMap("limit_config")]
        [Validation(Required=false)]
        public LimitConfigVO LimitConfig { get; set; }

        // 租户标识
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 工作空间标识
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

    }

}
