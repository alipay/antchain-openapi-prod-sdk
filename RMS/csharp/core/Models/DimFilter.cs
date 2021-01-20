// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // DimFilter
    public class DimFilter : TeaModel {
        // dim_index
        [NameInMap("dim_index")]
        [Validation(Required=false)]
        public long? DimIndex { get; set; }

        // dim_name
        [NameInMap("dim_name")]
        [Validation(Required=false)]
        public string DimName { get; set; }

        // white_names
        [NameInMap("white_names")]
        [Validation(Required=false)]
        public List<string> WhiteNames { get; set; }

        // black_names
        [NameInMap("black_names")]
        [Validation(Required=false)]
        public List<string> BlackNames { get; set; }

    }

}
