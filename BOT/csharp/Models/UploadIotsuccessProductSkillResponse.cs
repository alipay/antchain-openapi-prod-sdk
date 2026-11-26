// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class UploadIotsuccessProductSkillResponse : TeaModel {
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

        // createSkillPlugin返回插件ID
        [NameInMap("plugin_id")]
        [Validation(Required=true)]
        public string PluginId { get; set; }

        // 已解析文件名
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        // 已保存包版本摘要
        [NameInMap("revision")]
        [Validation(Required=true)]
        public string Revision { get; set; }

        [NameInMap("skill_count")]
        [Validation(Required=true)]
        public long? SkillCount { get; set; }

        [NameInMap("skills")]
        [Validation(Required=true)]
        public List<OpenApiSkillInfo> Skills { get; set; }

    }

}
