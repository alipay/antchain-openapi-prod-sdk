// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTCALLAGENT.Models
{
    public class QueryVoiceserviceQuerycalldetailRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 分配的租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 分配的业务code
        [NameInMap("instance_code")]
        [Validation(Required=true)]
        public string InstanceCode { get; set; }

        // 通话的唯一识别 ID。调用外呼接口发起通话后，返回参数中会携带 CallId。
        [NameInMap("call_id")]
        [Validation(Required=true)]
        public string CallId { get; set; }

        // 通话发生的时间。格式为 Unix 时间戳，单位：毫秒。
        [NameInMap("query_date")]
        [Validation(Required=true)]
        public string QueryDate { get; set; }

    }

}
