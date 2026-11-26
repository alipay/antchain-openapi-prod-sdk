// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class StatusBlockchainBotIotsuccessProductSkillResponse : TeaModel {
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

        [NameInMap("plugin_id")]
        [Validation(Required=true)]
        public string PluginId { get; set; }

        // 既有Skill配置revision，缺失为null
        [NameInMap("revision")]
        [Validation(Required=true)]
        public string Revision { get; set; }

        // 已有资产启用状态；不等于安全审核通过
        [NameInMap("enable")]
        [Validation(Required=true)]
        public bool? Enable { get; set; }

        // 已有权威资产安全状态；未接通或源字段不存在为null，不虚构READY
        [NameInMap("publish_status")]
        [Validation(Required=true)]
        public string PublishStatus { get; set; }

        // 源记录有失败原因时脱敏返回，否则null
        [NameInMap("error_message")]
        [Validation(Required=true)]
        public string ErrorMessage { get; set; }

    }

}
