// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class ImportBlockchainBotIotsuccessProductDeviceResponse : TeaModel {
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

        // 已有导入链已提交的MAC，不等于注册完成或已激活
        [NameInMap("success_uid_list")]
        [Validation(Required=true)]
        public List<string> SuccessUidList { get; set; }

        // 已有设备记录的MAC，可能仍在REGISTERING；沿旧名单语义
        [NameInMap("existed_uid_list")]
        [Validation(Required=true)]
        public List<string> ExistedUidList { get; set; }

        // 已有MAC校验判定无效的输入
        [NameInMap("invalid_uid_list")]
        [Validation(Required=true)]
        public List<string> InvalidUidList { get; set; }

    }

}
