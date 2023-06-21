// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class MatchIcmSimpleauthRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户号/子租户号，如果为租户号获取，则为租户号，如果为子租户号获取，则传输子租户号
        [NameInMap("inst_code")]
        [Validation(Required=true)]
        public string InstCode { get; set; }

        // 纳税人识别号
        [NameInMap("identity_id")]
        [Validation(Required=true)]
        public string IdentityId { get; set; }

        // 用于幂等控制
        [NameInMap("biz_request_id")]
        [Validation(Required=true)]
        public string BizRequestId { get; set; }

    }

}
