// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEFINCASHIER.Models
{
    // 账号模型
    public class AccountDTO : TeaModel {
        // 账号
        [NameInMap("account_no")]
        [Validation(Required=true)]
        public string AccountNo { get; set; }

        // 户名
        [NameInMap("account_name")]
        [Validation(Required=true)]
        public string AccountName { get; set; }

        // 开户网点
        [NameInMap("offical_name")]
        [Validation(Required=false)]
        public string OfficalName { get; set; }

        // 联行号
        [NameInMap("offical_number")]
        [Validation(Required=false)]
        public string OfficalNumber { get; set; }

    }

}
