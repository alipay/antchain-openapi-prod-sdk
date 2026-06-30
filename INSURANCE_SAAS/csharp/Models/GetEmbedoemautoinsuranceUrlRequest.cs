// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class GetEmbedoemautoinsuranceUrlRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 调用方生成的唯一编码，参考格式： yyyyMMdd_xxxxx，已接口请求的当前日期开头；
        [NameInMap("request_no")]
        [Validation(Required=true, MaxLength=128)]
        public string RequestNo { get; set; }

        // 产品编码
        [NameInMap("product_code")]
        [Validation(Required=true, MaxLength=64)]
        public string ProductCode { get; set; }

        // 业务参数，json格式
        [NameInMap("biz_info")]
        [Validation(Required=true, MaxLength=1000)]
        public string BizInfo { get; set; }

    }

}
