// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAASSPI.Models
{
    public class SubmitAntchainSdsScenedataTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 【场景】约定的场景枚举
        [NameInMap("scene")]
        [Validation(Required=true, MaxLength=32)]
        public string Scene { get; set; }

        // 【业务号类型】该字段逐步废弃，枚举-PHONE_SHA1，PHONE_MD5
        [NameInMap("biz_no_type")]
        [Validation(Required=false, MaxLength=32)]
        public string BizNoType { get; set; }

        // 【来源标识】适配客户的来源，可能是客户的任务/AK
        [NameInMap("source_mark")]
        [Validation(Required=false, MaxLength=32)]
        public string SourceMark { get; set; }

        // 【动态参数】任务动态参数信息
        [NameInMap("expect_condition")]
        [Validation(Required=false)]
        public List<BizNoCondition> ExpectCondition { get; set; }

        // 【外部批次号】和任务类型组成唯一键
        [NameInMap("out_batch_no")]
        [Validation(Required=false)]
        public string OutBatchNo { get; set; }

        // 【任务类型】SDS根据类型触发异步处理流程
        [NameInMap("task_type")]
        [Validation(Required=false)]
        public string TaskType { get; set; }

    }

}
