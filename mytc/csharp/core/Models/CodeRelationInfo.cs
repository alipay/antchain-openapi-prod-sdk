// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYTC.Models
{
    // 溯源码关联信息
    public class CodeRelationInfo : TeaModel {
        // 溯源码，代表该账户的唯一资源标识
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 状态,客户自定义状态，用于过滤查询使用，仅支持字母数字构成
        // 
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 关联内容
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 区块链上交易哈希
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度128
        [NameInMap("biz_labels")]
        [Validation(Required=false)]
        public List<string> BizLabels { get; set; }

        // 溯源码信息关联记录唯一标识
        [NameInMap("unique_id")]
        [Validation(Required=false)]
        public string UniqueId { get; set; }

    }

}
