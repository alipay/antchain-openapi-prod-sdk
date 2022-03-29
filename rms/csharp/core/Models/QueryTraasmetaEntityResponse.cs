// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryTraasmetaEntityResponse : TeaModel {
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

        // 实体名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 展示名称
        [NameInMap("display_name")]
        [Validation(Required=false)]
        public string DisplayName { get; set; }

        // 实体所属分组名称
        [NameInMap("group_name")]
        [Validation(Required=false)]
        public string GroupName { get; set; }

        // 实例所属分组展示名称
        [NameInMap("group_display_name")]
        [Validation(Required=false)]
        public string GroupDisplayName { get; set; }

    }

}
