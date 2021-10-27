// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 电子合同存证签署信息
    public class ContractNotarySignInfo : TeaModel {
        // 本阶段存证内容哈希值
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 电子合同文件hash，可能一次性签署多个文件，不同文件的hash间用“,”分隔开
        [NameInMap("contract_hash")]
        [Validation(Required=true)]
        public string ContractHash { get; set; }

        // 签署人ID
        [NameInMap("signatory")]
        [Validation(Required=true)]
        public string Signatory { get; set; }

        // 存证阶段发生时间，UNIX时间戳(毫秒)
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public string Timestamp { get; set; }

        // 存证凭据，仅在批量核验时需要填写
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 发起人名称
        [NameInMap("intiator_name")]
        [Validation(Required=false)]
        public string IntiatorName { get; set; }

        // 签署人名称,多个逗号隔开
        [NameInMap("signator_names")]
        [Validation(Required=false)]
        public string SignatorNames { get; set; }

        // 详细文件哈希
        [NameInMap("detail_info_file_hash")]
        [Validation(Required=false)]
        public string DetailInfoFileHash { get; set; }

    }

}
