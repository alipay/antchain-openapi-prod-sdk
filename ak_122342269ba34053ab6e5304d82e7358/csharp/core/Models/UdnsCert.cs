// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_122342269ba34053ab6e5304d82e7358.Models
{
    // udns cert 相关属性信息
    public class UdnsCert : TeaModel {
        // 锚定块hash
        [NameInMap("anchored_block_hash")]
        [Validation(Required=false)]
        public string AnchoredBlockHash { get; set; }

        // 锚定块高度。
        [NameInMap("anchored_block_height")]
        [Validation(Required=false)]
        public long? AnchoredBlockHeight { get; set; }

        // 区块链id
        [NameInMap("blockchain_id")]
        [Validation(Required=false)]
        public string BlockchainId { get; set; }

        // fabric 链码
        [NameInMap("chaincode")]
        [Validation(Required=false)]
        public string Chaincode { get; set; }

        // 通道名。
        [NameInMap("channel")]
        [Validation(Required=false)]
        public string Channel { get; set; }

        // {"anchoredBlockcHeight": 12345, "anchoredBlockHash": "abcefgh", "poaCertPublicKeyHashList": ["abcdefg","abcdefg"]}
        [NameInMap("detail_info")]
        [Validation(Required=false)]
        public string DetailInfo { get; set; }

        // 链域名
        [NameInMap("domain")]
        [Validation(Required=false)]
        public string Domain { get; set; }

        // 证书公钥列表	
        // 
        [NameInMap("poa_cert_public_key_hash_list")]
        [Validation(Required=false)]
        public List<string> PoaCertPublicKeyHashList { get; set; }

        // 目标公钥
        [NameInMap("subject_public_key")]
        [Validation(Required=false)]
        public string SubjectPublicKey { get; set; }

        // 目标svn
        [NameInMap("svn")]
        [Validation(Required=false)]
        public long? Svn { get; set; }

        // 区块链类型：MYCHAIN_010, FABRIC_14	
        // 
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // base64编码后的udns
        [NameInMap("udns_base64")]
        [Validation(Required=false)]
        public string UdnsBase64 { get; set; }

        // 验证者证书列表
        [NameInMap("validator_cert_list")]
        [Validation(Required=false)]
        public long? ValidatorCertList { get; set; }

        // 版本号
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

    }

}
