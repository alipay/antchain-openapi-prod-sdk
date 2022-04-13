// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // LksServiceProcessLog
    public class ServiceProcessLog : TeaModel {
        // Logs属性
        [NameInMap("attributes")]
        [Validation(Required=true)]
        public string Attributes { get; set; }

        // 错误追溯
        [NameInMap("error_stack_traces")]
        [Validation(Required=true)]
        public string ErrorStackTraces { get; set; }

        // 发布阶段，INIT，PARSE， EXECUTE
        [NameInMap("exec_phase")]
        [Validation(Required=true)]
        public string ExecPhase { get; set; }

        // 关联对象类型，RPV2，RP_STAGE，POD
        [NameInMap("inv_object_kind")]
        [Validation(Required=true)]
        public string InvObjectKind { get; set; }

        // 对应object的name
        [NameInMap("inv_object_name")]
        [Validation(Required=true)]
        public string InvObjectName { get; set; }

        // 对应object的namespace
        [NameInMap("inv_object_namespace")]
        [Validation(Required=true)]
        public string InvObjectNamespace { get; set; }

        // log_time
        [NameInMap("log_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string LogTime { get; set; }

        // Logs详情
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

        // Logs原因
        [NameInMap("reason")]
        [Validation(Required=true)]
        public string Reason { get; set; }

        // 关联的ldc_plan id
        [NameInMap("ref_plan")]
        [Validation(Required=true)]
        public string RefPlan { get; set; }

        // 关联的lks_service id
        [NameInMap("ref_service")]
        [Validation(Required=true)]
        public string RefService { get; set; }

        // Logs的来源，ldcconsole，orch_event，opsware_event
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

    }

}
