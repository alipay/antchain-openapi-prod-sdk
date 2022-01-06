// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 路由规则组信息
    public class RouterRuleGroupModel : TeaModel {
        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 服务id
        [NameInMap("data_id")]
        [Validation(Required=false)]
        public string DataId { get; set; }

        // 是否生效，1 生效，0 未生效。默认未生效
        [NameInMap("enabled")]
        [Validation(Required=false)]
        public long? Enabled { get; set; }

        // 更新日期
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 编辑人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 路由规则
        [NameInMap("rules")]
        [Validation(Required=false)]
        public List<RouterRuleModel> Rules { get; set; }

        // service 表示服务
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 版本号
        [NameInMap("dispatch_version")]
        [Validation(Required=false)]
        public long? DispatchVersion { get; set; }

    }

}
