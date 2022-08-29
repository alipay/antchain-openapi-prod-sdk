// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class QueryDciRegistrationResponse : TeaModel {
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

        // 状态
        [NameInMap("content_status")]
        [Validation(Required=false)]
        public string ContentStatus { get; set; }

        // 登记证书txHash
        [NameInMap("register_cert_tx_hash")]
        [Validation(Required=false)]
        public string RegisterCertTxHash { get; set; }

        // 登记证书存证高度
        [NameInMap("register_cert_block_height")]
        [Validation(Required=false)]
        public string RegisterCertBlockHeight { get; set; }

        // 登记证书tsr
        [NameInMap("register_cert_tsr")]
        [Validation(Required=false)]
        public string RegisterCertTsr { get; set; }

        // 登记证书预览fileId
        [NameInMap("register_cert_png_file_id")]
        [Validation(Required=false)]
        public string RegisterCertPngFileId { get; set; }

        // 数登样本oss fileId
        [NameInMap("register_sample_file_id")]
        [Validation(Required=false)]
        public string RegisterSampleFileId { get; set; }

        // 数登样本预览oss fileId
        [NameInMap("register_sample_png_file_id")]
        [Validation(Required=false)]
        public string RegisterSamplePngFileId { get; set; }

        // 剩余下载次数
        [NameInMap("register_download_times_left")]
        [Validation(Required=false)]
        public long? RegisterDownloadTimesLeft { get; set; }

        // 错误原因
        [NameInMap("error_reason")]
        [Validation(Required=false)]
        public string ErrorReason { get; set; }

        // 发票oss fileId List
        [NameInMap("invoice_file_id_list")]
        [Validation(Required=false)]
        public List<string> InvoiceFileIdList { get; set; }

        // 数登申请时间
        [NameInMap("apply_register_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ApplyRegisterTime { get; set; }

    }

}
