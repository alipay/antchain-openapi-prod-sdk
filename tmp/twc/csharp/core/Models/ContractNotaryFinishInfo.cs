// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 电子合同存证结束信息
    public class ContractNotaryFinishInfo : TeaModel {
        // 本阶段存证内容哈希值
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 签署文件份数
        [NameInMap("file_num")]
        [Validation(Required=true)]
        public long? FileNum { get; set; }

        // 发起人ID
        [NameInMap("initiator")]
        [Validation(Required=true)]
        public string Initiator { get; set; }

        // 签署人ID（支持多个，不同ID间用“,”分隔开）
        [NameInMap("signatories")]
        [Validation(Required=true)]
        public string Signatories { get; set; }

        // 存证阶段发生时间，UNIX时间戳(毫秒)
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public string Timestamp { get; set; }

        // 存证凭据，仅在批量核验时需要填写
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // signatories对应的用户类型
        [NameInMap("user_types")]
        [Validation(Required=false)]
        public string UserTypes { get; set; }

        // 签署合同所属行业
        [NameInMap("business_type")]
        [Validation(Required=false)]
        public string BusinessType { get; set; }

        // 合同对应的金额，如果不涉及金额，填充为0，个数与file_num对应
        [NameInMap("amounts")]
        [Validation(Required=false)]
        public string Amounts { get; set; }

    }

}
