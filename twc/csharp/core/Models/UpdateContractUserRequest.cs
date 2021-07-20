// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class UpdateContractUserRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 邮箱地址，默认不变
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 证件号，该字段只有为空才允许修改
        [NameInMap("id_number")]
        [Validation(Required=false)]
        public string IdNumber { get; set; }

        // 证件类型，默认为身份证
        [NameInMap("id_type")]
        [Validation(Required=false)]
        public string IdType { get; set; }

        // 手机号码，默认不变
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 姓名，默认不变
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 用户账号id，注册用户返回的个人账号id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

    }

}
