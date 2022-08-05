// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BBP.Models
{
    public class MatchDidAssetsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码(YYX)
        [NameInMap("biz_code")]
        [Validation(Required=true)]
        public string BizCode { get; set; }

        // 支付宝uid
        [NameInMap("uid")]
        [Validation(Required=true)]
        public string Uid { get; set; }

        // 分布式id ，双向check
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 链id
        [NameInMap("chain_id")]
        [Validation(Required=false)]
        public string ChainId { get; set; }

        // 链账户
        [NameInMap("chain_account")]
        [Validation(Required=true)]
        public string ChainAccount { get; set; }

        // 链资产地址 HASH
        [NameInMap("contract")]
        [Validation(Required=true)]
        public string Contract { get; set; }

        // 合约类型 0-WASM
        [NameInMap("contract_type")]
        [Validation(Required=true)]
        public long? ContractType { get; set; }

        // 资产类型
        [NameInMap("assert_type")]
        [Validation(Required=true)]
        public string AssertType { get; set; }

        // 上次资产发生变更的区块高度
        [NameInMap("block_number")]
        [Validation(Required=false)]
        public string BlockNumber { get; set; }

        // 上次资产发生变更的序号
        [NameInMap("tx_index")]
        [Validation(Required=true)]
        public string TxIndex { get; set; }

        // 上次资产发生变更的交易序列号
        [NameInMap("long_index")]
        [Validation(Required=true)]
        public string LongIndex { get; set; }

        // 资产名称
        [NameInMap("assert_name")]
        [Validation(Required=true)]
        public string AssertName { get; set; }

        // 资产信息（资产描述信息）
        [NameInMap("assert_data")]
        [Validation(Required=true)]
        public string AssertData { get; set; }

        // 资产ID
        [NameInMap("assert_id")]
        [Validation(Required=true)]
        public string AssertId { get; set; }

    }

}
