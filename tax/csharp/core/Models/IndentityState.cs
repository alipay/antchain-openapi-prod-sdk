// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    // 纳税人状态
    public class IndentityState : TeaModel {
        // 纳税人识别号
        [NameInMap("nsrshb")]
        [Validation(Required=true)]
        public string Nsrshb { get; set; }

        // 纳税人名称
        [NameInMap("nsrmc")]
        [Validation(Required=true)]
        public string Nsrmc { get; set; }

        // 税务机构名称
        [NameInMap("swjgmc")]
        [Validation(Required=true)]
        public string Swjgmc { get; set; }

        // 纳税人识别号状态
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // 查询时间
        [NameInMap("time")]
        [Validation(Required=true)]
        public string Time { get; set; }

    }

}
