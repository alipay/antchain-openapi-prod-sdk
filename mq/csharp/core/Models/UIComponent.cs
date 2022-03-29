// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 前端展示的UI组件
    public class UIComponent : TeaModel {
        // UI组件类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // UI组件中的 内容组成部分，可以由多个Content对象组成
        [NameInMap("contents")]
        [Validation(Required=true)]
        public List<ComponentContent> Contents { get; set; }

        // 列表内元素组件集合
        [NameInMap("list_items")]
        [Validation(Required=false)]
        public List<ItemComponent> ListItems { get; set; }

    }

}
