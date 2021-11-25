// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class CreateUserRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 登录名称
        [NameInMap("login_id")]
        [Validation(Required=false)]
        public string LoginId { get; set; }

        // 非登录账号无需密码
        [NameInMap("password")]
        [Validation(Required=false)]
        public string Password { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 用户类型
        [NameInMap("user_type")]
        [Validation(Required=true)]
        public string UserType { get; set; }

        // 用户名称
        [NameInMap("user_name")]
        [Validation(Required=false)]
        public string UserName { get; set; }

        // 手机号码
        [NameInMap("telphone")]
        [Validation(Required=false)]
        public string Telphone { get; set; }

        // 用户邮箱
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 创建者,一般是C创建B类账号。非提其他主体创建，可以不传
        [NameInMap("creator_user_id")]
        [Validation(Required=false)]
        public long? CreatorUserId { get; set; }

    }

}
