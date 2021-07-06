// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class QueryIdcocrIdcardResponse : TeaModel {
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

        // 地址
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 出生年月日
        [NameInMap("birth")]
        [Validation(Required=false)]
        public string Birth { get; set; }

        // 信息抽取失败后详细错误原因
        [NameInMap("error_content")]
        [Validation(Required=false)]
        public string ErrorContent { get; set; }

        // 身份证号码
        [NameInMap("num")]
        [Validation(Required=false)]
        public string Num { get; set; }

        // 性别：男/女
        [NameInMap("sex")]
        [Validation(Required=false)]
        public string Sex { get; set; }

        // 解析成功
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // 有效期截止时间
        [NameInMap("end_date")]
        [Validation(Required=false)]
        public string EndDate { get; set; }

        // 公安局分案
        [NameInMap("issue")]
        [Validation(Required=false)]
        public string Issue { get; set; }

        // 有效期开始时间
        [NameInMap("start_date")]
        [Validation(Required=false)]
        public string StartDate { get; set; }

        // 民族
        [NameInMap("nationality")]
        [Validation(Required=false)]
        public string Nationality { get; set; }

    }

}
