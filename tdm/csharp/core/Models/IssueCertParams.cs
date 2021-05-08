// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    // 证明开具参数，填入证明开具接口的 extendParams 部分
    public class IssueCertParams : TeaModel {
        // 贷款合同编号
        [NameInMap("dkhtbh")]
        [Validation(Required=false)]
        public string Dkhtbh { get; set; }

    }

}
