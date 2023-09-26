// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // MapEntry列表，对应一个Map
    public class MapEntryList : TeaModel {
        // MapEntry列表
        [NameInMap("element")]
        [Validation(Required=false)]
        public List<MapEntry> Element { get; set; }

    }

}
