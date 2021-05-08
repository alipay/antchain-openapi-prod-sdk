// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    public class QueryAuthRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 被授权租户身份ID：
        // 身份证号/统一社会组织机构信用码
        [NameInMap("authorized_identity")]
        [Validation(Required=true)]
        public string AuthorizedIdentity { get; set; }

        // 分配code
        // 
        // 
        [NameInMap("authorized_platform_identity")]
        [Validation(Required=true)]
        public string AuthorizedPlatformIdentity { get; set; }

        // 授权租户身份ID：
        // 身份证号/统一社会组织机构信用码
        [NameInMap("data_owner_identity")]
        [Validation(Required=true)]
        public string DataOwnerIdentity { get; set; }

        // 扩展信息
        [NameInMap("extend_params")]
        [Validation(Required=true)]
        public string ExtendParams { get; set; }

        // 标的物
        // 
        // 
        [NameInMap("target_code")]
        [Validation(Required=true)]
        public string TargetCode { get; set; }

        // 请求流水号幂等标示
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

    }

}
