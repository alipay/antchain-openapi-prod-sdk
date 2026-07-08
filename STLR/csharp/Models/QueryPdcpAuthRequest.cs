// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class QueryPdcpAuthRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 授权记录编码
        [NameInMap("authentication_no")]
        [Validation(Required=false)]
        public string AuthenticationNo { get; set; }

        // 授权方did
        [NameInMap("authorizer_did")]
        [Validation(Required=false)]
        public string AuthorizerDid { get; set; }

        // 模糊匹配
        [NameInMap("authorizer_name")]
        [Validation(Required=false)]
        public string AuthorizerName { get; set; }

        // 被授权方did
        [NameInMap("authorized_did")]
        [Validation(Required=false)]
        public string AuthorizedDid { get; set; }

        // 模糊匹配
        [NameInMap("authorized_name")]
        [Validation(Required=false)]
        public string AuthorizedName { get; set; }

        // 数据协作类型
        [NameInMap("data_transfer_type")]
        [Validation(Required=false)]
        public string DataTransferType { get; set; }

        // 授权状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 当前页面
        [NameInMap("page_number")]
        [Validation(Required=false)]
        public long? PageNumber { get; set; }

        // 页面大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

    }

}
