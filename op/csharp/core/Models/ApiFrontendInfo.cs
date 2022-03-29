// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    // api前端数据
    public class ApiFrontendInfo : TeaModel {
        // 是否有数据传输
        [NameInMap("file_transfer")]
        [Validation(Required=true)]
        public bool? FileTransfer { get; set; }

        // api参数
        [NameInMap("request_path_params")]
        [Validation(Required=true)]
        public List<string> RequestPathParams { get; set; }

        // Rest请求的URI，并带有路径参数
        [NameInMap("request_uri_with_path_params")]
        [Validation(Required=true)]
        public string RequestUriWithPathParams { get; set; }

        // api参数
        [NameInMap("request_params")]
        [Validation(Required=true)]
        public ApiParamInfo RequestParams { get; set; }

    }

}
