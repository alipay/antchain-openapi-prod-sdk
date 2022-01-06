// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 安全通信规则model
    public class CommunicationRuleModel : TeaModel {
        // [{"key":"aa","value":"bb","type":1}]
        [NameInMap("labels")]
        [Validation(Required=false)]
        public List<CommunicationLabelModel> Labels { get; set; }

        // 对labels取的hash值
        [NameInMap("label_code")]
        [Validation(Required=false)]
        public string LabelCode { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 	
        // 规则名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 取值(0-客户端,1-服务端)
        [NameInMap("direction")]
        [Validation(Required=false)]
        public long? Direction { get; set; }

        // 模式(0-tls,1-mtls)
        [NameInMap("mode")]
        [Validation(Required=false)]
        public long? Mode { get; set; }

        // 策略(0-普通,1-国密)
        [NameInMap("strategy")]
        [Validation(Required=false)]
        public string Strategy { get; set; }

        // 	
        // 状态(0-关闭,1-开启)
        [NameInMap("enabled")]
        [Validation(Required=false)]
        public long? Enabled { get; set; }

        // 分类(0-应用,1-标签)
        [NameInMap("scope")]
        [Validation(Required=false)]
        public long? Scope { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 操作时间
        [NameInMap("operate_time")]
        [Validation(Required=false)]
        public string OperateTime { get; set; }

    }

}
