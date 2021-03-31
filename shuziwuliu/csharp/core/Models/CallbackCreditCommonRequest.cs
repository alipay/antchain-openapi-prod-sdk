// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class CallbackCreditCommonRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 回调数据，根据不同msg_method 返回不同结构
        [NameInMap("msg_data")]
        [Validation(Required=true)]
        public string MsgData { get; set; }

        // 回调方法类型
        [NameInMap("msg_method")]
        [Validation(Required=true)]
        public string MsgMethod { get; set; }

    }

}
