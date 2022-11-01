// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryJusticeCaseResponse : TeaModel {
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

        // 案件ID
        [NameInMap("case_id")]
        [Validation(Required=false)]
        public long? CaseId { get; set; }

        // 维权记录ID
        [NameInMap("record_id")]
        [Validation(Required=false)]
        public long? RecordId { get; set; }

        // 外部业务id
        [NameInMap("external_biz_id")]
        [Validation(Required=false)]
        public string ExternalBizId { get; set; }

        // 案件阶段
        // 待发起维权
        // 待提交
        // 收案处理中
        // 结果待确认
        // 已关闭
        [NameInMap("case_phase_desc")]
        [Validation(Required=false)]
        public string CasePhaseDesc { get; set; }

        // 维权方式, (目前仅支持司法调解)
        // 诉讼-2
        // 仲裁-3
        // 仲裁执行-4
        // 司法调解-5
        [NameInMap("judicial_record_type_desc")]
        [Validation(Required=false)]
        public string JudicialRecordTypeDesc { get; set; }

        // 维权状态字段描述.
        // 
        [NameInMap("judicial_record_status_desc")]
        [Validation(Required=false)]
        public string JudicialRecordStatusDesc { get; set; }

        // "yyyy-MM-dd" , 当前的状态更新时间
        [NameInMap("judicial_record_status_time")]
        [Validation(Required=false)]
        public string JudicialRecordStatusTime { get; set; }

        // 维权过程中的文件列表
        [NameInMap("judicial_files")]
        [Validation(Required=false)]
        public List<JudicialFileInfo> JudicialFiles { get; set; }

        // 案件提交失败的原因,维权状态为提交失败时存在
        [NameInMap("submit_error_msg")]
        [Validation(Required=false)]
        public string SubmitErrorMsg { get; set; }

    }

}
