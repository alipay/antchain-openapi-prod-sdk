// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 计算资源与Cell的关系信息
    public class ComputerCell : TeaModel {
        // 部署单元唯一标识
        [NameInMap("cell_id")]
        [Validation(Required=false)]
        public string CellId { get; set; }

        // 计算资源唯一标识
        [NameInMap("computer_id")]
        [Validation(Required=false)]
        public string ComputerId { get; set; }

    }

}
