// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 集装箱信息
    public class ContainerInfo : TeaModel {
        // 订舱单唯一标识
        [NameInMap("booking_no")]
        [Validation(Required=false)]
        public string BookingNo { get; set; }

        // 集装箱唯一标识
        [NameInMap("container_id")]
        [Validation(Required=false)]
        public string ContainerId { get; set; }

        // 箱号
        [NameInMap("container_no")]
        [Validation(Required=false)]
        public string ContainerNo { get; set; }

        // 箱型
        [NameInMap("container_type")]
        [Validation(Required=false)]
        public string ContainerType { get; set; }

    }

}
