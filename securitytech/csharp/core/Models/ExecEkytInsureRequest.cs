// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class ExecEkytInsureRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 保险信息，包含保单的所有信息
        [NameInMap("insure_info")]
        [Validation(Required=true)]
        public string InsureInfo { get; set; }

        // 投保人信息
        [NameInMap("applicant_info")]
        [Validation(Required=true)]
        public string ApplicantInfo { get; set; }

        // 被保人信息
        [NameInMap("assured_info")]
        [Validation(Required=true)]
        public string AssuredInfo { get; set; }

        // 数据签名
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

    }

}
