// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    public class GetWarehouseResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 地址
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 平面图
        [NameInMap("blueprint_url")]
        [Validation(Required=false)]
        public string BlueprintUrl { get; set; }

        // 所在国家
        [NameInMap("country")]
        [Validation(Required=false)]
        public string Country { get; set; }

        // 设备数量
        [NameInMap("device_num")]
        [Validation(Required=false)]
        public long? DeviceNum { get; set; }

        // 其他信息
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 纬度
        [NameInMap("latitude")]
        [Validation(Required=false)]
        public string Latitude { get; set; }

        // 经度
        [NameInMap("longitude")]
        [Validation(Required=false)]
        public string Longitude { get; set; }

        // 智能版本
        [NameInMap("smart_level")]
        [Validation(Required=false)]
        public string SmartLevel { get; set; }

        // 仓位数量
        [NameInMap("stock_position_num")]
        [Validation(Required=false)]
        public long? StockPositionNum { get; set; }

        // version
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

        // 仓库面积
        [NameInMap("warehouse_area")]
        [Validation(Required=false)]
        public string WarehouseArea { get; set; }

        // 仓库高度
        [NameInMap("warehouse_height")]
        [Validation(Required=false)]
        public string WarehouseHeight { get; set; }

        // 仓库id
        [NameInMap("warehouse_id")]
        [Validation(Required=false)]
        public string WarehouseId { get; set; }

        // 仓库名称
        [NameInMap("warehouse_name")]
        [Validation(Required=false)]
        public string WarehouseName { get; set; }

    }

}
