// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    public class QueryAuthOwnerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 	
        // 授权租户身份ID：
        // 身份证号/统一社会组织机构信用码
        [NameInMap("data_owner_identity")]
        [Validation(Required=true)]
        public string DataOwnerIdentity { get; set; }

        // 被授权租户身份ID：
        // 身份证号/统一社会组织机构信用码
        [NameInMap("authorized_identity")]
        [Validation(Required=false)]
        public string AuthorizedIdentity { get; set; }

        // 分配code
        // 
        // 
        [NameInMap("authorized_platform_identity")]
        [Validation(Required=true)]
        public string AuthorizedPlatformIdentity { get; set; }

        // 标的物
        // 
        // 
        [NameInMap("target_code")]
        [Validation(Required=false)]
        public string TargetCode { get; set; }

        // 扩展字段
        // 
        // 
        [NameInMap("extend_params")]
        [Validation(Required=false)]
        public string ExtendParams { get; set; }

        // "1", "授权激活状态"
        // "2", "授权取消"
        // "3", "授权过期"
        [NameInMap("auth_state")]
        [Validation(Required=true)]
        public string AuthState { get; set; }

    }

}
