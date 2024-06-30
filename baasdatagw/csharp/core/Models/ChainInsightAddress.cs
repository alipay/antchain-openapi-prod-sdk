// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 数据洞察链上地址信息
    public class ChainInsightAddress : TeaModel {
        // 链ID
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 链名称
        [NameInMap("biz_id_name")]
        [Validation(Required=false)]
        public string BizIdName { get; set; }

        // 账户或合约地址
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

        // 创建者租户ID
        [NameInMap("creator_organization")]
        [Validation(Required=false)]
        public string CreatorOrganization { get; set; }

        // 创建者地址
        [NameInMap("creator")]
        [Validation(Required=true)]
        public string Creator { get; set; }

        // 创建时间
        [NameInMap("craete_time")]
        [Validation(Required=true)]
        public long? CraeteTime { get; set; }

        // 创建交易ID
        [NameInMap("create_tx_id")]
        [Validation(Required=true)]
        public string CreateTxId { get; set; }

        // 修改时间戳
        [NameInMap("modify_time")]
        [Validation(Required=true)]
        public long? ModifyTime { get; set; }

        // 最近修改账户的交易ID
        [NameInMap("modify_tx_id")]
        [Validation(Required=true)]
        public string ModifyTxId { get; set; }

        // 地址类型，枚举：Account，Contract
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 地址状态，枚举：NORMAL，FREEZE，RECOVERING，UNKNOWN
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 地址余额
        [NameInMap("balance")]
        [Validation(Required=true)]
        public long? Balance { get; set; }

        // 认证Map
        [NameInMap("auth_map")]
        [Validation(Required=true)]
        public List<MapEntry> AuthMap { get; set; }

        // 地址恢复公钥
        [NameInMap("recover_key")]
        [Validation(Required=true)]
        public string RecoverKey { get; set; }

        // 合约类型，仅当地址为合约时返回：WASM、SOLIDITY
        [NameInMap("contract_type")]
        [Validation(Required=false)]
        public string ContractType { get; set; }

        // 资产合约相关信息
        [NameInMap("asset_contract_info")]
        [Validation(Required=false)]
        public ChainInsightAssetContractInfo AssetContractInfo { get; set; }

        // 创建时间
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public long? CreateTime { get; set; }

    }

}
