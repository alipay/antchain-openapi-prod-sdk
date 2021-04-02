// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 具备实体权限访问者更新请求
    public class DidUpdateTenantReq : TeaModel {
        // 待更新实体身份did
        [NameInMap("thing_did")]
        [Validation(Required=true)]
        public string ThingDid { get; set; }

        // 待更新访问者列表
        [NameInMap("tenant_list")]
        [Validation(Required=true)]
        public List<string> TenantList { get; set; }

        // 权限角色
        // TENANT_ROLE_OWNER
        // TENANT_ROLE_USER
        // TENANT_ROLE_OBSERVER
        [NameInMap("tenant_role")]
        [Validation(Required=true)]
        public string TenantRole { get; set; }

        // 增加权限：THINGS_OP_MODE_ADD
        // 删除权限：THINGS_OP_MODE_REMOVE
        [NameInMap("op_mode")]
        [Validation(Required=true)]
        public string OpMode { get; set; }

    }

}
