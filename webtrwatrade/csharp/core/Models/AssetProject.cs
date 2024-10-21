// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    // 资产项目信息
    public class AssetProject : TeaModel {
        // 项目ID
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 项目名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 项目代币名称
        [NameInMap("token_name")]
        [Validation(Required=true)]
        public string TokenName { get; set; }

        // 项目介绍
        [NameInMap("info")]
        [Validation(Required=true)]
        public string Info { get; set; }

        // 当前供应量
        [NameInMap("supply")]
        [Validation(Required=true)]
        public string Supply { get; set; }

        // 最大供应量
        [NameInMap("capacity")]
        [Validation(Required=true)]
        public string Capacity { get; set; }

        // 供应量比例(supply/capacity * 100，保留2位小数)
        [NameInMap("radio")]
        [Validation(Required=true)]
        public long? Radio { get; set; }

        // 持有人数量
        [NameInMap("user_number")]
        [Validation(Required=true)]
        public long? UserNumber { get; set; }

        // 资产token合约地址
        [NameInMap("asset_token_address")]
        [Validation(Required=true)]
        public string AssetTokenAddress { get; set; }

        // 资产规则引擎合约地址
        [NameInMap("rule_engine_address")]
        [Validation(Required=true)]
        public string RuleEngineAddress { get; set; }

        // 资产白名单合约地址
        [NameInMap("member_list_rule_address")]
        [Validation(Required=true)]
        public string MemberListRuleAddress { get; set; }

        // 项目状态(ACTIVE：激活；PAUSED：暂停)
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 项目净值
        [NameInMap("net_value")]
        [Validation(Required=true)]
        public string NetValue { get; set; }

        // 项目币种(目前支持USD、HKD)
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

        // 项目创建时间戳
        [NameInMap("gmt_created")]
        [Validation(Required=true)]
        public long? GmtCreated { get; set; }

        // 项目修改时间戳
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public long? GmtModified { get; set; }

    }

}
