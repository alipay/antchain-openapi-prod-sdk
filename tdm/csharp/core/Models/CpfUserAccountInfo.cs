// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    // 公积金中心用户信息
    public class CpfUserAccountInfo : TeaModel {
        // 账户状态
        [NameInMap("account_status")]
        [Validation(Required=true)]
        public string AccountStatus { get; set; }

        // 账户余额
        [NameInMap("balance")]
        [Validation(Required=true)]
        public string Balance { get; set; }

        // 缴纳单位名称
        [NameInMap("inst_name")]
        [Validation(Required=true)]
        public string InstName { get; set; }

        // 个人账户
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

    }

}
