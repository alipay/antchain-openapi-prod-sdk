// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class PagequeryDataverifyFailureRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 页数，默认1
        [NameInMap("page_index")]
        [Validation(Required=true)]
        public long? PageIndex { get; set; }

        // 页码大小，默认10
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 场景码
        // 
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 起始查询时间
        [NameInMap("start_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartDate { get; set; }

        // 结束查询时间
        [NameInMap("end_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndDate { get; set; }

        // 设备ID（模糊查询）
        [NameInMap("device_id")]
        [Validation(Required=false)]
        public string DeviceId { get; set; }

        // 数据来源：0(普通数据上报)；1(MAAS数据上报)；2(设备业务数据上报);3(标签流转)
        [NameInMap("source")]
        [Validation(Required=false)]
        public long? Source { get; set; }

        // 类型：0:数据上报;1:数据完整性校验
        [NameInMap("type")]
        [Validation(Required=false)]
        public long? Type { get; set; }

    }

}
