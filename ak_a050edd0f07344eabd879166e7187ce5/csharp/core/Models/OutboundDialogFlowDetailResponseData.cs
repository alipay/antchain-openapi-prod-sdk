// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_a050edd0f07344eabd879166e7187ce5.Models
{
    // 流程详情返回体
    public class OutboundDialogFlowDetailResponseData : TeaModel {
        // 数据库自增id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 前端生成的随机字符串id
        [NameInMap("fe_id")]
        [Validation(Required=true)]
        public string FeId { get; set; }

        // 流程名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 流程当前版本号
        [NameInMap("version")]
        [Validation(Required=true)]
        public long? Version { get; set; }

        // 流程版本号集合
        [NameInMap("versions")]
        [Validation(Required=true)]
        public List<long?> Versions { get; set; }

        // 全局配置
        [NameInMap("global_config")]
        [Validation(Required=true)]
        public string GlobalConfig { get; set; }

        // 流程类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 暂存code
        [NameInMap("temporary_storage_code")]
        [Validation(Required=true)]
        public string TemporaryStorageCode { get; set; }

        // 视频播报类型
        [NameInMap("flow_interactive_type")]
        [Validation(Required=true)]
        public string FlowInteractiveType { get; set; }

        // 流程图边数据
        [NameInMap("edges")]
        [Validation(Required=true)]
        public List<Edge> Edges { get; set; }

        // 流程图节点数据
        [NameInMap("nodes")]
        [Validation(Required=true)]
        public List<Node> Nodes { get; set; }

    }

}
