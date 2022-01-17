// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // ApiGroupAuthUserConfigVO
    public class ApiGroupAuthUserConfigVO : TeaModel {
        // api授权管理开关
        [NameInMap("api_auth_user_switch")]
        [Validation(Required=false)]
        public string ApiAuthUserSwitch { get; set; }

        // 是否是管理员
        [NameInMap("check_master")]
        [Validation(Required=false)]
        public bool? CheckMaster { get; set; }

        // 需要api授权管理
        [NameInMap("need_api_auth_user")]
        [Validation(Required=false)]
        public bool? NeedApiAuthUser { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

    }

}
