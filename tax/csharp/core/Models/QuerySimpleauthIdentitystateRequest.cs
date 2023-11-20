// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class QuerySimpleauthIdentitystateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 纳税人识别号
        [NameInMap("identity")]
        [Validation(Required=true)]
        public string Identity { get; set; }

        // 租户号
        [NameInMap("inst_code")]
        [Validation(Required=true)]
        public string InstCode { get; set; }

        // 请求id
        [NameInMap("biz_unique_id")]
        [Validation(Required=true)]
        public string BizUniqueId { get; set; }

        // 产品类型
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public string AuthType { get; set; }

        // 授权编码
        [NameInMap("auth_code")]
        [Validation(Required=true)]
        public string AuthCode { get; set; }

        // 纳税人名称
        [NameInMap("nsrmc")]
        [Validation(Required=true)]
        public string Nsrmc { get; set; }

    }

}
