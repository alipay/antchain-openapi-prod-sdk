// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    public class QueryDatasearchSearchRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户唯一标识符（租户ID）
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 链唯一标识符
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 检索的metaId范围；私有化不支持，参数留空
        [NameInMap("meta_conditions")]
        [Validation(Required=false)]
        public List<string> MetaConditions { get; set; }

        // 检索请求
        [NameInMap("query")]
        [Validation(Required=true)]
        public DataSearchRequest Query { get; set; }

    }

}
