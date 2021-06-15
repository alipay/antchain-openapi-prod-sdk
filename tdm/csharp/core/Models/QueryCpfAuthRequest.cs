// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    public class QueryCpfAuthRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 身份证ID
        [NameInMap("data_owner_identity")]
        [Validation(Required=true)]
        public string DataOwnerIdentity { get; set; }

        // 被授权机构ID
        [NameInMap("authorized_identity")]
        [Validation(Required=false)]
        public string AuthorizedIdentity { get; set; }

        // 端ID
        [NameInMap("authorized_platform_identity")]
        [Validation(Required=true)]
        public string AuthorizedPlatformIdentity { get; set; }

        // 标的产品码
        [NameInMap("target_code")]
        [Validation(Required=false)]
        public string TargetCode { get; set; }

        // 扩展字段
        [NameInMap("extend_params")]
        [Validation(Required=false)]
        public string ExtendParams { get; set; }

        // 授权状态
        [NameInMap("auth_state")]
        [Validation(Required=true)]
        public string AuthState { get; set; }

    }

}
