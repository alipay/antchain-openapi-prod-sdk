// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 证据清单
    public class EvidentialCheckList : TeaModel {
        // 证据名称英文 
        [NameInMap("evidential_name_en")]
        [Validation(Required=true)]
        public string EvidentialNameEn { get; set; }

        // 文件名称
        [NameInMap("oss_file_name")]
        [Validation(Required=true)]
        public string OssFileName { get; set; }

        // 文件fileKey ，调用获取文件上传链接时对应的fileKey
        [NameInMap("oss_file_key")]
        [Validation(Required=true)]
        public string OssFileKey { get; set; }

        // 证据来源
        // BUSINESS_UPLOAD	业务传入
        // ADD_MANULLY	手动添加
        [NameInMap("sources_of_evidence")]
        [Validation(Required=true)]
        public string SourcesOfEvidence { get; set; }

        // 证据类型
        // BLOCKCHAIN_DEPOSIT	区块链存证
        // USER_UPLOAD	用户上传
        [NameInMap("evidence_type")]
        [Validation(Required=true)]
        public string EvidenceType { get; set; }

        // 存证类型
        // TEXT	文本
        // FILE	文件
        [NameInMap("deposit_type")]
        [Validation(Required=true)]
        public string DepositType { get; set; }

        // 存证哈希 当为区块链存证必填
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 存证时间 当为区块链存证必填
        [NameInMap("deposit_time")]
        [Validation(Required=false)]
        public string DepositTime { get; set; }

    }

}
