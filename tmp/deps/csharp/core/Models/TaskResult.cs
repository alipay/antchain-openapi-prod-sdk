// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 异步任务执行结果。
    public class TaskResult : TeaModel {
        // 任务执行结果。取值：
        //                     SUCCESSFUL：任务执行成功；
        //                     FAILED：任务执行失败
        //                 
        [NameInMap("result")]
        [Validation(Required=false)]
        public string Result { get; set; }

        // 任务目标id，如：一个Computer的id
        [NameInMap("target_id")]
        [Validation(Required=false)]
        public string TargetId { get; set; }

    }

}
