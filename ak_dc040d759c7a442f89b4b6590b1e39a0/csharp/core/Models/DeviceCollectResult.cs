// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_dc040d759c7a442f89b4b6590b1e39a0.Models
{
    // 数据上链成功结果数据
    public class DeviceCollectResult : TeaModel {
        // 上链数据采集ID
        [NameInMap("collect_id")]
        [Validation(Required=true)]
        public string CollectId { get; set; }

        // 上链id
        [NameInMap("antchain_id")]
        [Validation(Required=false)]
        public string AntchainId { get; set; }

    }

}
