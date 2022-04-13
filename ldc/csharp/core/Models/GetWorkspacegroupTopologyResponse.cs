// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class GetWorkspacegroupTopologyResponse : TeaModel {
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

        // 环境逻辑单元信息。
        [NameInMap("cell_groups")]
        [Validation(Required=false)]
        public List<CellGroup> CellGroups { get; set; }

        // 环境(WorkspaceGroup)名称。
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 环境机房信息。
        [NameInMap("zones")]
        [Validation(Required=false)]
        public List<ZoneInfo> Zones { get; set; }

    }

}
