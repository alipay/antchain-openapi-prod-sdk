// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class EditInnerMermngcontractauditdetailRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // traceid
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

        // 商户租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 审核id
        [NameInMap("audit_id")]
        [Validation(Required=true)]
        public string AuditId { get; set; }

        // 审核详情id
        [NameInMap("audit_detail_id")]
        [Validation(Required=true)]
        public string AuditDetailId { get; set; }

        // ADOPT采纳    
        // CANCEL撤回   
        // EDIT编辑
        [NameInMap("operate_type")]
        [Validation(Required=true)]
        public string OperateType { get; set; }

        // REVISE 修订   
        // ANNOTATION 批注
        [NameInMap("content_type")]
        [Validation(Required=true)]
        public string ContentType { get; set; }

        // 编辑修订内容/采纳修订内容/采纳批注内容
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

    }

}
