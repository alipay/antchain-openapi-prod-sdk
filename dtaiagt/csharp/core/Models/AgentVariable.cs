// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // Agent对话-记忆参数列表
    // 
    public class AgentVariable : TeaModel {
        // 变量对应的id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 变量名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 变量code
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 变量描述
        [NameInMap("desc")]
        [Validation(Required=true)]
        public string Desc { get; set; }

        // 变量值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // 变量值更新时间
        [NameInMap("update_time")]
        [Validation(Required=true)]
        public string UpdateTime { get; set; }

        // "business", "业务参数"
        // "memory", "记忆参数"
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 是否模型可见
        [NameInMap("show_to_model")]
        [Validation(Required=true)]
        public bool? ShowToModel { get; set; }

    }

}
