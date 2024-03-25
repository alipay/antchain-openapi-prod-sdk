// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DUANKA.Models
{
    public class QueryHrUserRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 花名列表
        [NameInMap("nick_name_list")]
        [Validation(Required=false)]
        public List<string> NickNameList { get; set; }

        // 域账户列表
        [NameInMap("login_account_list")]
        [Validation(Required=false)]
        public List<string> LoginAccountList { get; set; }

    }

}
