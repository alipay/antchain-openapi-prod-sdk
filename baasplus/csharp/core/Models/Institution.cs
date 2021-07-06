// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    // 机构（可以为银行或地区）
    public class Institution : TeaModel {
        // 人行联行号/行政地区编码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 银行全称/行政地区名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
