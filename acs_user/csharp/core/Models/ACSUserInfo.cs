// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACS_USER.Models
{
    // AntChain Stack 用户信息
    public class ACSUserInfo : TeaModel {
        // 用户ID
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 用户名称
        [NameInMap("user_name")]
        [Validation(Required=false)]
        public string UserName { get; set; }

        // 用户类型，OPERATOR：登录用户；SERVICE：服务用户
        [NameInMap("user_type")]
        [Validation(Required=false)]
        public string UserType { get; set; }

        // 是否已失效
        [NameInMap("expired")]
        [Validation(Required=false)]
        public bool? Expired { get; set; }

        // 是否被禁用
        [NameInMap("disabled")]
        [Validation(Required=false)]
        public bool? Disabled { get; set; }

        // 邮箱
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 手机号码
        [NameInMap("phone")]
        [Validation(Required=false)]
        public string Phone { get; set; }

        // 失效时间
        [NameInMap("expired_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ExpiredTime { get; set; }

        // 创建时间
        [NameInMap("create_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreateTime { get; set; }

        // 更新时间
        [NameInMap("update_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UpdateTime { get; set; }

        // 用户角色
        [NameInMap("user_roles")]
        [Validation(Required=false)]
        public List<ACSUserRole> UserRoles { get; set; }

        // 账户密码
        [NameInMap("password")]
        [Validation(Required=false)]
        public string Password { get; set; }

    }

}
