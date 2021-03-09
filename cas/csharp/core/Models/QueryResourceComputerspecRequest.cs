// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryResourceComputerspecRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 机器规格族
        [NameInMap("instance_type_groups")]
        [Validation(Required=false)]
        public string InstanceTypeGroups { get; set; }

        // CPU最大值
        [NameInMap("max_cpu")]
        [Validation(Required=false)]
        public long? MaxCpu { get; set; }

        // 最大内存
        [NameInMap("max_mem")]
        [Validation(Required=false)]
        public long? MaxMem { get; set; }

        // CPU最小值
        [NameInMap("min_cpu")]
        [Validation(Required=false)]
        public long? MinCpu { get; set; }

        // 最小内存
        [NameInMap("min_mem")]
        [Validation(Required=false)]
        public long? MinMem { get; set; }

    }

}
