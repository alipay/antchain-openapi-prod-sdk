// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    public class SyncKmDocumentResponse : TeaModel {
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

        // 文档基础信息
        [NameInMap("document_info")]
        [Validation(Required=false)]
        public DocumentInfoDTO DocumentInfo { get; set; }

        // 向量文档id
        [NameInMap("doc_map_id")]
        [Validation(Required=false)]
        public string DocMapId { get; set; }

        // 加工后的文档数据
        [NameInMap("processed_data")]
        [Validation(Required=false)]
        public DocumentProcessingDataDTO ProcessedData { get; set; }

        // oss预览地址
        [NameInMap("oss_preview_url")]
        [Validation(Required=false)]
        public string OssPreviewUrl { get; set; }

    }

}
