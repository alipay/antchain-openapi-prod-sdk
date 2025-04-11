// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.UNICONTACT.Models
{
    public class ReplaceRobotcallPhoneRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求ID
        [NameInMap("req_id")]
        [Validation(Required=true)]
        public string ReqId { get; set; }

        // 当前时间戳毫秒值
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

        // 待解密号码
        [NameInMap("aesphone")]
        [Validation(Required=true)]
        public string Aesphone { get; set; }

    }

}
