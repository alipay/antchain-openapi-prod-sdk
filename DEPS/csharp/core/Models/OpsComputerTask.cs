// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 一个计算容器上正在执行的任务。
    public class OpsComputerTask : TeaModel {
        // 任务描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 执行详情。如果任务成功，为执行日志；如果任务失败，为错误信息
        [NameInMap("execute_details")]
        [Validation(Required=false)]
        public string ExecuteDetails { get; set; }

        // 任务结束时间
        [NameInMap("finish_time")]
        [Validation(Required=false)]
        public string FinishTime { get; set; }

        // 任务名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 任务开始时间
        [NameInMap("start_time")]
        [Validation(Required=false)]
        public string StartTime { get; set; }

        // 任务状态。取值列表：
        //                     EXECUTING：执行中；
        //                     SUCCESS：执行成功；
        //                     FAILED：执行失败
        //                 
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
