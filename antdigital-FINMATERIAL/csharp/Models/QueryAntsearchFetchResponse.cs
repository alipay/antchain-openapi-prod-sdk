// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FINMATERIAL.Models
{
    public class QueryAntsearchFetchResponse : TeaModel {
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

        // 网页读取和正文解析是否成功
        [NameInMap("is_success")]
        [Validation(Required=false)]
        public bool? IsSuccess { get; set; }

        // 失败原因标识，仅失败时返回
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // 可读的失败原因，仅失败时返回
        [NameInMap("error_message")]
        [Validation(Required=false)]
        public string ErrorMessage { get; set; }

        // 请求元信息
        [NameInMap("response_metadata")]
        [Validation(Required=false)]
        public ResponseMetadata ResponseMetadata { get; set; }

        // 网页读取与正文解析成功时返回
        [NameInMap("result")]
        [Validation(Required=false)]
        public FetchResult Result { get; set; }

    }

}
