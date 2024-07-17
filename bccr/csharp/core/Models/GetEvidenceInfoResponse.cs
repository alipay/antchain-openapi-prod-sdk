// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class GetEvidenceInfoResponse : TeaModel {
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

        // 取证编号
        [NameInMap("evidence_id")]
        [Validation(Required=false)]
        public string EvidenceId { get; set; }

        // 取证类型（LIVE：直播，VOD：点播）
        [NameInMap("evidence_type")]
        [Validation(Required=false)]
        public string EvidenceType { get; set; }

        // 取证状态（取证中：DOING，取证成功：SUCCESS，取证失败：FAIL）
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 公证处code
        [NameInMap("notary_office")]
        [Validation(Required=false)]
        public string NotaryOffice { get; set; }

        // 取证url信息
        [NameInMap("evidence_url")]
        [Validation(Required=false)]
        public EvidenceWebUrlInfo EvidenceUrl { get; set; }

        // 取证结果文件下载url（有效期3天）
        [NameInMap("evidence_result_url")]
        [Validation(Required=false)]
        public string EvidenceResultUrl { get; set; }

        // 存证证明信息
        [NameInMap("certificate_info")]
        [Validation(Required=false)]
        public EvidenceCertificateInfo CertificateInfo { get; set; }

        // 取证错误码
        [NameInMap("evidence_error_code")]
        [Validation(Required=false)]
        public string EvidenceErrorCode { get; set; }

        // 取证错误描述
        [NameInMap("evidence_error_msg")]
        [Validation(Required=false)]
        public string EvidenceErrorMsg { get; set; }

        // 取证开始时间
        [NameInMap("start_time")]
        [Validation(Required=false)]
        public long? StartTime { get; set; }

        // 取证结束时间
        [NameInMap("finish_time")]
        [Validation(Required=false)]
        public long? FinishTime { get; set; }

    }

}
