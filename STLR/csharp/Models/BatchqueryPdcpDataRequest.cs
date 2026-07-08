// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class BatchqueryPdcpDataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务数据类型，查询该数据类型的授权数据
        [NameInMap("data_type")]
        [Validation(Required=true)]
        public string DataType { get; set; }

        // 授权方身份ID，若指定查询该用户授权的数据
        [NameInMap("authorizer_did")]
        [Validation(Required=false)]
        public string AuthorizerDid { get; set; }

        // 被授权方身份ID，若指定查询授权给该用户的数据
        [NameInMap("authorized_did")]
        [Validation(Required=false)]
        public string AuthorizedDid { get; set; }

        // 当前页面，默认1
        [NameInMap("page_number")]
        [Validation(Required=true)]
        public long? PageNumber { get; set; }

        // 分页大小，默认20
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

    }

}
