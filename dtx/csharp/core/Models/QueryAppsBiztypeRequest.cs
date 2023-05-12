// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    public class QueryAppsBiztypeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // app_name
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // biz_type
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // instance_id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // saga状态机定义id
        [NameInMap("statemachine_id")]
        [Validation(Required=false)]
        public string StatemachineId { get; set; }

    }

}
