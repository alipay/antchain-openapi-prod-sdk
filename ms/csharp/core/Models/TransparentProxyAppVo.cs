// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 透明劫持应用Vo
    public class TransparentProxyAppVo : TeaModel {
        // 透明劫持配置
        [NameInMap("app_config")]
        [Validation(Required=false)]
        public TransparentProxyAppConfig AppConfig { get; set; }

        // 应用名称
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 应用 ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 租户实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 节点数
        [NameInMap("node_num")]
        [Validation(Required=true)]
        public long? NodeNum { get; set; }

        // 打开透明劫持的节点数
        [NameInMap("open_num")]
        [Validation(Required=true)]
        public long? OpenNum { get; set; }

        // 运行透明劫持的节点数
        [NameInMap("run_num")]
        [Validation(Required=true)]
        public long? RunNum { get; set; }

        // 应用支持的协议
        [NameInMap("support_protocols")]
        [Validation(Required=false)]
        public List<TransparentProxyProtocolVo> SupportProtocols { get; set; }

    }

}
