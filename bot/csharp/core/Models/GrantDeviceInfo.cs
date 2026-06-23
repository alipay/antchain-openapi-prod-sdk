// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 授权返回实体
    public class GrantDeviceInfo : TeaModel {
        // 授权ID
        [NameInMap("device_id")]
        [Validation(Required=true)]
        public string DeviceId { get; set; }

        // 授权ID
        [NameInMap("auth_record_id")]
        [Validation(Required=true)]
        public string AuthRecordId { get; set; }

    }

}
