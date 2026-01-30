// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_d3c4f09125a14cd587057c405561809a.Models
{
    // 对侧链持币情况
    public class CrossChainSubUserAccountCeilingBaseVO : TeaModel {
        // 项目ID
        [NameInMap("asset_project_id")]
        [Validation(Required=false)]
        public string AssetProjectId { get; set; }

        // 代币名称
        [NameInMap("token_name")]
        [Validation(Required=false)]
        public string TokenName { get; set; }

        // 代币合约地址
        [NameInMap("token_address")]
        [Validation(Required=false)]
        public string TokenAddress { get; set; }

        // 别名
        [NameInMap("alias")]
        [Validation(Required=false)]
        public string Alias { get; set; }

        // 实际持有份额
        [NameInMap("real_shares")]
        [Validation(Required=false)]
        public string RealShares { get; set; }

        // 代币名称
        [NameInMap("bonus_token_name")]
        [Validation(Required=false)]
        public string BonusTokenName { get; set; }

        // 代币合约名称
        [NameInMap("bonus_token_address")]
        [Validation(Required=false)]
        public string BonusTokenAddress { get; set; }

        // 红利份额
        [NameInMap("real_bonus")]
        [Validation(Required=false)]
        public string RealBonus { get; set; }

        // 目标链
        [NameInMap("taget_chain_type")]
        [Validation(Required=false)]
        public string TagetChainType { get; set; }

        // 目标链用户地址
        [NameInMap("target_user_address")]
        [Validation(Required=false)]
        public string TargetUserAddress { get; set; }

    }

}
