// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class SendCreditProxyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 代理请求方法名
        [NameInMap("apply_method")]
        [Validation(Required=true)]
        public string ApplyMethod { get; set; }

        // 代理请求数据
        [NameInMap("apply_data")]
        [Validation(Required=true)]
        public string ApplyData { get; set; }

    }

}
