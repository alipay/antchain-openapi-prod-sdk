// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 解决方案拓展Linke配置
    public class UnireleaseSolutionExtInfoLinkeInfo : TeaModel {
        // linke发布窗口 
        [NameInMap("release_window")]
        [Validation(Required=true)]
        public string ReleaseWindow { get; set; }

        // ["EI61640467"]
        [NameInMap("iterations")]
        [Validation(Required=true)]
        public List<string> Iterations { get; set; }

        // 发布接口人列表,要求为域账号
        [NameInMap("publisher")]
        [Validation(Required=false)]
        public List<string> Publisher { get; set; }

        // inke发布Id
        [NameInMap("release_id")]
        [Validation(Required=false)]
        public string ReleaseId { get; set; }

    }

}
