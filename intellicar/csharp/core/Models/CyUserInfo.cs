// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 常岳用户结构体
    public class CyUserInfo : TeaModel {
        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 用户名
        [NameInMap("user_name")]
        [Validation(Required=false)]
        public string UserName { get; set; }

        // 证件号
        [NameInMap("id_card")]
        [Validation(Required=false)]
        public string IdCard { get; set; }

        // 手机号
        [NameInMap("phone_num")]
        [Validation(Required=true)]
        public string PhoneNum { get; set; }

    }

}
