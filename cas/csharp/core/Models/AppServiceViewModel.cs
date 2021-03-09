// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 旧版-应用服务放入前端展示内容
    public class AppServiceViewModel : TeaModel {
        // 基类
        [NameInMap("base_app_service")]
        [Validation(Required=false)]
        public AppService BaseAppService { get; set; }

        // 应用负责人姓名
        [NameInMap("owner_name")]
        [Validation(Required=false)]
        public string OwnerName { get; set; }

        // 技术栈名称
        [NameInMap("buildpack_name")]
        [Validation(Required=false)]
        public string BuildpackName { get; set; }

        // App的别名
        [NameInMap("chinese_name")]
        [Validation(Required=false)]
        public string ChineseName { get; set; }

        // buildpackVersion
        [NameInMap("buildpack_version")]
        [Validation(Required=false)]
        public string BuildpackVersion { get; set; }

        // computerCount
        [NameInMap("computer_count")]
        [Validation(Required=false)]
        public long? ComputerCount { get; set; }

        // databaseCount
        [NameInMap("database_count")]
        [Validation(Required=false)]
        public long? DatabaseCount { get; set; }

        // loadBalancerCount
        [NameInMap("load_balancer_count")]
        [Validation(Required=false)]
        public long? LoadBalancerCount { get; set; }

        // cacheCount
        [NameInMap("cache_count")]
        [Validation(Required=false)]
        public long? CacheCount { get; set; }

        // cellViewList
        [NameInMap("cell_view_list")]
        [Validation(Required=false)]
        public List<CellView> CellViewList { get; set; }

    }

}
