// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // MonitorUser
    public class MonitorUser : TeaModel {
        // 用户来源
        [NameInMap("identity_type")]
        [Validation(Required=true)]
        public string IdentityType { get; set; }

        // 用户上的权限
        [NameInMap("super_viewer")]
        [Validation(Required=true)]
        public bool? SuperViewer { get; set; }

        // 是否为超级管理员
        [NameInMap("super_admin")]
        [Validation(Required=true)]
        public bool? SuperAdmin { get; set; }

        // 显示名，花名 
        [NameInMap("nick_name")]
        [Validation(Required=true)]
        public string NickName { get; set; }

        // emp_id
        [NameInMap("emp_id")]
        [Validation(Required=true)]
        public string EmpId { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 登录名，等于_id, _id实在太难辨别了，域帐号  yerui.yr
        [NameInMap("login_name")]
        [Validation(Required=true)]
        public string LoginName { get; set; }

        // 展示名称
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

        // 兼容UniversalRead里返回的userDisplayName
        [NameInMap("user_display_name")]
        [Validation(Required=true)]
        public string UserDisplayName { get; set; }

        // 真名
        [NameInMap("real_name")]
        [Validation(Required=true)]
        public string RealName { get; set; }

        // phone_num
        [NameInMap("phone_num")]
        [Validation(Required=true)]
        public string PhoneNum { get; set; }

        // email
        [NameInMap("email")]
        [Validation(Required=true)]
        public string Email { get; set; }

        // enterprise_id（金融云专属）
        [NameInMap("enterprise_id")]
        [Validation(Required=true)]
        public string EnterpriseId { get; set; }

        // token
        [NameInMap("token")]
        [Validation(Required=true)]
        public string Token { get; set; }

        // 一方化标记位
        [NameInMap("is_from_aliyun")]
        [Validation(Required=true)]
        public bool? IsFromAliyun { get; set; }

    }

}
