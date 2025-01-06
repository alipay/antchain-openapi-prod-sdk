// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOTHK.Models
{
    // 收集数据返回的上链结果
    public class SendCollectorResult : TeaModel {
        // 原入参的数组索引
        // 
        [NameInMap("original_index")]
        [Validation(Required=true)]
        public long? OriginalIndex { get; set; }

        // 失败数据对应的异常码，成功时该字段为空
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // 异常信息
        [NameInMap("error_msg")]
        [Validation(Required=false)]
        public string ErrorMsg { get; set; }

        // 返回的扩展信息
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

    }

}
