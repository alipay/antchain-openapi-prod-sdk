// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class BatchcreateIotbasicDeviceorderbatchRequest : TeaModel {
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

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 订单同步批量请求体
        [NameInMap("order_batch_sync_req")]
        [Validation(Required=true)]
        public List<DeviceorderRequest> OrderBatchSyncReq { get; set; }

    }

}
