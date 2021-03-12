// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云账户列表信息
    public class ALiYunAccountList : TeaModel {
        // pagination
        [NameInMap("pagination")]
        [Validation(Required=false)]
        public ALiYunPagination Pagination { get; set; }

        // accounts
        [NameInMap("accounts")]
        [Validation(Required=false)]
        public List<ALiYunAccount> Accounts { get; set; }

    }

}
