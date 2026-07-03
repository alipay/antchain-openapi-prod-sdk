// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class PushUmktCustomerGroupRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 事件ID
        [NameInMap("event_id")]
        [Validation(Required=true)]
        public string EventId { get; set; }

        // 数据属性
        [NameInMap("properties")]
        [Validation(Required=true)]
        public string Properties { get; set; }

    }

}
