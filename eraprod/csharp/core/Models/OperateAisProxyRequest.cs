// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ERAPROD.Models
{
    public class OperateAisProxyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 入参json
        [NameInMap("biz_data")]
        [Validation(Required=true)]
        public string BizData { get; set; }

        // 系统参数
        [NameInMap("system_data")]
        [Validation(Required=true)]
        public string SystemData { get; set; }

    }

}
