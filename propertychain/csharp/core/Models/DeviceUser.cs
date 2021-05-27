// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 设备用户
    public class DeviceUser : TeaModel {
        // 用户id
        [NameInMap("device_user_id")]
        [Validation(Required=false)]
        public string DeviceUserId { get; set; }

        // 用户名称
        [NameInMap("device_user_name")]
        [Validation(Required=false)]
        public string DeviceUserName { get; set; }

        // 角色类型【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
        [NameInMap("role_type")]
        [Validation(Required=false)]
        public string RoleType { get; set; }

        // 权限(仅有设备所有权和设备使用权两种权限)
        [NameInMap("authority")]
        [Validation(Required=false)]
        public string Authority { get; set; }

    }

}
