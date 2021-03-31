// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 历史数据
    public class UploadFinancingParam : TeaModel {
        // 订舱单量（票）
        [NameInMap("booking_count")]
        [Validation(Required=true)]
        public long? BookingCount { get; set; }

        // 唯一标识
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 结束日期
        [NameInMap("end_date")]
        [Validation(Required=true)]
        public string EndDate { get; set; }

        // 货代did
        [NameInMap("forwarder_did")]
        [Validation(Required=true)]
        public string ForwarderDid { get; set; }

        // 开始日期
        [NameInMap("start_date")]
        [Validation(Required=true)]
        public string StartDate { get; set; }

        // 箱量【数量，不区分箱型，20GP是1TEU，40GP是2TEU】
        [NameInMap("teu")]
        [Validation(Required=true)]
        public long? Teu { get; set; }

        // 运输总额
        [NameInMap("amounts")]
        [Validation(Required=true)]
        public string Amounts { get; set; }

    }

}
