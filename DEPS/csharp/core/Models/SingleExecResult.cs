// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 对一个对象执行一条指令的结果。
    public class SingleExecResult : TeaModel {
        // 执行结果详情。如果成功，为执行日志；如果失败，为错误信息
        [NameInMap("execute_details")]
        [Validation(Required=false)]
        public string ExecuteDetails { get; set; }

        // 执行结束时间
        [NameInMap("finish_time")]
        [Validation(Required=false)]
        public int? FinishTime { get; set; }

        // 执行开始时间
        [NameInMap("start_time")]
        [Validation(Required=false)]
        public int? StartTime { get; set; }

        // 执行结果状态。取值列表：
        //                     EXECUTING：执行中；
        //                     SUCCESS：执行成功；
        //                     FAILED：执行失败；
        //                     IGNORED：已忽略；
        //                     TIME_OUT：已超时
        //                 
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 执行对象。比如一台机器的ip 
        [NameInMap("target")]
        [Validation(Required=false)]
        public string Target { get; set; }

    }

}
