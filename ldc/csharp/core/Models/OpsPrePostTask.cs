// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 前后置任务
    public class OpsPrePostTask : TeaModel {
        // 
        //           任务类型。
        //           中间件任务：
        //           MESSAGE_BROKER_TOPIC：消息中间件TOPIC；
        //           MESSAGE_BROKER_TOPIC_SUB：消息中间件绑定关系；
        //           DRM_RESOURCE：DRM资源；
        //           SCHEDULER_TASK：定时任务；
        //           其他类型任务待定。
        //         
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 
        //           操作类型。取值列表：
        //           CREATE：新建；
        //           UPDATE：更新；
        //           DELETE：删除；
        //           UNDEFINED：未定义；
        //         
        [NameInMap("operation_type")]
        [Validation(Required=false)]
        public string OperationType { get; set; }

        // 
        //           任务详情，JSON字符串
        //         
        [NameInMap("detail")]
        [Validation(Required=false)]
        public string Detail { get; set; }

        // 
        //           任务状态。取值列表：EXECUTING：执行中；SUCCEEDED：执行成功；FAILED：执行失败；IGNORED：已忽略
        //         
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
