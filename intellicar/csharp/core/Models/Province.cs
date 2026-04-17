// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 省份集合
    public class Province : TeaModel {
        // 省份id
        [NameInMap("pid")]
        [Validation(Required=true)]
        public string Pid { get; set; }

        // 省份名
        [NameInMap("pname")]
        [Validation(Required=true)]
        public string Pname { get; set; }

    }

}
