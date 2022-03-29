// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 管理员用户信息
    public class AdminUserDTO : TeaModel {
        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public long? GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public long? GmtModified { get; set; }

        // 数据库id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 登录名
        [NameInMap("login_name")]
        [Validation(Required=true)]
        public string LoginName { get; set; }

        // 昵称
        [NameInMap("nick_name")]
        [Validation(Required=true)]
        public string NickName { get; set; }

        // 真实姓名
        [NameInMap("real_name")]
        [Validation(Required=true)]
        public string RealName { get; set; }

        // 用户类型
        [NameInMap("user_type")]
        [Validation(Required=true)]
        public long? UserType { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

    }

}
