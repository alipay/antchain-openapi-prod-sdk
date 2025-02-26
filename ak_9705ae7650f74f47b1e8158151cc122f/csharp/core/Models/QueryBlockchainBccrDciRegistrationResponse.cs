// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_9705ae7650f74f47b1e8158151cc122f.Models
{
    public class QueryBlockchainBccrDciRegistrationResponse : TeaModel {
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

        // 废弃待删除
        [NameInMap("content_status")]
        [Validation(Required=false)]
        public string ContentStatus { get; set; }

        // 废弃待删除
        [NameInMap("register_cert_tx_hash")]
        [Validation(Required=false)]
        public string RegisterCertTxHash { get; set; }

        // 废弃待删除
        [NameInMap("register_cert_block_height")]
        [Validation(Required=false)]
        public string RegisterCertBlockHeight { get; set; }

        // 废弃待删除
        [NameInMap("register_cert_tsr")]
        [Validation(Required=false)]
        public string RegisterCertTsr { get; set; }

        // 废弃待删除
        [NameInMap("register_cert_png_file_id")]
        [Validation(Required=false)]
        public string RegisterCertPngFileId { get; set; }

        // 废弃待删除
        [NameInMap("register_sample_file_id")]
        [Validation(Required=false)]
        public string RegisterSampleFileId { get; set; }

        // 废弃待删除
        [NameInMap("register_sample_png_file_id")]
        [Validation(Required=false)]
        public string RegisterSamplePngFileId { get; set; }

        // 废弃待删除
        [NameInMap("register_download_times_left")]
        [Validation(Required=false)]
        public long? RegisterDownloadTimesLeft { get; set; }

        // 废弃待删除
        [NameInMap("error_reason")]
        [Validation(Required=false)]
        public string ErrorReason { get; set; }

        // 废弃待删除
        [NameInMap("error_reason_cn")]
        [Validation(Required=false)]
        public string ErrorReasonCn { get; set; }

        // 废弃待删除
        [NameInMap("invoice_file_id_list")]
        [Validation(Required=false)]
        public List<string> InvoiceFileIdList { get; set; }

        // 废弃待删除
        [NameInMap("apply_register_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ApplyRegisterTime { get; set; }

        // 数登登记号
        [NameInMap("reg_number")]
        [Validation(Required=false)]
        public string RegNumber { get; set; }

        // 数登id
        [NameInMap("digital_register_id")]
        [Validation(Required=false)]
        public string DigitalRegisterId { get; set; }

        // dci申领id
        [NameInMap("dci_content_id")]
        [Validation(Required=false)]
        public string DciContentId { get; set; }

        // 数登状态
        [NameInMap("digital_register_status")]
        [Validation(Required=false)]
        public string DigitalRegisterStatus { get; set; }

        // 数登申请时间
        [NameInMap("digital_register_apply_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DigitalRegisterApplyTime { get; set; }

        // 数登完成时间
        [NameInMap("digital_register_completion_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DigitalRegisterCompletionTime { get; set; }

        // 数登证书预览图url
        [NameInMap("digital_register_cert_png_url")]
        [Validation(Required=false)]
        public string DigitalRegisterCertPngUrl { get; set; }

        // 样本证书预览图url
        [NameInMap("digital_register_sample_png_url")]
        [Validation(Required=false)]
        public string DigitalRegisterSamplePngUrl { get; set; }

        // 证书本月剩余下载次数
        [NameInMap("download_times_left")]
        [Validation(Required=false)]
        public long? DownloadTimesLeft { get; set; }

        // 发票下载链接list
        [NameInMap("invoice_url_list")]
        [Validation(Required=false)]
        public List<string> InvoiceUrlList { get; set; }

        // 数登失败详情
        [NameInMap("fail_detail")]
        [Validation(Required=false)]
        public string FailDetail { get; set; }

        // 补正类型
        [NameInMap("amend_type")]
        [Validation(Required=false)]
        public string AmendType { get; set; }

        // 用户申请表url
        [NameInMap("apply_form_url")]
        [Validation(Required=false)]
        public string ApplyFormUrl { get; set; }

        // 数登流水号
        [NameInMap("flow_number")]
        [Validation(Required=false)]
        public string FlowNumber { get; set; }

    }

}
