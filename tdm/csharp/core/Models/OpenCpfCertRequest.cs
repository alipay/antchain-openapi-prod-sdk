// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    public class OpenCpfCertRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 端ID
        [NameInMap("terminal_identity")]
        [Validation(Required=true)]
        public string TerminalIdentity { get; set; }

        // 证明类型
        [NameInMap("issue_cert_type")]
        [Validation(Required=true)]
        public string IssueCertType { get; set; }

        // 公积金中心ID
        [NameInMap("provider_id")]
        [Validation(Required=true)]
        public string ProviderId { get; set; }

        // 证件类型
        [NameInMap("data_owner_identity_type")]
        [Validation(Required=true)]
        public string DataOwnerIdentityType { get; set; }

        // 数据拥有者ID（身份证ID）
        [NameInMap("data_owner_identity")]
        [Validation(Required=true)]
        public string DataOwnerIdentity { get; set; }

        // 数据拥有者姓名（真实姓名）
        [NameInMap("data_owner_name")]
        [Validation(Required=true)]
        public string DataOwnerName { get; set; }

        // 请求结构体序列化
        [NameInMap("extend_params")]
        [Validation(Required=false)]
        public string ExtendParams { get; set; }

    }

}
