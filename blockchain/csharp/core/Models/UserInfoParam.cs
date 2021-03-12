// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 用户身份、账户及手机号信息
    public class UserInfoParam : TeaModel {
        // 用户手机号信息
        [NameInMap("phone")]
        [Validation(Required=true)]
        public string Phone { get; set; }

        // 用户账号信息
        [NameInMap("user_account")]
        [Validation(Required=true)]
        public string UserAccount { get; set; }

        // 用户名称
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

    }

}
