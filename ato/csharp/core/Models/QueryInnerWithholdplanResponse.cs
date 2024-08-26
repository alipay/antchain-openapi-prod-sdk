// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryInnerWithholdplanResponse : TeaModel {
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

        // 总金额，单位为分
        [NameInMap("total_money")]
        [Validation(Required=false)]
        public long? TotalMoney { get; set; }

        // 总期数
        [NameInMap("total_term")]
        [Validation(Required=false)]
        public long? TotalTerm { get; set; }

        // 用户履约信息列表
        [NameInMap("pay_info")]
        [Validation(Required=false)]
        public List<UserPerformanceInfo> PayInfo { get; set; }

    }

}
