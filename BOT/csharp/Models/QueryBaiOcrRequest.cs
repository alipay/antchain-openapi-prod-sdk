// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryBaiOcrRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 调用业务方身份标识，指明调用来源
        [NameInMap("app_key")]
        [Validation(Required=true)]
        public string AppKey { get; set; }

        // OCR服务的业务类型，目前支持：
        // businessLicense，营业执照识别
        // idCard，身份证识别
        // bankCard，银行卡识别
        // VATInvoice，增值税发票识别
        [NameInMap("ocr_type")]
        [Validation(Required=true)]
        public string OcrType { get; set; }

        // 请求的资源类型，目前支持：
        // image，图片
        // pdf，PDF复印件
        [NameInMap("source_type")]
        [Validation(Required=true)]
        public string SourceType { get; set; }

        // 图片或PDF等内容的base64内容字符串
        [NameInMap("source_base64")]
        [Validation(Required=true)]
        public string SourceBase64 { get; set; }

        // 资源的附加属性
        // 如针对身份证识别，需要指定face(人像面)或back(国徽面)
        [NameInMap("source_config_side")]
        [Validation(Required=false)]
        public string SourceConfigSide { get; set; }

    }

}
