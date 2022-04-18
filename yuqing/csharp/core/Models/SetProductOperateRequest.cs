// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    public class SetProductOperateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求入参
        [NameInMap("input_json")]
        [Validation(Required=true)]
        public string InputJson { get; set; }

        // 操作类型
        [NameInMap("operate_type")]
        [Validation(Required=true)]
        public string OperateType { get; set; }

    }

}
