// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_630ce8157b69499bbf96c1910a852241.Models
{
    public class QueryBaasUnionChainRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 联盟id
        [NameInMap("consortium_id")]
        [Validation(Required=true)]
        public string ConsortiumId { get; set; }

        // 分页编号
        [NameInMap("page_number")]
        [Validation(Required=false)]
        public long? PageNumber { get; set; }

        // 分页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // region_id
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

    }

}
