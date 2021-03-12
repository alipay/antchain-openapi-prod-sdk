// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 用户密钥信息
    public class UserBizKeyInfo : TeaModel {
        // 拥有该密钥的用户列表
        [NameInMap("granted_user")]
        [Validation(Required=true)]
        public List<string> GrantedUser { get; set; }

        // 密钥名称
        [NameInMap("key_name")]
        [Validation(Required=true)]
        public string KeyName { get; set; }

    }

}
