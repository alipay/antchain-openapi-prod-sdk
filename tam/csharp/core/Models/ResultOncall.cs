// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAM.Models
{
    // 返回结果
    public class ResultOncall : TeaModel {
        // 是否成功
        [NameInMap("success")]
        [Validation(Required=true)]
        public string Success { get; set; }

        // 提示信息
        [NameInMap("result_msg")]
        [Validation(Required=true)]
        public string ResultMsg { get; set; }

        // 保存的工单主键id（成功才有）
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

    }

}
