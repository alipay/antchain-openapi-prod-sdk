// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 用户基本信息
    public class CarOwnerUserInfo : TeaModel {
        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 手机号
        [NameInMap("phone_num")]
        [Validation(Required=true)]
        public string PhoneNum { get; set; }

    }

}
