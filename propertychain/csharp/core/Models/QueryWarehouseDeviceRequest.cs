// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    public class QueryWarehouseDeviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备状态[READY：未启用，STARTED：已启用，LOADING：信息待完善，DELETED：已注销，ALL：全部]
        [NameInMap("device_filter")]
        [Validation(Required=false)]
        public string DeviceFilter { get; set; }

        // 仓位id
        [NameInMap("storage_location_id")]
        [Validation(Required=false)]
        public string StorageLocationId { get; set; }

        // 仓库id
        [NameInMap("warehouse_id")]
        [Validation(Required=true)]
        public string WarehouseId { get; set; }

    }

}
