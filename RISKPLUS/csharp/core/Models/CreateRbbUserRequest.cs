// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class CreateRbbUserRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户邮箱，非必填
        [NameInMap("email")]
        [Validation(Required=false, MaxLength=128)]
        public string Email { get; set; }

        // 用户姓名、真实名称，不要求全局唯一
        [NameInMap("full_name")]
        [Validation(Required=true, MaxLength=64)]
        public string FullName { get; set; }

        // 用户密码
        [NameInMap("password")]
        [Validation(Required=true, MaxLength=200)]
        public string Password { get; set; }

        // 用户电话号码，非必填
        [NameInMap("phone")]
        [Validation(Required=false, MaxLength=64)]
        public string Phone { get; set; }

        // 用户所属租户编码
        [NameInMap("tenant_code")]
        [Validation(Required=false, MaxLength=64)]
        public string TenantCode { get; set; }

        // 用户名，必须全局唯一
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 用户属性扩展字段，json格式，可以为空
        [NameInMap("user_property_json")]
        [Validation(Required=false)]
        public string UserPropertyJson { get; set; }

    }

}
