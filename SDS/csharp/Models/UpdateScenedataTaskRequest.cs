// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SDS.Models
{
    public class UpdateScenedataTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 【批次号】submit接口返回的批次号
        [NameInMap("batch_no")]
        [Validation(Required=true)]
        public string BatchNo { get; set; }

        // 【异步任务上下线】INIT-初始化异步任务，异步任务开始执行，同时可以修改拓展参数，必须先下线才能初始化。INVALID-下线异步任务，停止异步任务执行。传空不修改。一次只能提一个任务状态变更。
        [NameInMap("async_task_status")]
        [Validation(Required=true)]
        public string AsyncTaskStatus { get; set; }

        // 【拓展参数】下线后，可以修改拓展参数，再次上线后生效。处理该拓展参数的任务，需要对参数做校验，避免参数改动太大，任务恢复异常。
        [NameInMap("expect_condition")]
        [Validation(Required=false)]
        public List<BizNoCondition> ExpectCondition { get; set; }

    }

}
