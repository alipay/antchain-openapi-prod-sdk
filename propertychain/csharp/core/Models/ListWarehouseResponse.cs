// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    public class ListWarehouseResponse : TeaModel {
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

        // 仓位总数
        [NameInMap("location_total")]
        [Validation(Required=false)]
        public long? LocationTotal { get; set; }

        // 总条目
        [NameInMap("total_count")]
        [Validation(Required=false)]
        public long? TotalCount { get; set; }

        // 总页数
        [NameInMap("total_page")]
        [Validation(Required=false)]
        public long? TotalPage { get; set; }

        // 仓库信息
        [NameInMap("warehouse_list")]
        [Validation(Required=false)]
        public List<WarehouseInfo> WarehouseList { get; set; }

        // 设备总数
        [NameInMap("device_total")]
        [Validation(Required=false)]
        public long? DeviceTotal { get; set; }

    }

}
