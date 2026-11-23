// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVERENDER.Models
{
    public class PushAntcloudMarketingagentCreativeMaterialResponse : TeaModel {
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

        // 素材id
        [NameInMap("material_id")]
        [Validation(Required=false)]
        public string MaterialId { get; set; }

        // 产品码
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

        // 素材格式类型
        [NameInMap("material_type")]
        [Validation(Required=false)]
        public string MaterialType { get; set; }

        // 素材形式（素材包还是单素材）
        [NameInMap("material_form")]
        [Validation(Required=false)]
        public string MaterialForm { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 素材大小
        [NameInMap("size_bytes")]
        [Validation(Required=false)]
        public long? SizeBytes { get; set; }

        // 文件url
        [NameInMap("file_url")]
        [Validation(Required=false)]
        public string FileUrl { get; set; }

        // 模版元数据
        [NameInMap("template_data")]
        [Validation(Required=false)]
        public MaterialTemplateData TemplateData { get; set; }

        // 时长，单位秒
        [NameInMap("duration_seconds")]
        [Validation(Required=false)]
        public string DurationSeconds { get; set; }

    }

}
