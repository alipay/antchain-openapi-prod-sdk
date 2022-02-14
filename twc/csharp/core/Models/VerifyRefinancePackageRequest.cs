// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class VerifyRefinancePackageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资产包id
        [NameInMap("package_id")]
        [Validation(Required=true)]
        public string PackageId { get; set; }

        // AUDIT_SUCCESS(审核通过), AUDIT_REFUSE（审核驳回）
        [NameInMap("audit_status")]
        [Validation(Required=true)]
        public string AuditStatus { get; set; }

        // 放款金额，单位毫厘
        [NameInMap("recredit_limit")]
        [Validation(Required=false)]
        public long? RecreditLimit { get; set; }

        // 再融资放款流水号
        [NameInMap("recredit_serial_number")]
        [Validation(Required=false)]
        public string RecreditSerialNumber { get; set; }

        // 额外审核信息说明
        [NameInMap("audit_message")]
        [Validation(Required=false)]
        public string AuditMessage { get; set; }

    }

}
