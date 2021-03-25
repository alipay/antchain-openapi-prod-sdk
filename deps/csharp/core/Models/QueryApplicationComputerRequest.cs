// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class QueryApplicationComputerRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 目标服务实例名称，填写application时有意义。application不填时，service_name的值会被忽略
        [NameInMap("application")]
        [Validation(Required=false)]
        public string Application { get; set; }

        // assign=true代表分配了app/appservice的computer,反之代表没有分配app/appservice的computer
        [NameInMap("assign")]
        [Validation(Required=false)]
        public bool? Assign { get; set; }

        // 资源类型
        [NameInMap("computer_type")]
        [Validation(Required=false)]
        public string ComputerType { get; set; }

        // cpu核数
        [NameInMap("cpu")]
        [Validation(Required=false)]
        public long? Cpu { get; set; }

        // 内存大小，单位MB
        [NameInMap("memory")]
        [Validation(Required=false)]
        public long? Memory { get; set; }

        // 资源名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 当前页码，默认为1
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

        // 分页大小，默认10
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

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
