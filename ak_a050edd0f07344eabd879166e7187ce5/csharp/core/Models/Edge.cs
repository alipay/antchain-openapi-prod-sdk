// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_a050edd0f07344eabd879166e7187ce5.Models
{
    // 流程数据结构
    public class Edge : TeaModel {
        // 边的id，这个是前端生成的，用于图关系
        [NameInMap("edge_id")]
        [Validation(Required=true)]
        public string EdgeId { get; set; }

        // key为上面content中的变量value为名称
        [NameInMap("variable_map")]
        [Validation(Required=true)]
        public string VariableMap { get; set; }

        // 边的规则表达式
        [NameInMap("front_condition_expression")]
        [Validation(Required=true)]
        public List<string> FrontConditionExpression { get; set; }

        // 前端图形相关
        [NameInMap("shape")]
        [Validation(Required=true)]
        public Shape Shape { get; set; }

        // 边连接的上一个节点的feId
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 边连接的下一个节点的feId
        [NameInMap("target")]
        [Validation(Required=true)]
        public string Target { get; set; }

        // 优先级，0~999
        [NameInMap("priority")]
        [Validation(Required=true)]
        public long? Priority { get; set; }

    }

}
