// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // iot平台角色信息
    public class IotBasicRolePermission : TeaModel {
        // 角色编码
        [NameInMap("role_code")]
        [Validation(Required=true)]
        public string RoleCode { get; set; }

        // 角色名称
        [NameInMap("role_name")]
        [Validation(Required=true)]
        public string RoleName { get; set; }

        // 权限列表
        [NameInMap("permission_list")]
        [Validation(Required=true)]
        public List<IotBasicPermissionData> PermissionList { get; set; }

    }

}
