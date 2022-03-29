// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    // api后台参数
    public class ApiBackendInfo : TeaModel {
        //  调用方法
        [NameInMap("dispatch_type")]
        [Validation(Required=true)]
        public string DispatchType { get; set; }

        // TR转发的uniqueid
        [NameInMap("unique_id")]
        [Validation(Required=false)]
        public string UniqueId { get; set; }

        // TR转发的url
        [NameInMap("test_url")]
        [Validation(Required=false)]
        public string TestUrl { get; set; }

        // TR转发的路径
        [NameInMap("path")]
        [Validation(Required=false)]
        public string Path { get; set; }

        // 是否跳过鉴权
        [NameInMap("skip_auth")]
        [Validation(Required=false)]
        public bool? SkipAuth { get; set; }

        // 后端转发超时时间
        [NameInMap("timeout")]
        [Validation(Required=true)]
        public long? Timeout { get; set; }

        // 后端返回参数
        [NameInMap("response_params")]
        [Validation(Required=true)]
        public List<ApiParamInfo> ResponseParams { get; set; }

        // 返回结果码
        [NameInMap("result_codes")]
        [Validation(Required=true)]
        public List<ApiResultCodeInfo> ResultCodes { get; set; }

    }

}
