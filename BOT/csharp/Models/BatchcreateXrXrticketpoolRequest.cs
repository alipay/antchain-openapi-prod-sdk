// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class BatchcreateXrXrticketpoolRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // xr通行证批量创建请求列表
        [NameInMap("xr_ticket_pool_reqs")]
        [Validation(Required=true)]
        public List<XrTicketPoolBatchReq> XrTicketPoolReqs { get; set; }

        // 业务类型
        [NameInMap("biz_scene")]
        [Validation(Required=true)]
        public string BizScene { get; set; }

    }

}
