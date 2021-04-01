// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartAuthCorporateSignRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 需要进行签名的字符串，按规定方式进行传参拼接并sha256
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

        // 需要代理签名的目标did，此did是当前请求方申请在授权宝控制创建
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

    }

}
