// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    public class UpdateWarehouseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 地址（传原值，不可修改此项）
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

        // 平面图
        [NameInMap("blueprint_id")]
        [Validation(Required=false)]
        public string BlueprintId { get; set; }

        // 所在国家（传原值，不可修改此项）
        [NameInMap("country")]
        [Validation(Required=true)]
        public string Country { get; set; }

        // 其他信息
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 仓库面积
        [NameInMap("warehouse_area")]
        [Validation(Required=true)]
        public string WarehouseArea { get; set; }

        // 仓库id
        [NameInMap("warehouse_id")]
        [Validation(Required=true)]
        public string WarehouseId { get; set; }

        // 仓库名称（传原值，不可修改此项）
        [NameInMap("warehouse_name")]
        [Validation(Required=true)]
        public string WarehouseName { get; set; }

    }

}
