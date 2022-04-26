// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 阶段存证进度查询结果
    public class PhaseQueryResult : TeaModel {
        // 阶段ID
        [NameInMap("phase_id")]
        [Validation(Required=true)]
        public string PhaseId { get; set; }

        // 阶段存证的链上交易Hash，只有status为FINISH才会返回
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 阶段存证状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 阶段注册成功时间戳
        [NameInMap("register_time")]
        [Validation(Required=true)]
        public long? RegisterTime { get; set; }

    }

}
