// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 品牌列表
    public class Brandlist : TeaModel {
        // 首字母
        [NameInMap("letter")]
        [Validation(Required=true)]
        public string Letter { get; set; }

        // 品牌信息列表
        [NameInMap("list")]
        [Validation(Required=true)]
        public List<LetterInfo> List { get; set; }

    }

}
