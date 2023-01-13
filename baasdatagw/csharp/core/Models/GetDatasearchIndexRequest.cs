// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    public class GetDatasearchIndexRequest : TeaModel {
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

        // 合约ABI meta ID
        [NameInMap("meta_id")]
        [Validation(Required=true)]
        public string MetaId { get; set; }

        // 索引类型， interface 为合约方法及输入输出； event 为合约Logs; deposit 为原生存证
        [NameInMap("index_type")]
        [Validation(Required=true)]
        public string IndexType { get; set; }

    }

}
