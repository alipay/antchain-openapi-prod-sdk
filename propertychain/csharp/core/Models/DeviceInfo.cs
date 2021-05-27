// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 设备信息
    public class DeviceInfo : TeaModel {
        // 物模型Id
        [NameInMap("aliyun_model_id")]
        [Validation(Required=false)]
        public string AliyunModelId { get; set; }

        // 设备组
        [NameInMap("device_group_list")]
        [Validation(Required=false)]
        public List<DeviceGroup> DeviceGroupList { get; set; }

        // 三元组
        [NameInMap("device_meta")]
        [Validation(Required=false)]
        public string DeviceMeta { get; set; }

        // 设备拥有者Id
        [NameInMap("device_owner_id")]
        [Validation(Required=false)]
        public string DeviceOwnerId { get; set; }

        // 设备安装信息
        [NameInMap("device_setup_info")]
        [Validation(Required=false)]
        public string DeviceSetupInfo { get; set; }

        // 设备类型【ALIDEV：阿里云设备，CHAINMACDEV：链机设备，M2MDEV：M2M设备，OTHERDEV：其他设备】
        [NameInMap("device_type")]
        [Validation(Required=false)]
        public string DeviceType { get; set; }

        // 设备使用者Id
        [NameInMap("device_user_id_list")]
        [Validation(Required=false)]
        public List<string> DeviceUserIdList { get; set; }

        // 设备虚拟id
        [NameInMap("device_virtual_id")]
        [Validation(Required=false)]
        public string DeviceVirtualId { get; set; }

        // 智能版本
        [NameInMap("smart_version")]
        [Validation(Required=false)]
        public string SmartVersion { get; set; }

        // 设备状态
        //     【READY：未启用，STARTED：已启用，LOADING：信息待完善，DELETED：已注销， ALL：全部】
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 库位Id
        [NameInMap("stock_position_id_list")]
        [Validation(Required=false)]
        public List<string> StockPositionIdList { get; set; }

        // 库位名称
        [NameInMap("stock_position_name_list")]
        [Validation(Required=false)]
        public List<string> StockPositionNameList { get; set; }

        // thingsDid
        [NameInMap("things_did")]
        [Validation(Required=false)]
        public string ThingsDid { get; set; }

        // 设备名称
        [NameInMap("things_name")]
        [Validation(Required=false)]
        public string ThingsName { get; set; }

        // 视频流地址
        [NameInMap("video_url")]
        [Validation(Required=false)]
        public string VideoUrl { get; set; }

        // 仓库Id
        [NameInMap("warehouse_id")]
        [Validation(Required=false)]
        public string WarehouseId { get; set; }

        // 仓库名称
        [NameInMap("warehouse_name")]
        [Validation(Required=false)]
        public string WarehouseName { get; set; }

    }

}
