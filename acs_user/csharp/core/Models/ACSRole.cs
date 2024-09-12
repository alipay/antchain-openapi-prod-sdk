// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACS_USER.Models
{
    // 角色信息
    public class ACSRole : TeaModel {
        // 角色归属产品
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 角色编码
        [NameInMap("product_role")]
        [Validation(Required=true)]
        public string ProductRole { get; set; }

        // 角色编码
        [NameInMap("role_code")]
        [Validation(Required=true)]
        public string RoleCode { get; set; }

        // 角色名称
        [NameInMap("role_name")]
        [Validation(Required=true)]
        public string RoleName { get; set; }

        // 角色描述信息
        [NameInMap("role_description")]
        [Validation(Required=false)]
        public string RoleDescription { get; set; }

        // 角色类型，SYSTEM：系统角色；USER_DEFINE：用户自定义角色
        [NameInMap("role_type")]
        [Validation(Required=false)]
        public string RoleType { get; set; }

    }

}
