// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class StartProductAuthRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 空间id
        [NameInMap("source_space_id")]
        [Validation(Required=true)]
        public string SourceSpaceId { get; set; }

        // 企业代码
        [NameInMap("enterprise_code")]
        [Validation(Required=true)]
        public string EnterpriseCode { get; set; }

        // 国标产品标识码
        [NameInMap("product_identity_id")]
        [Validation(Required=true)]
        public string ProductIdentityId { get; set; }

    }

}
