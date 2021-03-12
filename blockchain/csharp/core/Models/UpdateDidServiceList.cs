// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 更新DID服务列表
    public class UpdateDidServiceList : TeaModel {
        // 待更新did之前的版本号
        [NameInMap("previous_version")]
        [Validation(Required=true)]
        public long? PreviousVersion { get; set; }

        // 服务信息列表
        [NameInMap("service_list")]
        [Validation(Required=true)]
        public List<DisServicesInfo> ServiceList { get; set; }

    }

}
