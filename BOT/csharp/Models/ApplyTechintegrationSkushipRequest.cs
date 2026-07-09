// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ApplyTechintegrationSkushipRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 产品型号
        [NameInMap("device_model")]
        [Validation(Required=true)]
        public string DeviceModel { get; set; }

        // 出货数量，上限8
        [NameInMap("quota")]
        [Validation(Required=true)]
        public long? Quota { get; set; }

        // 产品类型
        [NameInMap("product_type")]
        [Validation(Required=true)]
        public string ProductType { get; set; }

        // 安全方案
        [NameInMap("security_mechanism")]
        [Validation(Required=true)]
        public string SecurityMechanism { get; set; }

        // 证书类型
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 凭证种类
        [NameInMap("features")]
        [Validation(Required=true)]
        public List<string> Features { get; set; }

        // 证书拉取任务ID
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

        // 证书拉取任务批次
        [NameInMap("task_batch_num")]
        [Validation(Required=false)]
        public string TaskBatchNum { get; set; }

        // 重试标志
        [NameInMap("retry_flag")]
        [Validation(Required=false)]
        public bool? RetryFlag { get; set; }

    }

}
