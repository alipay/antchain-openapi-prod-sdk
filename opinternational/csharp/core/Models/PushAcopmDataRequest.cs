// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OPINTERNATIONAL.Models
{
    public class PushAcopmDataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // executor type
        [NameInMap("executor_type")]
        [Validation(Required=true)]
        public string ExecutorType { get; set; }

        // 数据类型
        [NameInMap("method_type")]
        [Validation(Required=true)]
        public string MethodType { get; set; }

        // data content
        [NameInMap("data_content")]
        [Validation(Required=true)]
        public string DataContent { get; set; }

    }

}
