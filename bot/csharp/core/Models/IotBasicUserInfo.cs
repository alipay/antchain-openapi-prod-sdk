// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // iot平台用户信息
    // 
    public class IotBasicUserInfo : TeaModel {
        // 租户ID
        [NameInMap("tenant")]
        [Validation(Required=true)]
        public string Tenant { get; set; }

        // 金融云用户Id
        // 
        [NameInMap("cloud_user_id")]
        [Validation(Required=true)]
        public string CloudUserId { get; set; }

        // 金融云平台的登录名
        // 
        [NameInMap("login_name")]
        [Validation(Required=true)]
        public string LoginName { get; set; }

        // 权限集合
        [NameInMap("permission_list")]
        [Validation(Required=true)]
        public List<IotBasicRolePermission> PermissionList { get; set; }

    }

}
