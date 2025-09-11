// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_d3c4f09125a14cd587057c405561809a.Models
{
    // 操作角色
    public class UserOperatorInfoBO : TeaModel {
        // userId
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 别名
        [NameInMap("alias")]
        [Validation(Required=false)]
        public string Alias { get; set; }

        // 钱包地址
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 登录账号类型列表
        [NameInMap("user_login_account_list")]
        [Validation(Required=false)]
        public List<LoginAccountTypeBO> UserLoginAccountList { get; set; }

        // 机构类型列表
        [NameInMap("user_institution_type_list")]
        [Validation(Required=false)]
        public List<string> UserInstitutionTypeList { get; set; }

    }

}
