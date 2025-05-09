// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GATEWAYX.Models
{
    public class QueryMessageFailedResponse : TeaModel {
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

        // 每页条数
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public string PageSize { get; set; }

        // 第几页
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public string PageNum { get; set; }

        // 总条数
        [NameInMap("total_num")]
        [Validation(Required=false)]
        public string TotalNum { get; set; }

        // 最终失败的消息列表
        [NameInMap("msg_list")]
        [Validation(Required=false)]
        public List<XMessageInfo> MsgList { get; set; }

    }

}
