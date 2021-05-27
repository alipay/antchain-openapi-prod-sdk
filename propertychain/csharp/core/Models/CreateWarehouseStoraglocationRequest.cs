// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    public class CreateWarehouseStoraglocationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 是否禁用智能监管
        [NameInMap("disable_surv")]
        [Validation(Required=false)]
        public bool? DisableSurv { get; set; }

        // 其他信息
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 库位名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 货物类型【DANGER：危险品，NON_DANGER：非危险品，FOOD：食品】
        [NameInMap("product_type")]
        [Validation(Required=true)]
        public string ProductType { get; set; }

        // 状态【AVAILABLE：可用，IN_USE：使用中，IN_CONFIG：配置中，DELETED：已删除】
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 仓位面积
        [NameInMap("storage_location_area")]
        [Validation(Required=true)]
        public string StorageLocationArea { get; set; }

        // 仓位高度
        [NameInMap("storage_location_height")]
        [Validation(Required=true)]
        public string StorageLocationHeight { get; set; }

        // 库位类型【CHILL：冷藏，FREEZE：冷冻，PASSAGE：通道，FLAT：平面， STEREO：立体】
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 仓位虚拟id
        [NameInMap("virtual_storage_location_id")]
        [Validation(Required=true)]
        public string VirtualStorageLocationId { get; set; }

        // 仓库id
        [NameInMap("warehouse_id")]
        [Validation(Required=true)]
        public string WarehouseId { get; set; }

    }

}
