// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_6efc6591476e4813ac8f7c9b6359c0b7.Models
{
    // 大安全接口入参
    public class RdsAnalyzeRequest : TeaModel {
        // 123
        [NameInMap("appid")]
        [Validation(Required=true)]
        public string Appid { get; set; }

        // 123
        [NameInMap("biz_no")]
        [Validation(Required=false)]
        public string BizNo { get; set; }

        // 213
        [NameInMap("scene")]
        [Validation(Required=false)]
        public string Scene { get; set; }

        // 123
        [NameInMap("token")]
        [Validation(Required=false)]
        public string Token { get; set; }

        // 123
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

        // 123
        [NameInMap("extra")]
        [Validation(Required=true)]
        public string Extra { get; set; }

    }

}
