// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    // 引入参数
    public class ImportApiParamsRequest : TeaModel {
        // 请求参数
        [NameInMap("request_params")]
        [Validation(Required=false)]
        public List<ApiParamRequest> RequestParams { get; set; }

        // 响应参数
        [NameInMap("response_params")]
        [Validation(Required=false)]
        public List<ApiParamRequest> ResponseParams { get; set; }

        // 返回结果码
        [NameInMap("result_codes")]
        [Validation(Required=false)]
        public List<ResultCodeRequest> ResultCodes { get; set; }

        // api名称
        [NameInMap("api_name")]
        [Validation(Required=true)]
        public string ApiName { get; set; }

        // api版本
        [NameInMap("api_version")]
        [Validation(Required=true)]
        public string ApiVersion { get; set; }

    }

}
