// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_a050edd0f07344eabd879166e7187ce5.Models
{
    // 动作节点数据结构
    public class Input : TeaModel {
        // 参数唯一id
        [NameInMap("fe_id")]
        [Validation(Required=true)]
        public string FeId { get; set; }

        // 因子的id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 参数的code
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 参数的名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 参数取值
        [NameInMap("value")]
        [Validation(Required=true)]
        public List<string> Value { get; set; }

        // 参数的值类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 是否使用自定义值
        [NameInMap("custom")]
        [Validation(Required=true)]
        public bool? Custom { get; set; }

        // 是否多选
        [NameInMap("multiple")]
        [Validation(Required=true)]
        public bool? Multiple { get; set; }

    }

}
