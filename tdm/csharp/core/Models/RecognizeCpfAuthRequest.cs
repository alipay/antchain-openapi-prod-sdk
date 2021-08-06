// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    public class RecognizeCpfAuthRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务流水
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 用户身份证ID
        [NameInMap("data_owner_identity")]
        [Validation(Required=true)]
        public string DataOwnerIdentity { get; set; }

        // 用户姓名
        [NameInMap("data_owner_name")]
        [Validation(Required=false)]
        public string DataOwnerName { get; set; }

        // 被授权机构ID
        [NameInMap("authorized_identity")]
        [Validation(Required=true)]
        public string AuthorizedIdentity { get; set; }

        // 被授权机构名称
        [NameInMap("authorized_name")]
        [Validation(Required=false)]
        public string AuthorizedName { get; set; }

        // 被授权标
        [NameInMap("target_code")]
        [Validation(Required=true)]
        public string TargetCode { get; set; }

        // 授权协议
        [NameInMap("auth_agreement")]
        [Validation(Required=true)]
        public AuthAgreement AuthAgreement { get; set; }

        // 核身信息
        [NameInMap("certification_info")]
        [Validation(Required=true)]
        public CertificationInfo CertificationInfo { get; set; }

        // 扩展字段
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

    }

}
