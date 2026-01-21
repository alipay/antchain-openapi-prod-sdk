// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AICLAIM.Models
{
    public class ExecImageClassificationResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 业务号，⽤于对账
        [NameInMap("batch_no")]
        [Validation(Required=false)]
        public string BatchNo { get; set; }

        // 枚举类型，详见接入文档说明
        [NameInMap("image_type")]
        [Validation(Required=false)]
        public string ImageType { get; set; }

        // 图片描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 增强后的图片
        [NameInMap("enhance_image")]
        [Validation(Required=false)]
        public string EnhanceImage { get; set; }

        // 是否模糊，返回0表示清晰，返回1表示模糊
        [NameInMap("is_blur")]
        [Validation(Required=false)]
        public bool? IsBlur { get; set; }

        // 是否复印件，返回0表示⾮ 复印件，返回1表示复印件
        [NameInMap("is_copyfile")]
        [Validation(Required=false)]
        public bool? IsCopyfile { get; set; }

        // 是否翻拍件，返回0表示⾮ 翻拍件，返回1表示翻拍件
        [NameInMap("is_remakefile")]
        [Validation(Required=false)]
        public bool? IsRemakefile { get; set; }

        // 材料是否不完整（有遮 挡），返回0表示完整（⽆ 遮挡），返回1表示材料不完 整（有遮挡）
        [NameInMap("is_uncomplet")]
        [Validation(Required=false)]
        public bool? IsUncomplet { get; set; }

        // 单张图片中是否包含2份及以上材料，0表示只有1份，1表示两份及以上
        [NameInMap("is_multi_material")]
        [Validation(Required=false)]
        public bool? IsMultiMaterial { get; set; }

    }

}
