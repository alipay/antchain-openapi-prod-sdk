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
        public string RequestCpu { get; set; }

        // request_mem
        [NameInMap("request_mem")]
        [Validation(Required=true)]
        public string RequestMem { get; set; }

        // limit_cpu
        [NameInMap("limit_cpu")]
        [Validation(Required=true)]
        public string LimitCpu { get; set; }

        // limit_mem
        [NameInMap("limit_mem")]
        [Validation(Required=true)]
        public string LimitMem { get; set; }

        // average_cpu
        [NameInMap("average_cpu")]
        [Validation(Required=true)]
        public string AverageCpu { get; set; }

        // average_mem
        [NameInMap("average_mem")]
        [Validation(Required=true)]
        public string AverageMem { get; set; }

        // 建议1：xxxxx
        [NameInMap("tips")]
        [Validation(Required=true)]
        public string Tips { get; set; }

    }

}
