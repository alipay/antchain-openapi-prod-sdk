// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 一个运维应用操作链。一个操作链中包含一个顺序的运维应用组列表，这些运维应用组将依次串行的执行运维操作。不同的操作链将并行执行。
    public class OpsApplicationChain : TeaModel {
        // 此运维应用链中包含的应用组列表
        [NameInMap("groups")]
        [Validation(Required=false)]
        public List<OpsApplicationGroup> Groups { get; set; }

    }

}
