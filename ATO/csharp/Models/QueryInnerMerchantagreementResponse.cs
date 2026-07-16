// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryInnerMerchantagreementResponse : TeaModel {
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

        // 签约状态 枚举
        // TOBE 待签
        // FAIL 签约失败
        // SUCCESS 签约成功
        [NameInMap("sign_status")]
        [Validation(Required=false)]
        public string SignStatus { get; set; }

        // 签约时间
        [NameInMap("sign_date_str")]
        [Validation(Required=false)]
        public string SignDateStr { get; set; }

        // 协议内容 富文本
        [NameInMap("agreement_content")]
        [Validation(Required=false)]
        public string AgreementContent { get; set; }

    }

}
