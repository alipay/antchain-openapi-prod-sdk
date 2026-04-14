// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTCALL.Models
{
    public class ImportAntcloudDtcallagentDispatcherOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 请求唯一 ID，建议全局唯一
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 实例code
        [NameInMap("instance_code")]
        [Validation(Required=true)]
        public string InstanceCode { get; set; }

        // 外呼任务编码
        [NameInMap("task_code")]
        [Validation(Required=true)]
        public string TaskCode { get; set; }

        // 外呼调度时间，实际拨打时间大于等于该时间，建议格式：yyyy-MM-dd HH:mm:ss
        [NameInMap("call_time")]
        [Validation(Required=true)]
        public string CallTime { get; set; }

        // 失效时间，建议格式：yyyy-MM-dd HH:mm:ss，默认 7 天
        [NameInMap("expiration_time")]
        [Validation(Required=false)]
        public string ExpirationTime { get; set; }

        // 触达用户列表，单次上限 100
        [NameInMap("customer_list")]
        [Validation(Required=true)]
        public List<Customer> CustomerList { get; set; }

    }

}
