// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    public class UpdateWarehouseResponse : TeaModel {
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
        [NameInMap("blueprint_id")]
        [Validation(Required=false)]
        public string BlueprintId { get; set; }

        // 所在国家
        [NameInMap("country")]
        [Validation(Required=false)]
        public string Country { get; set; }

        // 其他信息
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 经纬度
        [NameInMap("location")]
        [Validation(Required=false)]
        public string Location { get; set; }

        // 仓库面积
        [NameInMap("warehouse_area")]
        [Validation(Required=false)]
        public string WarehouseArea { get; set; }

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
