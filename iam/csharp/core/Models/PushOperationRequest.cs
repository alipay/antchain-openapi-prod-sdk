// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class PushOperationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // {产品}.{资源}.{子资源}.{操作}
        [NameInMap("operation_code")]
        [Validation(Required=true)]
        public string OperationCode { get; set; }

        // 操作参数
        [NameInMap("params")]
        [Validation(Required=true)]
        public string Params { get; set; }

        // 可用区域信息，非必填
        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

        // 资源ID
        [NameInMap("resource_id")]
        [Validation(Required=false)]
        public string ResourceId { get; set; }

        // 资源类型
        [NameInMap("resource_type")]
        [Validation(Required=false)]
        public string ResourceType { get; set; }

        // 相应结果
        [NameInMap("response")]
        [Validation(Required=false)]
        public string Response { get; set; }

        // 操作来源，由接入方上报自身系统host
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

        // 操作来源IP，由接入方上报
        [NameInMap("source_ip_address")]
        [Validation(Required=false)]
        public string SourceIpAddress { get; set; }

        // 触发时间
        [NameInMap("time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string Time { get; set; }

        // TraceId用于事件追踪
        [NameInMap("trace_id")]
        [Validation(Required=false)]
        public string TraceId { get; set; }

        // agent信息
        [NameInMap("user_agent")]
        [Validation(Required=false)]
        public string UserAgent { get; set; }

        // 用户ID
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 租户8位ID
        [NameInMap("user_tenant")]
        [Validation(Required=true)]
        public string UserTenant { get; set; }

    }

}
