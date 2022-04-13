// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class CreateAppopsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 执行运维操作的目标应用列表,可通过services指定应用下待运维的应用服务实例. 如果要指定多个应用, 使用如下形式: applications.1.name=app1&applications.2.name=app2&applications.2.services.1.name=app2-sv1&applications.2.services.1.workspace=shdev
        [NameInMap("applications")]
        [Validation(Required=false)]
        public List<Application> Applications { get; set; }

        // 是否自动执行运维单, 默认为false.当设置为true是,创建完成并初始化成功后会自动执行该运维单.
        [NameInMap("auto_execution")]
        [Validation(Required=false)]
        public bool? AutoExecution { get; set; }

        // 执行运维操作的目标机器id列表。如果要输入多个机器，使用如下形式：computers.1.id=000112367&computers.2.id=000112367
        [NameInMap("computers")]
        [Validation(Required=false)]
        public List<string> Computers { get; set; }

        // 应用运维的操作类型，取值列表：ONLINE：上线应用，OFFLINE：下线应用，RESTART:重启应用，DEPLOY_STATIC_RESOURCE：部署静态资源
        [NameInMap("ops_action")]
        [Validation(Required=true)]
        public string OpsAction { get; set; }

        // 执行ops_action所需要的参数。
        [NameInMap("ops_action_params")]
        [Validation(Required=false)]
        public List<OpsParam> OpsActionParams { get; set; }

        // 应用运维的维度，有两种取值：APPLICATION和MACHINE。设置为APPLICATION，表示在非应用服务环境下该应用执行该应用运维操作；设置为MACHINE，表示应用下的一台或多台机器执行该应用运维操作。
        [NameInMap("ops_demension")]
        [Validation(Required=true)]
        public string OpsDemension { get; set; }

        // 应用运维单标题
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 工作空间组名称
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // Map<String, String> 序列化后字符串
        [NameInMap("context")]
        [Validation(Required=false)]
        public string Context { get; set; }

        // 机器分组策略，默认采用快速分组
        // QUICK         -     快速分组
        // ALL_ONE    - 共分一组
        // EACH_ONE - 每台一组
        // 
        [NameInMap("group_strategy")]
        [Validation(Required=false)]
        public string GroupStrategy { get; set; }

    }

}
