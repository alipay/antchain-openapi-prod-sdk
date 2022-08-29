// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class QueryDciPreregistrationResponse : TeaModel {
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

        // 预登记状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 文件哈希
        [NameInMap("file_hash")]
        [Validation(Required=false)]
        public string FileHash { get; set; }

        // 文件哈希存证txHash
        [NameInMap("file_hash_tx_hash")]
        [Validation(Required=false)]
        public string FileHashTxHash { get; set; }

        // 文件哈希存证区块高度
        [NameInMap("file_hash_block_height")]
        [Validation(Required=false)]
        public string FileHashBlockHeight { get; set; }

        // dci编码
        [NameInMap("dci_code")]
        [Validation(Required=false)]
        public string DciCode { get; set; }

        // DCI码存证txHash
        [NameInMap("dci_code_tx_hash")]
        [Validation(Required=false)]
        public string DciCodeTxHash { get; set; }

        // DCI码存证高度
        [NameInMap("dci_code_block_height")]
        [Validation(Required=false)]
        public string DciCodeBlockHeight { get; set; }

        // DCI码fileHash存证txHash
        [NameInMap("dci_code_file_tx_hash")]
        [Validation(Required=false)]
        public string DciCodeFileTxHash { get; set; }

        // DCI码fileHash存证高度
        [NameInMap("dci_code_file_block_height")]
        [Validation(Required=false)]
        public string DciCodeFileBlockHeight { get; set; }

        // 预登记证书txhash
        [NameInMap("pre_reg_cert_tx_hash")]
        [Validation(Required=false)]
        public string PreRegCertTxHash { get; set; }

        // 预登记证书存证高度
        [NameInMap("pre_reg_cert_block_height")]
        [Validation(Required=false)]
        public string PreRegCertBlockHeight { get; set; }

        // 预登记取消txHash
        [NameInMap("cancel_tx_hash")]
        [Validation(Required=false)]
        public string CancelTxHash { get; set; }

        // 预登记取消存证高度
        [NameInMap("cancel_block_height")]
        [Validation(Required=false)]
        public string CancelBlockHeight { get; set; }

        // dciCode的可信时间戳信息
        [NameInMap("dci_code_tsr")]
        [Validation(Required=false)]
        public string DciCodeTsr { get; set; }

        // dciCode fileHash的可信时间戳信息
        [NameInMap("dci_code_file_tsr")]
        [Validation(Required=false)]
        public string DciCodeFileTsr { get; set; }

        // 预登记证书可信时间戳信息
        [NameInMap("pre_reg_cert_tsr")]
        [Validation(Required=false)]
        public string PreRegCertTsr { get; set; }

        // 预登记证书oss fileId
        [NameInMap("pre_reg_cert_file_id")]
        [Validation(Required=false)]
        public string PreRegCertFileId { get; set; }

        // 预登记证书fileHash
        [NameInMap("pre_reg_cert_file_hash")]
        [Validation(Required=false)]
        public string PreRegCertFileHash { get; set; }

        // 预登记证书下载链接
        [NameInMap("pre_reg_cert_url")]
        [Validation(Required=false)]
        public string PreRegCertUrl { get; set; }

        // 预览图oss fileId
        [NameInMap("png_file_id")]
        [Validation(Required=false)]
        public string PngFileId { get; set; }

        // 申请发码时间
        [NameInMap("apply_obtain_date")]
        [Validation(Required=false)]
        public string ApplyObtainDate { get; set; }

        // DCI码创建时间
        [NameInMap("dci_code_obtain_date")]
        [Validation(Required=false)]
        public string DciCodeObtainDate { get; set; }

        // 错误原因
        [NameInMap("error_reason")]
        [Validation(Required=false)]
        public string ErrorReason { get; set; }

        // 公式地址
        [NameInMap("publication_url")]
        [Validation(Required=false)]
        public string PublicationUrl { get; set; }

    }

}
