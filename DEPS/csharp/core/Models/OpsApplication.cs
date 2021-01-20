// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 运维操作中的应用（服务）
    public class OpsApplication : TeaModel {
        // 应用（服务）名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 应用（服务）当前运维状态。取值列表：
        //                     INITING：初始化中；
        //                     INIT_FAILED：初始化失败；
        //                     INITED：初始化完成；
        //                     EXECUTING：执行中；
        //                     SUCCESS：执行成功；
        //                     FAILED：执行失败；
        //                     ROLLBACKED：已回滚；
        //                     CANCELED：已取消
        //                 
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // APPLICATION和APP_SERVICE。设置为APPLICATION表示该实例描述对象为应用; APP_SERVICE表示该实例描述对象为应用服务。
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
