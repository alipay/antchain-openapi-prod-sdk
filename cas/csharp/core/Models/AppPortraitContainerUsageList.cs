// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 应用画像容器利用率列表结构体
    public class AppPortraitContainerUsageList : TeaModel {
        // namespace
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // request_cpu
        [NameInMap("request_cpu")]
        [Validation(Required=true)]
        public long? RequestCpu { get; set; }

        // request_mem
        [NameInMap("request_mem")]
        [Validation(Required=true)]
        public long? RequestMem { get; set; }

        // limit_cpu
        [NameInMap("limit_cpu")]
        [Validation(Required=true)]
        public long? LimitCpu { get; set; }

        // limit_mem
        [NameInMap("limit_mem")]
        [Validation(Required=true)]
        public long? LimitMem { get; set; }

        // average_cpu
        [NameInMap("average_cpu")]
        [Validation(Required=true)]
        public long? AverageCpu { get; set; }

        // average_mem
        [NameInMap("average_mem")]
        [Validation(Required=true)]
        public long? AverageMem { get; set; }

    }

}
