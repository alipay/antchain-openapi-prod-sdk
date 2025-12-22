// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 生成签名图片明细
    public class CreatePngDetails : TeaModel {
        // 明细唯一id，必填（用于标识明细中的唯一键，返回多个图片地址时，根据id去进行匹配）
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 身份类型，必填，SignUserTypeEnum
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 名称，个人姓名/公司名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 证件号，个人身份证/公司统一社会信用代码
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 字体大小，选填，推荐不传（除特殊场景需要），默认40
        [NameInMap("font_size")]
        [Validation(Required=false)]
        public long? FontSize { get; set; }

        // 自定义名称，选填，不传则默认按照name参数中的值生成文件名。此参数主要用于同一个人需要生成不同样式的签名图片场景
        [NameInMap("custom_name")]
        [Validation(Required=false)]
        public string CustomName { get; set; }

        // 字体颜色，选填，推荐不传（除特殊场景需要），默认黑色
        [NameInMap("font_color")]
        [Validation(Required=false)]
        public string FontColor { get; set; }

        // [是否带边框，选填，推荐不传（除特殊场景需要），默认false]": "boolean"
        [NameInMap("with_border")]
        [Validation(Required=false)]
        public bool? WithBorder { get; set; }

        // [边框颜色，选填，推荐不传（除特殊场景需要），默认红色]
        [NameInMap("border_color")]
        [Validation(Required=false)]
        public string BorderColor { get; set; }

    }

}
