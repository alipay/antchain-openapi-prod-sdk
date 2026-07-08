// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class QueryPdcpDataassetRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 当前页码，默认1
        [NameInMap("page_number")]
        [Validation(Required=false)]
        public long? PageNumber { get; set; }

        // 页面大小，默认20
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 数据类型
        [NameInMap("data_type_no")]
        [Validation(Required=false)]
        public string DataTypeNo { get; set; }

        // 数据资产所有者
        [NameInMap("user_did")]
        [Validation(Required=false)]
        public string UserDid { get; set; }

    }

}
