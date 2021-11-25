// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    // 合同关联主体
    public class Contractaccountapplication : TeaModel {
        // 邮箱
        [NameInMap("email")]
        [Validation(Required=true)]
        public string Email { get; set; }

        // 身份证号码
        [NameInMap("id_number")]
        [Validation(Required=true)]
        public string IdNumber { get; set; }

        // 身份证类型
        [NameInMap("id_type")]
        [Validation(Required=true)]
        public string IdType { get; set; }

        // 电话号
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

    }

}
