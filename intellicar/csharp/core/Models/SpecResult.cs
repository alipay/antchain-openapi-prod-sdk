// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 1
    public class SpecResult : TeaModel {
        // 下一页数据拉取传递的值
        [NameInMap("after_spec_id")]
        [Validation(Required=true)]
        public string AfterSpecId { get; set; }

        // 车型Id列表
        [NameInMap("spec_list")]
        [Validation(Required=true)]
        public List<SpecList> SpecList { get; set; }

    }

}
