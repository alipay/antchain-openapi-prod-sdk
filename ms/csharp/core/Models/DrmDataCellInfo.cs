// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // Drm数据单元信息
    public class DrmDataCellInfo : TeaModel {
        // 单元信息列表
        [NameInMap("cell_infos")]
        [Validation(Required=false)]
        public List<CellInfo> CellInfos { get; set; }

        // 所有单元中是否存在有特殊推送过值的单元
        [NameInMap("has_special_cell")]
        [Validation(Required=false)]
        public bool? HasSpecialCell { get; set; }

    }

}
