// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    // 基线扫描结果
    public class BaselineScanResult : TeaModel {
        // 类型
        [NameInMap("kind")]
        [Validation(Required=true)]
        public string Kind { get; set; }

        // 资源名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 命名空间
        [NameInMap("namespace")]
        [Validation(Required=false)]
        public string Namespace { get; set; }

        // 资源id
        [NameInMap("resource_id")]
        [Validation(Required=true)]
        public string ResourceId { get; set; }

        // 紧急control
        [NameInMap("criticals")]
        [Validation(Required=false)]
        public List<Control> Criticals { get; set; }

        // 高危control
        [NameInMap("highs")]
        [Validation(Required=false)]
        public List<Control> Highs { get; set; }

        // 中危controls
        [NameInMap("mids")]
        [Validation(Required=false)]
        public List<Control> Mids { get; set; }

        // 低危controls
        [NameInMap("lows")]
        [Validation(Required=false)]
        public List<Control> Lows { get; set; }

        // 资源内容
        [NameInMap("object")]
        [Validation(Required=false)]
        public string Object { get; set; }

    }

}
