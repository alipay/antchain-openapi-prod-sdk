// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models
{
    // 签署任务结果
    public class CaSignTaskResult : TeaModel {
        // 子任务流水号
        [NameInMap("sub_biz_no")]
        [Validation(Required=true)]
        public string SubBizNo { get; set; }

        // 签署子任务id
        [NameInMap("sign_task_id")]
        [Validation(Required=true)]
        public string SignTaskId { get; set; }

        // 签署子任务的状态
        [NameInMap("sign_task_status")]
        [Validation(Required=false)]
        public string SignTaskStatus { get; set; }

        // 签署完成的文件列表
        [NameInMap("sign_file_result_list")]
        [Validation(Required=false)]
        public List<CaSignFileResult> SignFileResultList { get; set; }

        // 签署人状态列表
        [NameInMap("sign_operator_result_list")]
        [Validation(Required=false)]
        public List<CaSignOperatorResult> SignOperatorResultList { get; set; }

    }

}
