// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 签署子任务结果
    public class AntSignTaskResult : TeaModel {
        // 子任务流水号
        [NameInMap("sub_biz_no")]
        [Validation(Required=false)]
        public string SubBizNo { get; set; }

        // 签署子任务id
        [NameInMap("sign_task_id")]
        [Validation(Required=false)]
        public string SignTaskId { get; set; }

        // 签署子任务状态:
        // INIT-初始化
        // SIGNING-签署中
        // SIGNED-已签署
        // REJECTED-已拒绝
        [NameInMap("sign_task_status")]
        [Validation(Required=false)]
        public string SignTaskStatus { get; set; }

        // 上下游透传参数
        [NameInMap("extra_param")]
        [Validation(Required=false)]
        public string ExtraParam { get; set; }

        // 签署子任务完成的文件里表
        [NameInMap("ant_sign_file_result_list")]
        [Validation(Required=false)]
        public List<AntSignFileResult> AntSignFileResultList { get; set; }

        // 签署人状态列表
        [NameInMap("ant_sign_operator_result_list")]
        [Validation(Required=false)]
        public List<AntSignOperatorResult> AntSignOperatorResultList { get; set; }

    }

}
