// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ZJLM.Models
{
    // 溯源报告单响应数据
    public class QiaReportTraceResponse : TeaModel {
        // 任务编号
        [NameInMap("qi_id")]
        [Validation(Required=true)]
        public string QiId { get; set; }

        // 颁发机构
        [NameInMap("qi_org_name")]
        [Validation(Required=true)]
        public string QiOrgName { get; set; }

        // 区块链,哈希值
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 有效期开始
        [NameInMap("qi_start_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string QiStartTime { get; set; }

        // 有效期结束
        [NameInMap("qi_end_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string QiEndTime { get; set; }

        // 认证证书资料
        [NameInMap("certification_files")]
        [Validation(Required=true)]
        public List<FileInfoModelResponse> CertificationFiles { get; set; }

        // 报告类型
        //      * REPORT, 报告认证
        //      * NEWSTANDARD, 新标质检
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 报告状态
        //      * PASS 已通过
        [NameInMap("qi_status")]
        [Validation(Required=true)]
        public string QiStatus { get; set; }

        // 标签key
        [NameInMap("qi_tag_key")]
        [Validation(Required=true)]
        public string QiTagKey { get; set; }

        // 标签名
        [NameInMap("qi_tag_name")]
        [Validation(Required=true)]
        public string QiTagName { get; set; }

    }

}
