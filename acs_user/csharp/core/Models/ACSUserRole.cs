// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACS_USER.Models
{
    // AntChain Stack 用户角色
    public class ACSUserRole : TeaModel {
        // 角色归属产品
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 角色编码
        [NameInMap("product_role")]
        [Validation(Required=true)]
        public string ProductRole { get; set; }

        // 角色类型，SYSTEM：系统角色；USER_DEFINE：用户自定义角色
        [NameInMap("role_type")]
        [Validation(Required=true)]
        public string RoleType { get; set; }

        // 角色名称
        [NameInMap("role_name")]
        [Validation(Required=false)]
        public string RoleName { get; set; }

        // 角色描述信息
        [NameInMap("role_description")]
        [Validation(Required=false)]
        public string RoleDescription { get; set; }

        // 权限点信息
        [NameInMap("auth_actions")]
        [Validation(Required=false)]
        public List<AuthAction> AuthActions { get; set; }

        // 角色code
        [NameInMap("role_code")]
        [Validation(Required=false)]
        public string RoleCode { get; set; }

        // 登陆用户名
        [NameInMap("userid")]
        [Validation(Required=false)]
        public string Userid { get; set; }

    }

}
