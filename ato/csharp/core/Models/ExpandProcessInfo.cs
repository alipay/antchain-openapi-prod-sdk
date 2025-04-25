// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 进件流程信息
    public class ExpandProcessInfo : TeaModel {
        // TENANT_INDIRECT_MAINCLASS(间联类目)
        // TENANT_ENDPOINT（回调地址）
        // CUSTOM_SERVICE_INFO（客服信息）
        // AGENTCUSTOMERPESONINFO（间联客诉人员）
        // MERCHANT_EXPAND（商户进件）
        [NameInMap("process_node")]
        [Validation(Required=false)]
        public string ProcessNode { get; set; }

        // 是否已提交
        [NameInMap("is_submitted")]
        [Validation(Required=false)]
        public bool? IsSubmitted { get; set; }

        // 审核通过
        [NameInMap("audit_status")]
        [Validation(Required=false)]
        public string AuditStatus { get; set; }

    }

}
