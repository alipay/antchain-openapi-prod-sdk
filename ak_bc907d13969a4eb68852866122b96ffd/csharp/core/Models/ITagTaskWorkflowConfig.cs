// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_bc907d13969a4eb68852866122b96ffd.Models
{
    // 标注工作流，私有化项目只用到 标注MARK、质检CHECK 这两个节点
    public class ITagTaskWorkflowConfig : TeaModel {
        // 标注阶段
        [NameInMap("nodename")]
        [Validation(Required=false)]
        public string Nodename { get; set; }

        // 标注人员列表
        [NameInMap("users")]
        [Validation(Required=false)]
        public List<User> Users { get; set; }

        // 分组
        [NameInMap("groups")]
        [Validation(Required=false)]
        public List<Groups> Groups { get; set; }

        // 扩展参数，例如质检抽样的比例，0~100 %
        [NameInMap("exif")]
        [Validation(Required=false)]
        public Exif Exif { get; set; }

    }

}
