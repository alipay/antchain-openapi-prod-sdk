// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAFECMDB.Models
{
    // 模型关联
    public class ModelRelationship : TeaModel {
        // 目标模型的唯一标识
        [NameInMap("destination_model_id")]
        [Validation(Required=true)]
        public string DestinationModelId { get; set; }

        // 源模型的唯一标识（目标模型内唯一）
        [NameInMap("source_model_id")]
        [Validation(Required=true)]
        public string SourceModelId { get; set; }

        // 唯一标识（目标模型内唯一，等同于目标模型中与源模型建立关联的外键属性）
        [NameInMap("unique_id")]
        [Validation(Required=true)]
        public string UniqueId { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 关联类型【取值范围：ONE_TO_ONE，ONE_TO_MANY】
        [NameInMap("relation_type")]
        [Validation(Required=true)]
        public string RelationType { get; set; }

        // 是否为系统内置
        [NameInMap("system")]
        [Validation(Required=true)]
        public bool? System { get; set; }

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
