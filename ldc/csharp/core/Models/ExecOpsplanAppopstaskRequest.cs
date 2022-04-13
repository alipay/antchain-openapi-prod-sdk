// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class ExecOpsplanAppopstaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 操作类型
        [NameInMap("control_type")]
        [Validation(Required=true)]
        public string ControlType { get; set; }

        // pipeline stage 名字
        [NameInMap("action_code")]
        [Validation(Required=true)]
        public string ActionCode { get; set; }

        // 任务id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // operator名字
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // [huanyu场景使用]，当cancel_plan_flag为true, control_type=CANCEL且action_code=CLOUD_NATIVE_DEPLOY时，整个运维单将被取消
        [NameInMap("cancel_plan_flag")]
        [Validation(Required=false)]
        public bool? CancelPlanFlag { get; set; }

    }

}
