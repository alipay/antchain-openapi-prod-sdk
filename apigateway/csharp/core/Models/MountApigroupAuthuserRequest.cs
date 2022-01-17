// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    public class MountApigroupAuthuserRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // api标识
        [NameInMap("api_group_id")]
        [Validation(Required=true)]
        public string ApiGroupId { get; set; }

        // 授权状态
        [NameInMap("auth_status")]
        [Validation(Required=true)]
        public string AuthStatus { get; set; }

        // 授权用户Id列表
        [NameInMap("auth_user_id_list")]
        [Validation(Required=true)]
        public List<string> AuthUserIdList { get; set; }

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
