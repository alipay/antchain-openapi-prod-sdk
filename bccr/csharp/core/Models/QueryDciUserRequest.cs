// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class QueryDciUserRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 证件类型
        [NameInMap("certificate_type")]
        [Validation(Required=true)]
        public string CertificateType { get; set; }

        // 证件号
        [NameInMap("certificate_number")]
        [Validation(Required=true)]
        public string CertificateNumber { get; set; }

        // 手机号
        [NameInMap("phone")]
        [Validation(Required=true)]
        public string Phone { get; set; }

    }

}
