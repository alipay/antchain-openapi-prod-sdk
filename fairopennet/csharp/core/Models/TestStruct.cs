// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FAIROPENNET.Models
{
    // 测试结构体
    public class TestStruct : TeaModel {
        // 测试名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 消息体
        [NameInMap("msg")]
        [Validation(Required=true)]
        public string Msg { get; set; }

    }

}
