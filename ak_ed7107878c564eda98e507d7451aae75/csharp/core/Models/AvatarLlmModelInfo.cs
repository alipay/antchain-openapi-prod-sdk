// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ed7107878c564eda98e507d7451aae75.Models
{
    // 数字人平台模型配置信息
    public class AvatarLlmModelInfo : TeaModel {
        // 模型id
        [NameInMap("model_id")]
        [Validation(Required=true)]
        public string ModelId { get; set; }

        // 模型名称
        [NameInMap("model_name")]
        [Validation(Required=true)]
        public string ModelName { get; set; }

        // 模型编码
        [NameInMap("model_code")]
        [Validation(Required=true)]
        public string ModelCode { get; set; }

        // 模型描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 模型图片url
        [NameInMap("image_url")]
        [Validation(Required=false)]
        public string ImageUrl { get; set; }

    }

}
