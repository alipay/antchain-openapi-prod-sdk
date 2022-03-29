// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 能登陆监控的用户
    public class MonitorUserDO : TeaModel {
        // 登录名
        [NameInMap("login_name")]
        [Validation(Required=true)]
        public string LoginName { get; set; }

        // 昵称(花名或显示名)
        [NameInMap("nick_name")]
        [Validation(Required=true)]
        public string NickName { get; set; }

        // 手机号码
        [NameInMap("phone_num")]
        [Validation(Required=true)]
        public string PhoneNum { get; set; }

        // 真名
        [NameInMap("real_name")]
        [Validation(Required=true)]
        public string RealName { get; set; }

        // 一方化标记位
        [NameInMap("from_aliyun")]
        [Validation(Required=true)]
        public bool? FromAliyun { get; set; }

        // 是否未超级管理员
        [NameInMap("super_admin")]
        [Validation(Required=true)]
        public bool? SuperAdmin { get; set; }

        // 用户上的权限
        [NameInMap("super_viewer")]
        [Validation(Required=true)]
        public bool? SuperViewer { get; set; }

        // super_admin或者super_viewer
        [NameInMap("is_super")]
        [Validation(Required=true)]
        public bool? IsSuper { get; set; }

        // 用户 ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 用户来源
        [NameInMap("identity_type")]
        [Validation(Required=true)]
        public string IdentityType { get; set; }

    }

}
