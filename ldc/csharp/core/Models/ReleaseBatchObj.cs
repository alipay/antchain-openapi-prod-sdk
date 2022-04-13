// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 发布批次对象
    public class ReleaseBatchObj : TeaModel {
        // 第一个批次
        [NameInMap("batch_num")]
        [Validation(Required=true)]
        public long? BatchNum { get; set; }

        // 单元内服务数组
        [NameInMap("cell_servers")]
        [Validation(Required=true)]
        public List<CellServer> CellServers { get; set; }

    }

}
