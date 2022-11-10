// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 数据上链失败结果
    public class DeviceCollectFail : TeaModel {
        // 上链数据采集ID
        [NameInMap("collect_id")]
        [Validation(Required=true)]
        public string CollectId { get; set; }

        // 错误码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 错误信息
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

    }

}
