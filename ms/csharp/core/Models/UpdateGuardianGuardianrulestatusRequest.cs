// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class UpdateGuardianGuardianrulestatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // app name
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 是否可用
        [NameInMap("enable")]
        [Validation(Required=true)]
        public bool? Enable { get; set; }

        // 创建
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 更新
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 监控规则id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 描述字段
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 编辑人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 资源类型
        [NameInMap("resource_type")]
        [Validation(Required=false)]
        public string ResourceType { get; set; }

        // 规则配置
        [NameInMap("rule_config")]
        [Validation(Required=false)]
        public string RuleConfig { get; set; }

        // 运行模式
        [NameInMap("run_mode")]
        [Validation(Required=false)]
        public string RunMode { get; set; }

    }

}
