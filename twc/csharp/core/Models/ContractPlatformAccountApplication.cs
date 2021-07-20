// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 平台方经办人信息
    public class ContractPlatformAccountApplication : TeaModel {
        // 邮箱地址
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 证件号
        [NameInMap("id_number")]
        [Validation(Required=true)]
        public string IdNumber { get; set; }

        // 证件类型
        [NameInMap("id_type")]
        [Validation(Required=true)]
        public string IdType { get; set; }

        // 手机号码
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 用户唯一标识，可传入第三方平台的个人用户id等
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

    }

}
