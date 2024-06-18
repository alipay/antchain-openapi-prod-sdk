// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ImportTechintegrationSkugrantwhitelistResponse : TeaModel {
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

        // 成功导入的sn列表
        [NameInMap("success_sn_list")]
        [Validation(Required=false)]
        public List<string> SuccessSnList { get; set; }

        // 已经存在的sn列表（不会导入）
        [NameInMap("existed_sn_list")]
        [Validation(Required=false)]
        public List<string> ExistedSnList { get; set; }

        // 不合法的sn列表（不会导入）
        [NameInMap("invalid_sn_list")]
        [Validation(Required=false)]
        public List<string> InvalidSnList { get; set; }

    }

}
