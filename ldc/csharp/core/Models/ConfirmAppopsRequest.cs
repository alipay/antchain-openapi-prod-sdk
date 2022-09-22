// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class ConfirmAppopsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 运维单timeSeriesId
        [NameInMap("operation_id")]
        [Validation(Required=true)]
        public string OperationId { get; set; }

        // 操作人账号
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 租户编码
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

        // 服务分组id
        [NameInMap("service_group_id")]
        [Validation(Required=false)]
        public string ServiceGroupId { get; set; }

    }

}
