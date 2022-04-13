// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // cell weight info list.
    public class CellWeightInfoList : TeaModel {
        // weight info list.
        [NameInMap("data")]
        [Validation(Required=true)]
        public List<CellWeightInfo> Data { get; set; }

    }

}
