// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartDidAgentVerifyauthresponseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // { ''challenge":xxxx, //待签名的明文
        //  “expired”：xxxx,//签名有效时间 
        // “sign”：xxxx，//对上述字段进行的签名
        // }
        [NameInMap("auth_response")]
        [Validation(Required=true)]
        public string AuthResponse { get; set; }

        // 待验证的did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
