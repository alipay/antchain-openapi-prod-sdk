// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 批量提交结果
    public class BatchSubmitCarResult : TeaModel {
        // 提交线索唯一请求id
        [NameInMap("submit_id")]
        [Validation(Required=true)]
        public string SubmitId { get; set; }

        // 是否成功
        [NameInMap("is_success")]
        [Validation(Required=true)]
        public bool? IsSuccess { get; set; }

    }

}
