// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_d3c4f09125a14cd587057c405561809a.Models
{
    // 虚拟子账号明细与红利明细
    public class SubUserVirtualAccountListVO : TeaModel {
        // 项目ID
        [NameInMap("asset_project_id")]
        [Validation(Required=false)]
        public string AssetProjectId { get; set; }

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

        // 链名
        [NameInMap("chain_name")]
        [Validation(Required=false)]
        public string ChainName { get; set; }

        // 投资者用户账户ID
        [NameInMap("sub_user_account_id")]
        [Validation(Required=false)]
        public string SubUserAccountId { get; set; }

        // 虚拟子账户ID
        [NameInMap("sub_user_virtual_account_id")]
        [Validation(Required=false)]
        public string SubUserVirtualAccountId { get; set; }

        // 虚拟子账户红利账户ID
        [NameInMap("sub_user_bonus_virtual_account_id")]
        [Validation(Required=false)]
        public string SubUserBonusVirtualAccountId { get; set; }

        // 虚拟子账户明细
        [NameInMap("sub_user_virtual_account_details")]
        [Validation(Required=false)]
        public List<SubUserVirtualAccountDetailVO> SubUserVirtualAccountDetails { get; set; }

        // 虚拟子账户红利明细
        [NameInMap("sub_user_bonus_virtual_account_details")]
        [Validation(Required=false)]
        public List<SubUserBonusVirtualAccountDetailVO> SubUserBonusVirtualAccountDetails { get; set; }

    }

}
