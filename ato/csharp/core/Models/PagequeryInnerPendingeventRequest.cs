// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class PagequeryInnerPendingeventRequest : TeaModel {
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

        // 待办状态
        [NameInMap("status_list")]
        [Validation(Required=false)]
        public List<string> StatusList { get; set; }

        // 事件类型
        // 通知:NOTIFICATION 
        // 确认函:CONFIRMATION
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 分页
        [NameInMap("page_info")]
        [Validation(Required=true)]
        public PageQuery PageInfo { get; set; }

    }

}
