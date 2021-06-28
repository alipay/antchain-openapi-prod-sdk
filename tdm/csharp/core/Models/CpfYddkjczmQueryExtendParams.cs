// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    // 异地贷款缴存证明查询接口参数(神玥)
    public class CpfYddkjczmQueryExtendParams : TeaModel {
        // 住建部中心编码
        [NameInMap("zjbzxbm")]
        [Validation(Required=true)]
        public string Zjbzxbm { get; set; }

        // 姓名
        [NameInMap("xingming")]
        [Validation(Required=true)]
        public string Xingming { get; set; }

        // 证件号码
        [NameInMap("zjhm")]
        [Validation(Required=true)]
        public string Zjhm { get; set; }

    }

}
