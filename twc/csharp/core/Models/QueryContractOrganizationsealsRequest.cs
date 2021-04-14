// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryContractOrganizationsealsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 机构id
        [NameInMap("org_id")]
        [Validation(Required=true)]
        public string OrgId { get; set; }

        // 分页起始位置
        [NameInMap("offset")]
        [Validation(Required=true)]
        public long? Offset { get; set; }

        // 单页数量
        [NameInMap("size")]
        [Validation(Required=true)]
        public long? Size { get; set; }

    }

}
