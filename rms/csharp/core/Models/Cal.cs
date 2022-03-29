// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 统计方式
    public class Cal : TeaModel {
        // 统计功能
        [NameInMap("fun")]
        [Validation(Required=true)]
        public string Fun { get; set; }

        // 值对象
        [NameInMap("val")]
        [Validation(Required=false)]
        public UniqueDim Val { get; set; }

        // 值对象备份
        [NameInMap("val_bak")]
        [Validation(Required=false)]
        public UniqueDim ValBak { get; set; }

        // topn
        [NameInMap("topn")]
        [Validation(Required=false)]
        public long? Topn { get; set; }

        // 所包含的值
        [NameInMap("contain_vals")]
        [Validation(Required=false)]
        public ContainVals ContainVals { get; set; }

    }

}
