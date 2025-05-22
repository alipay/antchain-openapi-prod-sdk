// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMOSDK.Models
{
    // 结构体返回结构
    public class ResultListDemo : TeaModel {
        // 返回结果码
        [NameInMap("code")]
        [Validation(Required=true)]
        public AbcDemoStruct Code { get; set; }

        // 返回结果
        [NameInMap("data")]
        [Validation(Required=true)]
        public AbcDemoStruct Data { get; set; }

        // 返回信息
        [NameInMap("message")]
        [Validation(Required=true)]
        public AbcDemoStruct Message { get; set; }

    }

}
