// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    public class ConfirmUnionApplyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 审核是否通过，SUCCESS,FAILURE,FREEZE
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 联盟id
        [NameInMap("union_id")]
        [Validation(Required=true)]
        public long? UnionId { get; set; }

        // 区块链ID，status为SUCCESS时需要传入
        [NameInMap("chain_id")]
        [Validation(Required=false)]
        public string ChainId { get; set; }

        // COMMON:普通链
        // TEE：TEE链
        // status为SUCCESS时需要填充
        [NameInMap("chain_type")]
        [Validation(Required=false)]
        public string ChainType { get; set; }

        // TEE场景下要部署的链上合约名称，chain_type为TEE时需要传入
        [NameInMap("contract_name")]
        [Validation(Required=false)]
        public string ContractName { get; set; }

        // 合约版本，TEE场景下需要传入
        [NameInMap("contract_version")]
        [Validation(Required=false)]
        public string ContractVersion { get; set; }

    }

}
