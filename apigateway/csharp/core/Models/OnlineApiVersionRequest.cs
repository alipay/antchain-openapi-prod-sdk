// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    public class OnlineApiVersionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // api_id
        [NameInMap("api_id")]
        [Validation(Required=false)]
        public string ApiId { get; set; }

        // online_desc
        [NameInMap("online_desc")]
        [Validation(Required=false)]
        public string OnlineDesc { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // version_id
        [NameInMap("version_id")]
        [Validation(Required=false)]
        public string VersionId { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // api_type
        [NameInMap("api_type")]
        [Validation(Required=false)]
        public string ApiType { get; set; }

    }

}
