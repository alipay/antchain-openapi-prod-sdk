// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDIGITAL.Models
{
    // AssetUri定义
    public class AssetUriDefinition : TeaModel {
        // 数字权证名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 数字权证描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 该权证的图片地址
        [NameInMap("image")]
        [Validation(Required=true)]
        public string Image { get; set; }

        // 资产指向外部的链接
        [NameInMap("external_url")]
        [Validation(Required=false)]
        public string ExternalUrl { get; set; }

        // 背景颜色, 16进制6位Hex
        [NameInMap("background_color")]
        [Validation(Required=false)]
        public string BackgroundColor { get; set; }

        // 动态资源地址，可指向音视频资源，需先上传
        [NameInMap("animation_url")]
        [Validation(Required=false)]
        public string AnimationUrl { get; set; }

        // 资源集合，可定义多个组合资源，适合有多资源文件的资产
        [NameInMap("resource_bundle")]
        [Validation(Required=false)]
        public List<ResourceBundle> ResourceBundle { get; set; }

        // 自定义的资产属性数组，数组元素需为json格式
        [NameInMap("attributes")]
        [Validation(Required=false)]
        public List<string> Attributes { get; set; }

    }

}
