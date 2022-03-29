// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 任务执行记录详情
    public class TaskRecordDTO : TeaModel {
        // 结束时间
        // 
        // 
        [NameInMap("end")]
        [Validation(Required=false)]
        public string End { get; set; }

        // 任务分区名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 开始时间
        // 
        // 
        [NameInMap("start")]
        [Validation(Required=true)]
        public string Start { get; set; }

        // 耗时 s
        // 
        // 
        [NameInMap("time")]
        [Validation(Required=false)]
        public string Time { get; set; }

        // 任务进度
        // 
        // 
        [NameInMap("progress")]
        [Validation(Required=true)]
        public string Progress { get; set; }

        // 执行成功，执行失败，执行中
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
