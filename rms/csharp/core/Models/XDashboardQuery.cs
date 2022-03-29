// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // dashboard query
    public class XDashboardQuery : TeaModel {
        //  
        [NameInMap("uuid")]
        [Validation(Required=false)]
        public string Uuid { get; set; }

        //  
        [NameInMap("parent_uuid")]
        [Validation(Required=false)]
        public string ParentUuid { get; set; }

        //  
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

    }

}
