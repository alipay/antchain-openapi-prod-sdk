// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 应用发布单个cell发布进度详情
    public class AppDeployCell : TeaModel {
        // 单元名字
        [NameInMap("cell_name")]
        [Validation(Required=true)]
        public string CellName { get; set; }

        // 执行到当前cell的pod总数
        [NameInMap("partition")]
        [Validation(Required=true)]
        public long? Partition { get; set; }

        // 当前分组发布的pod数
        [NameInMap("release_count")]
        [Validation(Required=true)]
        public long? ReleaseCount { get; set; }

        // 当前cell发布的pod列表
        [NameInMap("pod_list")]
        [Validation(Required=true)]
        public List<PodDetailInfo> PodList { get; set; }

    }

}
