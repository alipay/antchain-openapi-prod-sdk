// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MEDIA_SMS.Models
{
    // 解析结果数据
    public class ParseResultData : TeaModel {
        // 手机号
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 是否有解析能力
        // 0:否
        // 1: 是
        [NameInMap("receive_state")]
        [Validation(Required=true)]
        public long? ReceiveState { get; set; }

    }

}
