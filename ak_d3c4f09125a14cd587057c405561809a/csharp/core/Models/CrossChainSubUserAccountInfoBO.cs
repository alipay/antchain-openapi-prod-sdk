// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_d3c4f09125a14cd587057c405561809a.Models
{
    // 跨链账号信息
    public class CrossChainSubUserAccountInfoBO : TeaModel {
        // 跨链账号Id
        [NameInMap("cross_chain_user_account_id")]
        [Validation(Required=false)]
        public string CrossChainUserAccountId { get; set; }

        // 跨链账号地址
        [NameInMap("target_user_address")]
        [Validation(Required=false)]
        public string TargetUserAddress { get; set; }

        // 目标链所在链
        [NameInMap("target_chain_name")]
        [Validation(Required=false)]
        public string TargetChainName { get; set; }

    }

}
