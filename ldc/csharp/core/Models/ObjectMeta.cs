// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // k8s meta元数据
    public class ObjectMeta : TeaModel {
        // k8s meta annotation
        [NameInMap("annotations")]
        [Validation(Required=false)]
        public List<Annotation> Annotations { get; set; }

        // 创建时间戳
        [NameInMap("creation_timestamp")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreationTimestamp { get; set; }

        // k8s meta labels
        [NameInMap("labels")]
        [Validation(Required=true)]
        public List<Label> Labels { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 命名空间
        [NameInMap("namespace")]
        [Validation(Required=false)]
        public string Namespace { get; set; }

    }

}
