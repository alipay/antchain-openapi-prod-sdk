// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 导出任务的日志
    public class TriggerLog : TeaModel {
        // 日志的唯一ID
        [NameInMap("uuid")]
        [Validation(Required=true)]
        public string Uuid { get; set; }

        // 日志的发生时间
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // 日志的最近修改时间
        [NameInMap("modify_time")]
        [Validation(Required=false)]
        public long? ModifyTime { get; set; }

        // 日志发生的位置
        [NameInMap("position")]
        [Validation(Required=true)]
        public TriggerCheckpoint Position { get; set; }

        // 日志状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
