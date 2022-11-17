// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 物流信息
    public class ExpressInfo : TeaModel {
        // 材料类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 收件人姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 收件人电话号码
        [NameInMap("phone")]
        [Validation(Required=true)]
        public string Phone { get; set; }

        // 邮箱地址
        [NameInMap("email")]
        [Validation(Required=true)]
        public string Email { get; set; }

        // 快递名称
        [NameInMap("express_name")]
        [Validation(Required=true)]
        public string ExpressName { get; set; }

        // 快递单号
        [NameInMap("tracking_number")]
        [Validation(Required=true)]
        public string TrackingNumber { get; set; }

        // 材料发出时间戳
        [NameInMap("send_time")]
        [Validation(Required=true)]
        public long? SendTime { get; set; }

    }

}
