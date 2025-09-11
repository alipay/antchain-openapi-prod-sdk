// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_d3c4f09125a14cd587057c405561809a.Models
{
    // 跨链账户信息
    public class CrossChainAccountsVO : TeaModel {
        // 对侧链用户地址
        [NameInMap("cross_chain_user_address")]
        [Validation(Required=false)]
        public string CrossChainUserAddress { get; set; }

        // 对侧链账户ID
        [NameInMap("cross_chain_user_account_id")]
        [Validation(Required=false)]
        public string CrossChainUserAccountId { get; set; }

        // 对侧链红利账户ID
        [NameInMap("cross_chain_user_bonus_account_id")]
        [Validation(Required=false)]
        public string CrossChainUserBonusAccountId { get; set; }

        // 对侧链资产账户明细
        [NameInMap("cross_chain_user_accounts_details")]
        [Validation(Required=false)]
        public List<CrossChainAccountsDetailVO> CrossChainUserAccountsDetails { get; set; }

        // 对侧链账户信息
        [NameInMap("cross_chain_bonus_accounts_details")]
        [Validation(Required=false)]
        public List<CrossChainBonusAccountsDetailVO> CrossChainBonusAccountsDetails { get; set; }

    }

}
