// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class NotifyRpgwUserSignresultRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 调用方平台用户id
        [NameInMap("platform_user_identification")]
        [Validation(Required=true)]
        public string PlatformUserIdentification { get; set; }

        // 用户手机号
        [NameInMap("user_code")]
        [Validation(Required=true)]
        public string UserCode { get; set; }

        // 签约结果，1成功，0失败
        [NameInMap("sign_result")]
        [Validation(Required=true)]
        public string SignResult { get; set; }

        // 失败原因描述
        [NameInMap("result_desc")]
        [Validation(Required=false)]
        public string ResultDesc { get; set; }

    }

}
