// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    public class QueryApiserviceResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 套件信息
        [NameInMap("api_suite")]
        [Validation(Required=false)]
        public ApiSuite ApiSuite { get; set; }

        // api基本信息
        [NameInMap("api_meta")]
        [Validation(Required=false)]
        public ApiMeta ApiMeta { get; set; }

        // api版本数据
        [NameInMap("api_version")]
        [Validation(Required=false)]
        public ApiVersion ApiVersion { get; set; }

        // api分组信息
        [NameInMap("api_group")]
        [Validation(Required=false)]
        public ApiGroup ApiGroup { get; set; }

        // api请求参数
        [NameInMap("request_params")]
        [Validation(Required=false)]
        public List<ParamModal> RequestParams { get; set; }

        // api返回参数
        [NameInMap("response_params")]
        [Validation(Required=false)]
        public List<ParamModal> ResponseParams { get; set; }

        // 结果码
        [NameInMap("result_codes")]
        [Validation(Required=false)]
        public List<ResultCode> ResultCodes { get; set; }

    }

}
