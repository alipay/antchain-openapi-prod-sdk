// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    public class OperateCommonInterfaceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 入参JSON
        [NameInMap("param_json")]
        [Validation(Required=true)]
        public string ParamJson { get; set; }

        // 接口名称
        [NameInMap("interface_name")]
        [Validation(Required=true)]
        public string InterfaceName { get; set; }

        // 请求ID
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

    }

}
