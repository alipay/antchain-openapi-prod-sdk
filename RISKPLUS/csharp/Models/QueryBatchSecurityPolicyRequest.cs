// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryBatchSecurityPolicyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求事件编码
        [NameInMap("event_code")]
        [Validation(Required=true)]
        public string EventCode { get; set; }

        // 查询客户主体
        [NameInMap("query_keys")]
        [Validation(Required=true)]
        public List<string> QueryKeys { get; set; }

        // 用户凭证类型, 手机号/身份证号/加密类型等
        [NameInMap("query_key_type")]
        [Validation(Required=true)]
        public string QueryKeyType { get; set; }

        // 额外的事件属性
        [NameInMap("event_info")]
        [Validation(Required=true)]
        public List<EventInfo> EventInfo { get; set; }

    }

}
