// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class SwitchBgreleaseGraytrafficRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 应用ID
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // 执行人
        [NameInMap("executor_id")]
        [Validation(Required=false)]
        public string ExecutorId { get; set; }

        // 执行人
        [NameInMap("executor_name")]
        [Validation(Required=false)]
        public string ExecutorName { get; set; }

        // 来自阿里云用户
        [NameInMap("from_aliyun")]
        [Validation(Required=false)]
        public bool? FromAliyun { get; set; }

        // 发布单ID
        [NameInMap("plan_id")]
        [Validation(Required=false)]
        public string PlanId { get; set; }

        // 比率
        [NameInMap("proportion")]
        [Validation(Required=false)]
        public long? Proportion { get; set; }

        // 目标ID
        [NameInMap("target_id")]
        [Validation(Required=false)]
        public string TargetId { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
