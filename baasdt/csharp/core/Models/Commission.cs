// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 手续费信息
    public class Commission : TeaModel {
        // 要更新的手续费状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 手续费生效时间（时间戳 ms）
        [NameInMap("begin_time")]
        [Validation(Required=false)]
        public long? BeginTime { get; set; }

        // 手续费结束时间
        [NameInMap("end_time")]
        [Validation(Required=false)]
        public long? EndTime { get; set; }

        // 手续费
        [NameInMap("commission")]
        [Validation(Required=true)]
        public string Commission_ { get; set; }

    }

}
