// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    public class QueryUsedcarSeriesResponse : TeaModel {
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

        // 品牌id
        [NameInMap("brandid")]
        [Validation(Required=false)]
        public string Brandid { get; set; }

        // 车系信息
        [NameInMap("serieslist")]
        [Validation(Required=false)]
        public List<LetterInfo> Serieslist { get; set; }

        // 品牌名称
        [NameInMap("brandname")]
        [Validation(Required=false)]
        public string Brandname { get; set; }

        // 状态码
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 响应结果
        [NameInMap("msg")]
        [Validation(Required=false)]
        public string Msg { get; set; }

    }

}
