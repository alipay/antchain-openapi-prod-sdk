// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGENT.Models
{
    public class DetailKmTreeResponse : TeaModel {
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

        // 知识库ID
        [NameInMap("tree_id")]
        [Validation(Required=false)]
        public string TreeId { get; set; }

        // 知识库名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 知识库描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 知识库图标
        [NameInMap("icon")]
        [Validation(Required=false)]
        public string Icon { get; set; }

        // 最新版本号(无版本为空)
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

        // 当前激活版本号(未激活为空)
        [NameInMap("active_version")]
        [Validation(Required=false)]
        public string ActiveVersion { get; set; }

        // 节点总数
        [NameInMap("node_count")]
        [Validation(Required=false)]
        public long? NodeCount { get; set; }

        // 文档总数
        [NameInMap("document_count")]
        [Validation(Required=false)]
        public long? DocumentCount { get; set; }

        // 是否开启图谱编译
        [NameInMap("graph_enabled")]
        [Validation(Required=false)]
        public bool? GraphEnabled { get; set; }

        // 处理中(未终态)编译任务数(仅图谱开启返回)
        [NameInMap("compile_task_count")]
        [Validation(Required=false)]
        public long? CompileTaskCount { get; set; }

        // 根节点树JSON文本(OpenNode字段定义见文档)
        [NameInMap("root_node_json")]
        [Validation(Required=false)]
        public string RootNodeJson { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false)]
        public string GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public string GmtModified { get; set; }

        // 租户标签(官方租户数据为official)
        [NameInMap("tenant_tag")]
        [Validation(Required=false)]
        public string TenantTag { get; set; }

    }

}
