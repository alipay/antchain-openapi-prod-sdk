// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 透明劫持应用治理Vo
    public class TransparentProxyOperatorLogVo : TeaModel {
        // 日志 ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 修改内容
        [NameInMap("modify_content")]
        [Validation(Required=true)]
        public string ModifyContent { get; set; }

        // 操作人
        [NameInMap("modify_name")]
        [Validation(Required=true)]
        public string ModifyName { get; set; }

        // 操作时间
        [NameInMap("modify_time")]
        [Validation(Required=true)]
        public string ModifyTime { get; set; }

        // 端口
        [NameInMap("port")]
        [Validation(Required=true)]
        public long? Port { get; set; }

    }

}
