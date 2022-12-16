// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    public class QueryMypocketUserauthinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户授权信息
        [NameInMap("authorization")]
        [Validation(Required=true)]
        public Authorization Authorization { get; set; }

        // 签名字符串
        [NameInMap("did_sign")]
        [Validation(Required=true)]
        public string DidSign { get; set; }

        // 签名的用户did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

    }

}
