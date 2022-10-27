// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEFINCASHIER.Models
{
    // 账户查询结果
    public class AccountQueryResult : TeaModel {
        // 外部业务平台会员ID
        [NameInMap("out_member_id")]
        [Validation(Required=true)]
        public string OutMemberId { get; set; }

        // 账号列表
        [NameInMap("accounts")]
        [Validation(Required=false)]
        public List<AccountVO> Accounts { get; set; }

        // 业务错误码(为空表示成功，否则为业务错误码)
        [NameInMap("sub_code")]
        [Validation(Required=false)]
        public string SubCode { get; set; }

        // 业务错误描述
        [NameInMap("sub_msg")]
        [Validation(Required=false)]
        public string SubMsg { get; set; }

    }

}
