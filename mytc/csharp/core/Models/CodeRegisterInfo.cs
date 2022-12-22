// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYTC.Models
{
    // 码注册信息
    public class CodeRegisterInfo : TeaModel {
        // 溯源码，代表该账户的唯一资源标识
        [NameInMap("code")]
        [Validation(Required=true, MaxLength=160)]
        public string Code { get; set; }

        // 状态,客户自定义状态，用于过滤查询使用
        [NameInMap("status")]
        [Validation(Required=false, MaxLength=32)]
        public string Status { get; set; }

        // 关联溯源码列表，可以通过接口查询关联溯源码绑定的信息
        [NameInMap("relation_codes")]
        [Validation(Required=false)]
        public List<string> RelationCodes { get; set; }

        // 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度128
        [NameInMap("biz_labels")]
        [Validation(Required=false)]
        public List<string> BizLabels { get; set; }

        // 注册内容
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 区块链上交易哈希
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 注册溯源码记录唯一标识
        [NameInMap("unique_id")]
        [Validation(Required=false)]
        public string UniqueId { get; set; }

    }

}
