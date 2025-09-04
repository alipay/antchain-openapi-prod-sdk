// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    // 资产账户明细与红利账户明细
    public class SubUserAccountDetailVO : TeaModel {
        // 项目ID
        [NameInMap("project_id")]
        [Validation(Required=true)]
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

        // 资产账户明细
        [NameInMap("sub_user_account_details")]
        [Validation(Required=false)]
        public List<SubUserAccountDetailsVO> SubUserAccountDetails { get; set; }

        // 红利账户明细
        [NameInMap("sub_user_bonus_account_details")]
        [Validation(Required=false)]
        public List<SubUserBonusAccountDetailVO> SubUserBonusAccountDetails { get; set; }

    }

}
