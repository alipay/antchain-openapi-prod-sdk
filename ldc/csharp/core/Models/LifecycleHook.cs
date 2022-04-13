// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 容器生命周期hook。
    public class LifecycleHook : TeaModel {
        // 启动后执行命令。
        [NameInMap("post_start_exec")]
        [Validation(Required=false)]
        public ExecAction PostStartExec { get; set; }

        // 启动后执行http get。
        [NameInMap("post_start_http")]
        [Validation(Required=false)]
        public HttpGetAction PostStartHttp { get; set; }

        // 启动后执行TCP请求。
        [NameInMap("post_start_tcp")]
        [Validation(Required=false)]
        public TcpSocketAction PostStartTcp { get; set; }

        // 停止前执行命令。
        [NameInMap("pre_stop_exec")]
        [Validation(Required=false)]
        public ExecAction PreStopExec { get; set; }

        // 停止前http get。
        [NameInMap("pre_stop_http")]
        [Validation(Required=false)]
        public HttpGetAction PreStopHttp { get; set; }

        // 停止前TCP请求。
        [NameInMap("pre_stop_tcp")]
        [Validation(Required=false)]
        public TcpSocketAction PreStopTcp { get; set; }

    }

}
