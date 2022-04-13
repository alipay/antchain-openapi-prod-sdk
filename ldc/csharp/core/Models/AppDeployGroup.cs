// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 应用发布分组，一个分组一般包含前置任务(可多个)、发布任务(一个)、后置任务(可多个)
    public class AppDeployGroup : TeaModel {
        // 发布任务
        [NameInMap("deploy_task")]
        [Validation(Required=true)]
        public AppDeployTask DeployTask { get; set; }

        // 后置任务列表
        [NameInMap("post_tasks")]
        [Validation(Required=true)]
        public List<AppDeployTask> PostTasks { get; set; }

        // 前置任务列表
        [NameInMap("pre_tasks")]
        [Validation(Required=true)]
        public List<AppDeployTask> PreTasks { get; set; }

    }

}
