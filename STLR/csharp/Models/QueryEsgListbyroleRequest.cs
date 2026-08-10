// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class QueryEsgListbyroleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 不能为空，且必须属于当前企业
        [NameInMap("role_no")]
        [Validation(Required=true)]
        public string RoleNo { get; set; }

        // 页码 默认1
        [NameInMap("current")]
        [Validation(Required=false)]
        public long? Current { get; set; }

        // 页数 默认20
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // verifyToken中的企业编码
        [NameInMap("enterprise_no")]
        [Validation(Required=true)]
        public string EnterpriseNo { get; set; }

    }

}
