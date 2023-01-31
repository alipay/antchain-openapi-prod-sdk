// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 授权信息
    public class AuthenticationInfoVO : TeaModel {
        // 授权记录编码
        [NameInMap("authentication_no")]
        [Validation(Required=true)]
        public string AuthenticationNo { get; set; }

        // 收取方did
        [NameInMap("authorizer_did")]
        [Validation(Required=true)]
        public string AuthorizerDid { get; set; }

        // 授权方名称
        [NameInMap("authorizer_name")]
        [Validation(Required=true)]
        public string AuthorizerName { get; set; }

        // 被授权方did
        [NameInMap("authorized_did")]
        [Validation(Required=true)]
        public string AuthorizedDid { get; set; }

        // 被授权方名称
        [NameInMap("authorized_name")]
        [Validation(Required=true)]
        public string AuthorizedName { get; set; }

        // 数据协作类型
        [NameInMap("data_transfer_type")]
        [Validation(Required=true)]
        public string DataTransferType { get; set; }

        // 授权详情
        [NameInMap("authentication_deetail")]
        [Validation(Required=true)]
        public string AuthenticationDeetail { get; set; }

        // 授权状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
