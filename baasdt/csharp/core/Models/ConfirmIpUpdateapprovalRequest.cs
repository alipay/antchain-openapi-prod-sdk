// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class ConfirmIpUpdateapprovalRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础字段
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // ip的id
        [NameInMap("ip_id")]
        [Validation(Required=true)]
        public string IpId { get; set; }

        // 是否审批通过
        [NameInMap("is_approval")]
        [Validation(Required=true)]
        public bool? IsApproval { get; set; }

        // 审批信息
        [NameInMap("approval_comments")]
        [Validation(Required=false)]
        public string ApprovalComments { get; set; }

    }

}
