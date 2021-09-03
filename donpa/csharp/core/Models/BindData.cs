// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DONPA.Models
{
    // 绑定接口返回的绑定信息
    public class BindData : TeaModel {
        // 虚拟小号（实际拨打以返回的 telX 为主）
        [NameInMap("tel_x")]
        [Validation(Required=true)]
        public string TelX { get; set; }

        // 该次绑定唯一 id
        [NameInMap("bind_id")]
        [Validation(Required=true)]
        public string BindId { get; set; }

    }

}
