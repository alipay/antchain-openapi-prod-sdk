// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_d3c4f09125a14cd587057c405561809a.Models
{
    // 项目基础信息
    public class ProjectBaseInfoVO : TeaModel {
        // 项目id
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 资产项目合约地址
        // （Launch Network/Shares token ）
        [NameInMap("asset_project_address")]
        [Validation(Required=false)]
        public string AssetProjectAddress { get; set; }

        // 项目名称
        [NameInMap("project_name")]
        [Validation(Required=false)]
        public string ProjectName { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 项目状态
        [NameInMap("project_status")]
        [Validation(Required=false)]
        public string ProjectStatus { get; set; }

        // 项目所在链（Launch Network）
        [NameInMap("chain_type")]
        [Validation(Required=false)]
        public string ChainType { get; set; }

        // 代币名称
        [NameInMap("token_name")]
        [Validation(Required=false)]
        public string TokenName { get; set; }

        // 项目代币符号
        [NameInMap("token_symbol")]
        [Validation(Required=false)]
        public string TokenSymbol { get; set; }

        // 总发行量
        [NameInMap("capacity")]
        [Validation(Required=false)]
        public string Capacity { get; set; }

        // 单钱包最大可持有份额
        [NameInMap("max_subscription_amount")]
        [Validation(Required=false)]
        public string MaxSubscriptionAmount { get; set; }

        // 创建时间戳（毫秒）
        [NameInMap("gmt_created")]
        [Validation(Required=false)]
        public long? GmtCreated { get; set; }

    }

}
