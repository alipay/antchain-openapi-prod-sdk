// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    public class ImportApiserviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // api基本信息
        [NameInMap("api_meta_request")]
        [Validation(Required=true)]
        public ApiMetaRequest ApiMetaRequest { get; set; }

        // api版本
        [NameInMap("api_version_request")]
        [Validation(Required=true)]
        public ApiVersionRequest ApiVersionRequest { get; set; }

        // api请求参数
        [NameInMap("import_api_params_request")]
        [Validation(Required=false)]
        public ImportApiParamsRequest ImportApiParamsRequest { get; set; }

    }

}
