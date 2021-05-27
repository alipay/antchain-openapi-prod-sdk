// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 仓库信息
    public class WarehouseInfo : TeaModel {
        // 地址
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

        // 平面图
        [NameInMap("blueprint_url")]
        [Validation(Required=true)]
        public string BlueprintUrl { get; set; }

        // 所在国家
        [NameInMap("country")]
        [Validation(Required=true)]
        public string Country { get; set; }

        // 设备数量
        [NameInMap("device_num")]
        [Validation(Required=true)]
        public long? DeviceNum { get; set; }

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

        // 智能版本
        [NameInMap("smart_level")]
        [Validation(Required=true)]
        public string SmartLevel { get; set; }

        // 仓库状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 仓位数量
        [NameInMap("stock_position_num")]
        [Validation(Required=true)]
        public long? StockPositionNum { get; set; }

        // 版本信息
        [NameInMap("version")]
        [Validation(Required=true)]
        public string Version { get; set; }

        // 仓库面积
        [NameInMap("warehouse_area")]
        [Validation(Required=true)]
        public string WarehouseArea { get; set; }

        // 仓库高度
        [NameInMap("warehouse_height")]
        [Validation(Required=true)]
        public string WarehouseHeight { get; set; }

        // 仓库Id
        [NameInMap("warehouse_id")]
        [Validation(Required=true)]
        public string WarehouseId { get; set; }

        // 仓库名称
        [NameInMap("warehouse_name")]
        [Validation(Required=true)]
        public string WarehouseName { get; set; }

    }

}
