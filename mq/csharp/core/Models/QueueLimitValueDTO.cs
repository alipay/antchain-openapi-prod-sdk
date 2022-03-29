// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 限流域值
    public class QueueLimitValueDTO : TeaModel {
        // 条件模式
        [NameInMap("c_mode")]
        [Validation(Required=true)]
        public string CMode { get; set; }

        // 限流域值id(新增限流规则时不填）
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 限流规则id(新增限流规则时不填）
        [NameInMap("limit_id")]
        [Validation(Required=true)]
        public long? LimitId { get; set; }

        // 限流域值
        [NameInMap("l_value")]
        [Validation(Required=true)]
        public string LValue { get; set; }

        // 单位时间
        [NameInMap("u_time")]
        [Validation(Required=true)]
        public string UTime { get; set; }

    }

}
