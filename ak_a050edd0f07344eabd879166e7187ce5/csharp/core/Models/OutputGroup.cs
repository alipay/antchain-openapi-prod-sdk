// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_a050edd0f07344eabd879166e7187ce5.Models
{
    // 交互节点数据结构
    public class OutputGroup : TeaModel {
        // 子节点id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 自节点名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 快捷条件选择类型
        [NameInMap("condition_type")]
        [Validation(Required=true)]
        public string ConditionType { get; set; }

        // 条件表达式
        [NameInMap("condition_config")]
        [Validation(Required=true)]
        public List<string> ConditionConfig { get; set; }

        // 子节点下的播报内容
        [NameInMap("content_list")]
        [Validation(Required=true)]
        public List<Output> ContentList { get; set; }

        // 重试播报时的优先级
        [NameInMap("priority")]
        [Validation(Required=true)]
        public long? Priority { get; set; }

    }

}
