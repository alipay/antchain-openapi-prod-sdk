// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTC.Models
{
    public class SendSmsMessageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 短信模版Id
        [NameInMap("template_id")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

        // 手机号
        [NameInMap("phone")]
        [Validation(Required=true)]
        public string Phone { get; set; }

        // 参数键值对
        [NameInMap("template_args")]
        [Validation(Required=true)]
        public string TemplateArgs { get; set; }

    }

}
