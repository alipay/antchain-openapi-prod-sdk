// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAFECMDB.Models
{
    public class UpdateModelAttributeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 要更新的模型字段所属模型的唯一标识
        [NameInMap("model_id")]
        [Validation(Required=true)]
        public string ModelId { get; set; }

        // 要更新的模型字段的唯一标识
        [NameInMap("unique_id")]
        [Validation(Required=true)]
        public string UniqueId { get; set; }

        // 名称（所属模型内唯一）
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 是否只读
        [NameInMap("readonly")]
        [Validation(Required=true)]
        public bool? Readonly { get; set; }

        // 是否必填
        [NameInMap("required")]
        [Validation(Required=true)]
        public bool? Required { get; set; }

        // 用于前端展示排序，数字越大优先级越高，默认为 0
        [NameInMap("priority")]
        [Validation(Required=false)]
        public long? Priority { get; set; }

        // 用于前端展示的扩展属性
        [NameInMap("display_properties")]
        [Validation(Required=false)]
        public List<MapStringToStringEntry> DisplayProperties { get; set; }

    }

}
