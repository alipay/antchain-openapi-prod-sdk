// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 接入点信息
    public class EndpointDTO : TeaModel {
        // endpoint接口相关的文档
        [NameInMap("doc")]
        [Validation(Required=false)]
        public string Doc { get; set; }

        // https类型公网的endpoint接入点
        [NameInMap("https_internet")]
        [Validation(Required=false)]
        public string HttpsInternet { get; set; }

        // http类型内网的endpoint接口
        [NameInMap("http_internal")]
        [Validation(Required=false)]
        public string HttpInternal { get; set; }

        // http类型的公网接入点
        [NameInMap("http_internet")]
        [Validation(Required=false)]
        public string HttpInternet { get; set; }

        // tcp类型的endpoint接口
        [NameInMap("tcp")]
        [Validation(Required=false)]
        public string Tcp { get; set; }

    }

}
