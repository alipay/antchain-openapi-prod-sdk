// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SaveInnerAgentcustomerserviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 客诉问题
        [NameInMap("customer_complaint_issues")]
        [Validation(Required=true)]
        public string CustomerComplaintIssues { get; set; }

        // 客诉处理人员信息
        [NameInMap("customer_person_info_list")]
        [Validation(Required=true)]
        public List<CustomerPersonInfo> CustomerPersonInfoList { get; set; }

    }

}
