// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class AddPdcpAuthRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 授权记录的唯一标记
        [NameInMap("authentication_no")]
        [Validation(Required=true)]
        public string AuthenticationNo { get; set; }

        // 授权方did
        [NameInMap("authorizer_did")]
        [Validation(Required=true)]
        public string AuthorizerDid { get; set; }

        // 被授权方did
        [NameInMap("authorized_did")]
        [Validation(Required=true)]
        public string AuthorizedDid { get; set; }

        // 数据协作类型
        [NameInMap("data_transfer_type")]
        [Validation(Required=true)]
        public string DataTransferType { get; set; }

        // 授权详情
        [NameInMap("authentication_detail")]
        [Validation(Required=true)]
        public string AuthenticationDetail { get; set; }

        // 授权状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
