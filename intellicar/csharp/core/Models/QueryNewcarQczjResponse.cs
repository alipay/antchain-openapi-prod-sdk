// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    public class QueryNewcarQczjResponse : TeaModel {
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

        // 0代表成功，其余代表失败
        [NameInMap("returncode")]
        [Validation(Required=false)]
        public string Returncode { get; set; }

        // 失败时错误消息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 城市结果结构体
        [NameInMap("city_result")]
        [Validation(Required=false)]
        public List<CityResult> CityResult { get; set; }

        // 车型结果结构体
        [NameInMap("spec_result")]
        [Validation(Required=false)]
        public List<SpecList> SpecResult { get; set; }

    }

}
