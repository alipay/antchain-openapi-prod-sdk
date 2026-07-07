// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 网页取证数据
    public class ScreenshotData : TeaModel {
        // 取证地址
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://xxxx">https://xxxx</a></para>
        /// </summary>
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        // 网页取证时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>111111</para>
        /// </summary>
        [NameInMap("gmt_evidence")]
        [Validation(Required=false)]
        public long? GmtEvidence { get; set; }

        // 网页取证文件Hash值
        /// <summary>
        /// <b>Example:</b>
        /// <para>00030a38fae767396d499b306c810d2f08c15773f8447d870e5e0235e6634ed10000</para>
        /// </summary>
        [NameInMap("file_hash")]
        [Validation(Required=false)]
        public string FileHash { get; set; }

        // 网页取证文件大小
        /// <summary>
        /// <b>Example:</b>
        /// <para>111111</para>
        /// </summary>
        [NameInMap("file_size")]
        [Validation(Required=false)]
        public long? FileSize { get; set; }

        // 统一证据编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1d642de2e838c809965768d7fd63230c10ad8740809b5bc0a070855397674ea5</para>
        /// </summary>
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 网页取证文件存证块高
        /// <summary>
        /// <b>Example:</b>
        /// <para>111111</para>
        /// </summary>
        [NameInMap("block_height")]
        [Validation(Required=false)]
        public long? BlockHeight { get; set; }

        // 网页取证文件上链时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>111111</para>
        /// </summary>
        [NameInMap("timestamp")]
        [Validation(Required=false)]
        public long? Timestamp { get; set; }

        // 可信时间戳的返回对象
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;cTSR&quot;:&quot;1f8b080000009d0e6c198caccc2c4c&quot;,&quot;code&quot;:&quot;0&quot;,&quot;hashAlgorithm&quot;:&quot;sha256&quot;,&quot;hashedMessage&quot;:&quot;3585100148072894b8&quot;,&quot;sN&quot;:&quot;TTAS_S.0.2_87310861339018912&quot;,&quot;tS&quot;:1602672018916,&quot;version&quot;:&quot;2.0&quot;}</para>
        /// </summary>
        [NameInMap("tsr")]
        [Validation(Required=false)]
        public string Tsr { get; set; }

        // 网页截图文件公证处证书下载链接
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://xxxx">https://xxxx</a></para>
        /// </summary>
        [NameInMap("certificate_url")]
        [Validation(Required=false)]
        public string CertificateUrl { get; set; }

        // 公证处证书编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>111111</para>
        /// </summary>
        [NameInMap("certificate_storage_no")]
        [Validation(Required=false)]
        public string CertificateStorageNo { get; set; }

        // 网页取证工具软件版本号
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.0.1</para>
        /// </summary>
        [NameInMap("tool_version")]
        [Validation(Required=false)]
        public string ToolVersion { get; set; }

        // 证据包下载地址（状态为SUCCESS 才有数据）
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://xxxx">https://xxxx</a></para>
        /// </summary>
        [NameInMap("screenshot_zip")]
        [Validation(Required=false)]
        public string ScreenshotZip { get; set; }

        // 取证文件信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>111111</para>
        /// </summary>
        [NameInMap("screenshot_info")]
        [Validation(Required=false)]
        public ScreenshotInfo ScreenshotInfo { get; set; }

        // 网页title
        /// <summary>
        /// <b>Example:</b>
        /// <para>测试</para>
        /// </summary>
        [NameInMap("head_title")]
        [Validation(Required=false)]
        public string HeadTitle { get; set; }

        // 证据包交易hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd</para>
        /// </summary>
        [NameInMap("zip_tx_hash")]
        [Validation(Required=false)]
        public string ZipTxHash { get; set; }

        // 网页取证失败原因
        /// <summary>
        /// <b>Example:</b>
        /// <para>error</para>
        /// </summary>
        [NameInMap("error_reason")]
        [Validation(Required=false)]
        public string ErrorReason { get; set; }

        // 中文失败原因
        /// <summary>
        /// <b>Example:</b>
        /// <para>中文失败原因</para>
        /// </summary>
        [NameInMap("error_reason_cn")]
        [Validation(Required=false)]
        public string ErrorReasonCn { get; set; }

        // 证据包文件hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>0003fa8261d1cd6cb419264d516f9b586687e39a0dc31b2c74ff4948e8b951e61afd</para>
        /// </summary>
        [NameInMap("zip_file_hash")]
        [Validation(Required=false)]
        public string ZipFileHash { get; set; }

        // 核心证据文件名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>test.jpg</para>
        /// </summary>
        [NameInMap("main_evidence_name")]
        [Validation(Required=false)]
        public string MainEvidenceName { get; set; }

        // 取证申请单号
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("evidence_order_num")]
        [Validation(Required=false)]
        public string EvidenceOrderNum { get; set; }

        // 取证开始时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("gmt_evidence_start")]
        [Validation(Required=false)]
        public long? GmtEvidenceStart { get; set; }

    }

}
