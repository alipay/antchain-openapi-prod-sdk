// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class SwitchSwitchFirmfinancialRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 企业id
        [NameInMap("firm_id")]
        [Validation(Required=true)]
        public long? FirmId { get; set; }

        // 租户类型
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 操作类型（新增：add，删除：delete)
        [NameInMap("operation_type")]
        [Validation(Required=true)]
        public string OperationType { get; set; }

        // 业务id
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 财报信息
        [NameInMap("file_info")]
        [Validation(Required=false)]
        public FileInfo FileInfo { get; set; }

    }

}
