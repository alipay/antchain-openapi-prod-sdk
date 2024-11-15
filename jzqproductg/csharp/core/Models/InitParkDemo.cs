// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.JZQPRODUCTG.Models
{
    // testDemo
    public class InitParkDemo : TeaModel {
        // 时间
        [NameInMap("time")]
        [Validation(Required=true)]
        public string Time { get; set; }

        // 请求人
        [NameInMap("operate")]
        [Validation(Required=true)]
        public string Operate { get; set; }

        // 请求编号
        [NameInMap("count")]
        [Validation(Required=true)]
        public long? Count { get; set; }

    }

}
