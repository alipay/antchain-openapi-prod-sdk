// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class AddUserRoleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 账号标识，蚂蚁金融科技租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 租户名称
        [NameInMap("tenant_name")]
        [Validation(Required=true)]
        public string TenantName { get; set; }

        // 权限标识
        //     LEASER(0),
        //     BUYERS(1),
        //     OWNER(2),
        //     ADMIN(9);
        [NameInMap("role")]
        [Validation(Required=true)]
        public string Role { get; set; }

        // 是否支持abm远程
        [NameInMap("support_abm")]
        [Validation(Required=true)]
        public bool? SupportAbm { get; set; }

        // 是否含税
        [NameInMap("includ_tax")]
        [Validation(Required=true)]
        public bool? IncludTax { get; set; }

    }

}
