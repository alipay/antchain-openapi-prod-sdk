// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COLLABINV.Models
{
    public class QueryModelSampletaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户编码
        [NameInMap("tenant_code")]
        [Validation(Required=true)]
        public string TenantCode { get; set; }

        // 事件查询序号编码，在有loop_code接口返回值的异步接口的值
        // 如：antchain.zkcollabinv.model.samplefile.push、antchain.zkcollabinv.model.sampletask.exec
        [NameInMap("loop_code")]
        [Validation(Required=true)]
        public string LoopCode { get; set; }

        // 阶段：poc_050 样本提交阶段，poc_500 任务跑批阶段
        [NameInMap("phase")]
        [Validation(Required=true)]
        public string Phase { get; set; }

    }

}
