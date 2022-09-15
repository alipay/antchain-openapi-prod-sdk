// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class CreateAiidentificationQrcodeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户身份标识
        [NameInMap("app_key")]
        [Validation(Required=true)]
        public string AppKey { get; set; }

        // 二维码生成请求的请求数据
        [NameInMap("data")]
        [Validation(Required=true)]
        public BaiQrcodeGenerateReqData Data { get; set; }

    }

}
