// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_630ce8157b69499bbf96c1910a852241.Models
{
    // 阿里云蚂蚁链对象
    public class ALiYunAntChain : TeaModel {
        // ant_chain_id
        [NameInMap("ant_chain_id")]
        [Validation(Required=false)]
        public string AntChainId { get; set; }

        // 链名称
        [NameInMap("ant_chain_name")]
        [Validation(Required=false)]
        public string AntChainName { get; set; }

        // 链的类型
        [NameInMap("chain_type")]
        [Validation(Required=false)]
        public string ChainType { get; set; }

        // cipher_suit
        [NameInMap("cipher_suit")]
        [Validation(Required=false)]
        public string CipherSuit { get; set; }

        // 创建时间
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // expire_time
        [NameInMap("expire_time")]
        [Validation(Required=false)]
        public long? ExpireTime { get; set; }

        // instance_id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // is_admin
        [NameInMap("is_admin")]
        [Validation(Required=false)]
        public bool? IsAdmin { get; set; }

        // 成员状态
        [NameInMap("member_status")]
        [Validation(Required=false)]
        public string MemberStatus { get; set; }

        // merkle_tree_suit
        [NameInMap("merkle_tree_suit")]
        [Validation(Required=false)]
        public string MerkleTreeSuit { get; set; }

        // Network
        [NameInMap("network")]
        [Validation(Required=false)]
        public string Network { get; set; }

        // 节点数
        [NameInMap("node_num")]
        [Validation(Required=false)]
        public long? NodeNum { get; set; }

        // 区域信息
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // 链的资源大小
        [NameInMap("resource_size")]
        [Validation(Required=false)]
        public string ResourceSize { get; set; }

        // 算法参数
        [NameInMap("tls_algo")]
        [Validation(Required=false)]
        public string TlsAlgo { get; set; }

        // 版本信息
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

    }

}
