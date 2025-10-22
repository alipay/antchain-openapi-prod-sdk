// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    // 二级用户基础信息
    public class SubUserAccountBaseVO : TeaModel {
        // 二级用户ID
        [NameInMap("sub_user_account_id")]
        [Validation(Required=true)]
        public string SubUserAccountId { get; set; }

        // 用户地址
        [NameInMap("user_address")]
        [Validation(Required=false)]
        public string UserAddress { get; set; }

        // 用户邮箱
        [NameInMap("contact")]
        [Validation(Required=false)]
        public string Contact { get; set; }

        // 用户昵称
        [NameInMap("alias")]
        [Validation(Required=false)]
        public string Alias { get; set; }

    }

}
