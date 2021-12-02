// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAFECMDB.Models
{
    // 审计日志
    public class AuditLog : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 操作者
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 操作的对象类别
        [NameInMap("resource_type")]
        [Validation(Required=true)]
        public string ResourceType { get; set; }

        // 动作
        [NameInMap("action")]
        [Validation(Required=true)]
        public string Action { get; set; }

        // 对象的ID
        [NameInMap("targets")]
        [Validation(Required=true)]
        public List<string> Targets { get; set; }

        // operation_time
        [NameInMap("operation_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string OperationTime { get; set; }

    }

}
