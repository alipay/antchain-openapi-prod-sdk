// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    public class OnlineApiRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // API标识
        [NameInMap("api_id_list")]
        [Validation(Required=true)]
        public List<string> ApiIdList { get; set; }

        // 上线描述
        [NameInMap("online_desc")]
        [Validation(Required=false)]
        public string OnlineDesc { get; set; }

        // 租户标识
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 工作空间标识
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // api_type
        [NameInMap("api_type")]
        [Validation(Required=false)]
        public string ApiType { get; set; }

    }

}
