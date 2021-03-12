// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 更新did doc中的service信息
    public class UpdateDidService : TeaModel {
        // 待更新did之前的版本号
        [NameInMap("previous_version")]
        [Validation(Required=true)]
        public long? PreviousVersion { get; set; }

        // did doc中的service id
        [NameInMap("service_id")]
        [Validation(Required=true)]
        public string ServiceId { get; set; }

        // 服务信息
        [NameInMap("service_info")]
        [Validation(Required=true)]
        public DidServiceInfo ServiceInfo { get; set; }

        // 服务类型
        [NameInMap("service_type")]
        [Validation(Required=true)]
        public string ServiceType { get; set; }

    }

}
