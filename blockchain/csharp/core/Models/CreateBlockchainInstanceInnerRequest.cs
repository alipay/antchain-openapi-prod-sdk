// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateBlockchainInstanceInnerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 区块链名称
        [NameInMap("blockchain_name")]
        [Validation(Required=true)]
        public string BlockchainName { get; set; }

        // 链打标内容
        [NameInMap("blockchain_tag")]
        [Validation(Required=false)]
        public string BlockchainTag { get; set; }

        // Tee链/企业版/企业版  enterprise
        [NameInMap("blockchain_type")]
        [Validation(Required=true)]
        public string BlockchainType { get; set; }

        // 待创建联盟的信息
        [NameInMap("create_union_info")]
        [Validation(Required=false)]
        public BaasUnionInfo CreateUnionInfo { get; set; }

        // 节点数
        [NameInMap("node_number")]
        [Validation(Required=true)]
        public long? NodeNumber { get; set; }

        // 联盟id
        [NameInMap("union_id")]
        [Validation(Required=false)]
        public long? UnionId { get; set; }

        // 业务线code
        [NameInMap("group_code")]
        [Validation(Required=true)]
        public string GroupCode { get; set; }

        // 业务线子码
        [NameInMap("group_sub_code")]
        [Validation(Required=true)]
        public string GroupSubCode { get; set; }

        // 是否需要创建测试链
        [NameInMap("test_chain")]
        [Validation(Required=true)]
        public bool? TestChain { get; set; }

    }

}
