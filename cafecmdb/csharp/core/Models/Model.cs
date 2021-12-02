// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAFECMDB.Models
{
    // 模型
    public class Model : TeaModel {
        // 唯一标识（全局唯一）
        [NameInMap("unique_id")]
        [Validation(Required=true)]
        public string UniqueId { get; set; }

        // 名称（全局唯一）
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 所属模型分组的唯一标识
        [NameInMap("category_id")]
        [Validation(Required=true)]
        public string CategoryId { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 是否为系统内置
        [NameInMap("system")]
        [Validation(Required=true)]
        public bool? System { get; set; }

        // 用于前端展示排序，数字越大优先级越高，默认为 0
        [NameInMap("priority")]
        [Validation(Required=true)]
        public long? Priority { get; set; }

        // 用于前端展示的扩展属性
        [NameInMap("display_properties")]
        [Validation(Required=false)]
        public List<MapStringToStringEntry> DisplayProperties { get; set; }

        // 创建时间
        [NameInMap("created_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreatedTime { get; set; }

        // 修改时间
        [NameInMap("modified_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ModifiedTime { get; set; }

    }

}
