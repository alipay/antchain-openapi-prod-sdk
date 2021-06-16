// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 标签流转历史
    public class LabelTrace : TeaModel {
        // 操作内容
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 链上哈希
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 上链时间
        [NameInMap("tx_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string TxTime { get; set; }

        // 上链失败的错误码
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // 上链失败的错误信息
        [NameInMap("error_msg")]
        [Validation(Required=false)]
        public string ErrorMsg { get; set; }

        // 是否上链成功
        [NameInMap("is_success")]
        [Validation(Required=false)]
        public bool? IsSuccess { get; set; }

    }

}
