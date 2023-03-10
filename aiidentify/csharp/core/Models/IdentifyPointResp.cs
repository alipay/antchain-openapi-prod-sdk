// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AIIDENTIFY.Models
{
    // 鉴定点信息
    public class IdentifyPointResp : TeaModel {
        // 鉴定点名称
        [NameInMap("identify_point_name")]
        [Validation(Required=true)]
        public string IdentifyPointName { get; set; }

        // 鉴定点序号
        [NameInMap("order")]
        [Validation(Required=true)]
        public long? Order { get; set; }

        // 鉴定点编号
        [NameInMap("identify_point_code")]
        [Validation(Required=true)]
        public string IdentifyPointCode { get; set; }

        // 标签图片oss链接
        [NameInMap("label_img")]
        [Validation(Required=true)]
        public string LabelImg { get; set; }

        // 示例图片oss链接
        [NameInMap("example_img")]
        [Validation(Required=true)]
        public string ExampleImg { get; set; }

        // 是否必传鉴定点
        [NameInMap("is_required")]
        [Validation(Required=true)]
        public bool? IsRequired { get; set; }

    }

}
