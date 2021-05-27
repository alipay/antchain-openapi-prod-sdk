// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 库位信息
    public class StorageLocation : TeaModel {
        // 仓位容量
        [NameInMap("capacity")]
        [Validation(Required=false)]
        public string Capacity { get; set; }

        // 设备id
        [NameInMap("device_id_list")]
        [Validation(Required=false)]
        public List<string> DeviceIdList { get; set; }

        // 其他信息
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 库位id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 监控等级【VIDEOREGULATORY：视频监控】
        [NameInMap("monitor_capacity")]
        [Validation(Required=false)]
        public string MonitorCapacity { get; set; }

        // 监控水平【STANDARD：标准版，UPGRADED：升级版】
        [NameInMap("monitor_level")]
        [Validation(Required=false)]
        public string MonitorLevel { get; set; }

        // 库位名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 货物类型【DANGER：危险品，NON_DANGER：非危险品，FOOD：食品】	
        // 
        [NameInMap("product_type")]
        [Validation(Required=false)]
        public string ProductType { get; set; }

        // 状态【AVAILABLE：可用，IN_USE：使用中，IN_CONFIG：配置中，DELETED：已删除】
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 仓位面积
        [NameInMap("storage_location_area")]
        [Validation(Required=false)]
        public string StorageLocationArea { get; set; }

        // 仓位高度
        [NameInMap("storage_location_height")]
        [Validation(Required=false)]
        public string StorageLocationHeight { get; set; }

        // 库位类型【CHILL：冷藏，FREEZE：冷冻，PASSAGE：通道，FLAT：平面， STEREO：立体】
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 已用容量
        [NameInMap("used_capacity")]
        [Validation(Required=false)]
        public string UsedCapacity { get; set; }

        // 库位虚拟id
        [NameInMap("virtual_id")]
        [Validation(Required=false)]
        public string VirtualId { get; set; }

        // 仓库Id
        [NameInMap("warehouse_id")]
        [Validation(Required=false)]
        public string WarehouseId { get; set; }

        // 关联仓单Id
        [NameInMap("warehouse_receipt_id")]
        [Validation(Required=false)]
        public string WarehouseReceiptId { get; set; }

    }

}
