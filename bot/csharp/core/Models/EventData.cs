// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 事件数据
    public class EventData : TeaModel {
        // 数据内容
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 可信设备ID
        [NameInMap("trust_iot_device_id")]
        [Validation(Required=false)]
        public long? TrustIotDeviceId { get; set; }

        // 业务ID
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 设备数据签名
        [NameInMap("signature")]
        [Validation(Required=false)]
        public string Signature { get; set; }

        // 设备数据间接上报时，服务端补充数据
        [NameInMap("extra_data")]
        [Validation(Required=false)]
        public string ExtraData { get; set; }

    }

}
