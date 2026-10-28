// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ExecAiotdatalinkInterfaceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 服务接口
        [NameInMap("api")]
        [Validation(Required=true)]
        public string Api { get; set; }

        // 请求示例，会根据不同的接口传入不同的参数，json 格式字符串
        [NameInMap("request_data")]
        [Validation(Required=true)]
        public string RequestData { get; set; }

    }

}
