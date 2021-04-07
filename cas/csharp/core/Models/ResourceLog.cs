// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 任务日志
    public class ResourceLog : TeaModel {
        // host
        [NameInMap("host")]
        [Validation(Required=false)]
        public string Host { get; set; }

        // log_time
        [NameInMap("log_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string LogTime { get; set; }

        // message
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

        // resource_id
        [NameInMap("resource_id")]
        [Validation(Required=false)]
        public string ResourceId { get; set; }

        // resource_type
        [NameInMap("resource_type")]
        [Validation(Required=false)]
        public string ResourceType { get; set; }

        // severity
        [NameInMap("severity")]
        [Validation(Required=false)]
        public string Severity { get; set; }

        // source
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

        // task_id
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // task_times
        [NameInMap("task_times")]
        [Validation(Required=true)]
        public long? TaskTimes { get; set; }

        // type
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // iaas_error_info
        [NameInMap("iaas_error_info")]
        [Validation(Required=false)]
        public IaasErrorInfo IaasErrorInfo { get; set; }

        // iaas_request
        [NameInMap("iaas_request")]
        [Validation(Required=false)]
        public IaasRequest IaasRequest { get; set; }

        // iaas_response
        [NameInMap("iaas_response")]
        [Validation(Required=false)]
        public IaasResponse IaasResponse { get; set; }

    }

}
