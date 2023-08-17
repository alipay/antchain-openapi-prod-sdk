// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_bc907d13969a4eb68852866122b96ffd.Models
{
    public class CreateItagAntitagTaskRequestResponse : TeaModel {
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

        // taskId
        [NameInMap("taskid")]
        [Validation(Required=false)]
        public string Taskid { get; set; }

        // flowrunid
        [NameInMap("flowrunid")]
        [Validation(Required=false)]
        public string Flowrunid { get; set; }

        // msgid
        [NameInMap("msgid")]
        [Validation(Required=false)]
        public string Msgid { get; set; }

        // slavemsgid
        [NameInMap("slavemsgid")]
        [Validation(Required=false)]
        public string Slavemsgid { get; set; }

        // reftaskid
        [NameInMap("reftaskid")]
        [Validation(Required=false)]
        public string Reftaskid { get; set; }

    }

}
