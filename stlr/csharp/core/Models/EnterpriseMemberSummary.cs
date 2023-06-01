// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 机构会员资料
    public class EnterpriseMemberSummary : TeaModel {
        // 机构会员DID
        [NameInMap("account_did")]
        [Validation(Required=true)]
        public string AccountDid { get; set; }

        // 会员姓名，数据脱敏处理返回
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 会员手机号码，数据脱敏处理返回
        [NameInMap("mobile")]
        [Validation(Required=false)]
        public string Mobile { get; set; }

        // 会员注册时间
        [NameInMap("register_time")]
        [Validation(Required=true)]
        public string RegisterTime { get; set; }

    }

}
