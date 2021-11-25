// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class CreateUserRegisterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 默认登录名称
        [NameInMap("login_id")]
        [Validation(Required=true)]
        public string LoginId { get; set; }

        // 用户邮箱
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 用户手机号码
        [NameInMap("telphone")]
        [Validation(Required=false)]
        public string Telphone { get; set; }

        // 云蚂侧用户id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public long? UserId { get; set; }

        // 来源 ： 1 APP注册，2 PC注册，3 后台添加
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

    }

}
