// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    public class CreateWarehouseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 地址
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

        // 平面图
        [NameInMap("blueprint_id")]
        [Validation(Required=false)]
        public string BlueprintId { get; set; }

        // 所在国家
        [NameInMap("country")]
        [Validation(Required=true)]
        public string Country { get; set; }

        // 其他信息
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 纬度
        [NameInMap("latitude")]
        [Validation(Required=true)]
        public string Latitude { get; set; }

        // 经度
        [NameInMap("longitude")]
        [Validation(Required=true)]
        public string Longitude { get; set; }

        // 仓库面积
        [NameInMap("warehouse_area")]
        [Validation(Required=true)]
        public string WarehouseArea { get; set; }

        // 仓库高度
        [NameInMap("warehouse_height")]
        [Validation(Required=false)]
        public string WarehouseHeight { get; set; }

        // 仓库id
        [NameInMap("warehouse_id")]
        [Validation(Required=true, MaxLength=255)]
        public string WarehouseId { get; set; }

        // 仓库名称
        [NameInMap("warehouse_name")]
        [Validation(Required=true, MaxLength=255)]
        public string WarehouseName { get; set; }

    }

}
