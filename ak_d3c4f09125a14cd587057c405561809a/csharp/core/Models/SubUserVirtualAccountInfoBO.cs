// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_d3c4f09125a14cd587057c405561809a.Models
{
    // 虚拟子账号信息
    public class SubUserVirtualAccountInfoBO : TeaModel {
        // 虚拟子账户ID
        [NameInMap("sub_user_virtual_account_id")]
        [Validation(Required=false)]
        public string SubUserVirtualAccountId { get; set; }

        // 虚拟子账号对应用户ID
        [NameInMap("virtual_account_user_id")]
        [Validation(Required=false)]
        public string VirtualAccountUserId { get; set; }

        // 虚拟子账户邮箱
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 别名
        [NameInMap("alias")]
        [Validation(Required=false)]
        public string Alias { get; set; }

    }

}
