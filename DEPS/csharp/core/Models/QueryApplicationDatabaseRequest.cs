// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class QueryApplicationDatabaseRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 目标服务实例名称，填写application时有意义。application不填时，service_name的值会被忽略
        [NameInMap("application")]
        [Validation(Required=false)]
        public string Application { get; set; }

        // 连接地址
        [NameInMap("connection_address")]
        [Validation(Required=false)]
        public string ConnectionAddress { get; set; }

        // 资源名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 网络类型，Classic或VPC
        [NameInMap("network_type")]
        [Validation(Required=false)]
        public string NetworkType { get; set; }

        // 网络连接类型，取值 Internet：外网，Intranet：内网
        [NameInMap("net_type")]
        [Validation(Required=false)]
        public string NetType { get; set; }

        // 当前页码，默认为1
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

        // 分页大小，默认10
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 连接端口
        [NameInMap("port")]
        [Validation(Required=false)]
        public long? Port { get; set; }

        // 目标服务实例名称
        [NameInMap("service_name")]
        [Validation(Required=false)]
        public string ServiceName { get; set; }

        // 资源所处的状态，可指定多个
        [NameInMap("statuses")]
        [Validation(Required=false)]
        public List<string> Statuses { get; set; }

        // 目标工作空间名称
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
