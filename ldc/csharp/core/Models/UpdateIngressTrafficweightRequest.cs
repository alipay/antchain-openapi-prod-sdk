// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class UpdateIngressTrafficweightRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // service id
        [NameInMap("service_id")]
        [Validation(Required=true)]
        public string ServiceId { get; set; }

        // 流量权重列表
        [NameInMap("service_weights")]
        [Validation(Required=false)]
        public List<ServiceWeight> ServiceWeights { get; set; }

        // 流量权重列表蓝绿发布v2
        [NameInMap("cell_weights")]
        [Validation(Required=false)]
        public List<CellWeight> CellWeights { get; set; }

    }

}
