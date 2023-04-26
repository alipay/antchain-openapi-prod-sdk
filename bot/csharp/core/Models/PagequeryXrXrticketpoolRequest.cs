// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class PagequeryXrXrticketpoolRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务类型
        [NameInMap("biz_scene")]
        [Validation(Required=true)]
        public string BizScene { get; set; }

        // 资源id
        [NameInMap("resource_id")]
        [Validation(Required=false)]
        public string ResourceId { get; set; }

        // 券池名称
        [NameInMap("xr_ticket_pool_name")]
        [Validation(Required=false)]
        public string XrTicketPoolName { get; set; }

        // 通行证状态，
        // EXPIRED：已过期
        // VALID：有效
        // SALED：已出售
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 当前页
        // 
        [NameInMap("current")]
        [Validation(Required=true)]
        public long? Current { get; set; }

        // 每页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
