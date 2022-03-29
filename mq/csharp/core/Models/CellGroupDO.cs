// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // cell by type
    public class CellGroupDO : TeaModel {
        // cell_type
        [NameInMap("cell_type")]
        [Validation(Required=true)]
        public string CellType { get; set; }

        // cells
        [NameInMap("data")]
        [Validation(Required=true)]
        public List<string> Data { get; set; }

    }

}
