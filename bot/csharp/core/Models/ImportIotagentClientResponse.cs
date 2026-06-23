// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ImportIotagentClientResponse : TeaModel {
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

        // 成功加白的UID列表
        [NameInMap("success_uid_list")]
        [Validation(Required=false)]
        public List<string> SuccessUidList { get; set; }

        // 已存在的UID列表
        [NameInMap("existed_uid_list")]
        [Validation(Required=false)]
        public List<string> ExistedUidList { get; set; }

        // 无效的UID列表
        [NameInMap("invalid_uid_list")]
        [Validation(Required=false)]
        public List<string> InvalidUidList { get; set; }

    }

}
