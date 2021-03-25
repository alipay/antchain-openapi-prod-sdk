// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class AssignComputerRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 应用的完整名称
        [NameInMap("application_name")]
        [Validation(Required=false)]
        public string ApplicationName { get; set; }

        // 是否启用自动运维，默认为**False**
        [NameInMap("auto_ops")]
        [Validation(Required=false)]
        public bool? AutoOps { get; set; }

        // 计算资源与cell的关系，如果不指定会根据分配的应用、服务实例以及computer的zone信息由系统决定，如果无法决定会导致失败，建议在指定了service_name参数的情形下指定该参数
        [NameInMap("computer_cells")]
        [Validation(Required=false)]
        public List<ComputerCell> ComputerCells { get; set; }

        // 计算资源id，可以指定多个
        [NameInMap("computer_ids")]
        [Validation(Required=false)]
        public List<string> ComputerIds { get; set; }

        // 是否重新初始化数据磁盘，默认为**False**
        [NameInMap("init_data_disk")]
        [Validation(Required=false)]
        public bool? InitDataDisk { get; set; }

        // 是否重新初始化系统磁盘，默认为**False**
        [NameInMap("init_sys_disk")]
        [Validation(Required=false)]
        public bool? InitSysDisk { get; set; }

        // 请求业务id，用于幂等性控制等，需要客户端提供并保证唯一。最大64位单字节字符
        [NameInMap("req_biz_id")]
        [Validation(Required=false)]
        public string ReqBizId { get; set; }

        // 目标服务实例名称
        [NameInMap("service_name")]
        [Validation(Required=false)]
        public string ServiceName { get; set; }

        // 目标工作空间名称
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
