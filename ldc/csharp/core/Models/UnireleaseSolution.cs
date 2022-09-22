// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 发布解决方案
    public class UnireleaseSolution : TeaModel {
        // 发布单ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 发布单标题
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 解决方案平台源
        [NameInMap("source_system")]
        [Validation(Required=true)]
        public string SourceSystem { get; set; }

        // 发布类型，容器/经典
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 需求人/操作者
        [NameInMap("submitter")]
        [Validation(Required=true)]
        public string Submitter { get; set; }

        // 解决方案状态
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // 解决方案提出时间
        [NameInMap("create_time_stamp")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreateTimeStamp { get; set; }

        // 是否自动执行
        [NameInMap("auto_execute")]
        [Validation(Required=true)]
        public bool? AutoExecute { get; set; }

        // 环境信息
        [NameInMap("env")]
        [Validation(Required=true)]
        public string Env { get; set; }

        // 变更人员
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 解决方案拓展信息
        [NameInMap("ext_info")]
        [Validation(Required=true)]
        public UnireleaseSolutionExtInfo ExtInfo { get; set; }

        // 解决方案包含的应用配置信息
        [NameInMap("apps")]
        [Validation(Required=true)]
        public List<UnireleaseSolutionApp> Apps { get; set; }

        // 租户列表
        [NameInMap("tenants")]
        [Validation(Required=true)]
        public List<string> Tenants { get; set; }

        // 错误信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // AC ID
        [NameInMap("ac_id")]
        [Validation(Required=false)]
        public string AcId { get; set; }

        // 是否是紧急发布
        [NameInMap("emergent")]
        [Validation(Required=false)]
        public bool? Emergent { get; set; }

    }

}
