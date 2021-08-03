// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    // 公积金中心编码名称
    public class TdmCpfEncodeNameVO : TeaModel {
        // 公积金中心编码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 公积金中心名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
