// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class UploadIpCodecirculationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础请求参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // 数字凭证的编码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 数字凭证流转信息，每次最多10条信息。
        [NameInMap("code_circulation_list")]
        [Validation(Required=true)]
        public List<CodeCirculation> CodeCirculationList { get; set; }

    }

}
