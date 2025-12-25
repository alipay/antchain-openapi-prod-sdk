// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
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

        // OK NO_DEMAND 无线索需求，需要重试 INVALID 无效，不要重试
        [NameInMap("push_result_code")]
        [Validation(Required=true)]
        public string PushResultCode { get; set; }

    }

}
