// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_d3c4f09125a14cd587057c405561809a.Models
{
    // 跨链账号明细
    public class CrossAccountListVO : TeaModel {
        // 项目ID
        [NameInMap("project_id")]
        [Validation(Required=false)]
        public string ProjectId { get; set; }

        // 资产项目合约地址
        [NameInMap("asset_project_address")]
        [Validation(Required=false)]
        public string AssetProjectAddress { get; set; }

        // 红利合约地址
        [NameInMap("bonus_address")]
        [Validation(Required=false)]
        public string BonusAddress { get; set; }

        // 用户ID
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 代销机构ID
        [NameInMap("distributor_institution_id")]
        [Validation(Required=false)]
        public string DistributorInstitutionId { get; set; }

        // 发行链名称
        [NameInMap("chain_name")]
        [Validation(Required=false)]
        public string ChainName { get; set; }

        // 投资者用户账户ID
        [NameInMap("sub_user_account_id")]
        [Validation(Required=false)]
        public string SubUserAccountId { get; set; }

        // 投资者用户红利账户ID
        [NameInMap("sub_user_bonus_account_id")]
        [Validation(Required=false)]
        public string SubUserBonusAccountId { get; set; }

        // 目标链名称
        [NameInMap("target_chain_name")]
        [Validation(Required=false)]
        public string TargetChainName { get; set; }

        // 目标链资产合约地址
        [NameInMap("target_chain_asset_token_address")]
        [Validation(Required=false)]
        public string TargetChainAssetTokenAddress { get; set; }

        // 目标链红利合约地址
        [NameInMap("target_chain_bonus_address")]
        [Validation(Required=false)]
        public string TargetChainBonusAddress { get; set; }

        // 对侧链账户信息
        [NameInMap("cross_chain_accounts_info")]
        [Validation(Required=false)]
        public List<CrossChainAccountsVO> CrossChainAccountsInfo { get; set; }

    }

}
