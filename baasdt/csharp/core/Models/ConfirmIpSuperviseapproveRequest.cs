// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class ConfirmIpSuperviseapproveRequest : TeaModel {
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

        // 监修报审关联的订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 当前期望的审批阶段（用于校验）
        [NameInMap("stage")]
        [Validation(Required=true)]
        public long? Stage { get; set; }

        // 是否审批通过
        [NameInMap("is_approval")]
        [Validation(Required=true)]
        public bool? IsApproval { get; set; }

        // 审批备注
        [NameInMap("approval_comments")]
        [Validation(Required=false)]
        public string ApprovalComments { get; set; }

        // 审批额外信息
        [NameInMap("approval_ext_info")]
        [Validation(Required=false)]
        public string ApprovalExtInfo { get; set; }

    }

}
