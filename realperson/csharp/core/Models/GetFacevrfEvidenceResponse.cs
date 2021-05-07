// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class GetFacevrfEvidenceResponse : TeaModel {
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

        // 刷脸的certifyId，原样返回
        [NameInMap("certify_id")]
        [Validation(Required=false)]
        public string CertifyId { get; set; }

        // 统一证据ID，非SUCCESS状态为null，可在控制台中持统一证据ID验证pdf文件的正确性，法院方也可用此统一证据ID在司法链控制台进行核验pdf文件的正确性。
        [NameInMap("onchain_id")]
        [Validation(Required=false)]
        public string OnchainId { get; set; }

        // 上链状态，`SUCCESS`表示成功、`INIT`表示正在上链
        [NameInMap("onchain_status")]
        [Validation(Required=false)]
        public string OnchainStatus { get; set; }

        // pdf存证是否已经过期，不支持超过6个月的存证获取
        [NameInMap("pdf_expired")]
        [Validation(Required=false)]
        public bool? PdfExpired { get; set; }

        // 存证pdf文件内容的base64
        [NameInMap("pdf_content")]
        [Validation(Required=false)]
        public string PdfContent { get; set; }

    }

}
