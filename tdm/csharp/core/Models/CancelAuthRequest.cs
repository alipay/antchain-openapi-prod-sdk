// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    public class CancelAuthRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 授权租户身份ID：
        // 身份证号/统一社会组织机构信用码
        [NameInMap("data_owner_identity")]
        [Validation(Required=true)]
        public string DataOwnerIdentity { get; set; }

        // 分配code
        [NameInMap("authorized_platform_identity")]
        [Validation(Required=true)]
        public string AuthorizedPlatformIdentity { get; set; }

        // 标的物，查询授权接口返回
        // 
        // 
        [NameInMap("auth_code")]
        [Validation(Required=true)]
        public string AuthCode { get; set; }

        // 核身信息
        // 
        [NameInMap("certification_info")]
        [Validation(Required=true)]
        public string CertificationInfo { get; set; }

        // 请求流水号
        // 
        // 幂等标示
        // 
        // 
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

    }

}
