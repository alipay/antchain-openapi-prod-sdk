// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class QueryApplicationLoadbalancerRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 目标服务实例名称，填写application时有意义。application不填时，service_name的值会被忽略
        [NameInMap("application")]
        [Validation(Required=false)]
        public string Application { get; set; }

        // 资源名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // VIP类型
        [NameInMap("network_type")]
        [Validation(Required=false)]
        public string NetworkType { get; set; }

        // 当前页码，默认为1
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public int? PageNum { get; set; }

        // 分页大小，默认10
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public int? PageSize { get; set; }

        // 目标服务实例名称
        [NameInMap("service_name")]
        [Validation(Required=false)]
        public string ServiceName { get; set; }

        // 资源所处的状态，可指定多个
        [NameInMap("statuses")]
        [Validation(Required=false)]
        public List<string> Statuses { get; set; }

        // vip地址
        [NameInMap("vip_address")]
        [Validation(Required=false)]
        public string VipAddress { get; set; }

        // address 类型：INTERNET, INTRANET
        [NameInMap("vip_address_type")]
        [Validation(Required=false)]
        public string VipAddressType { get; set; }

        // VIP类型
        [NameInMap("vip_type")]
        [Validation(Required=false)]
        public string VipType { get; set; }

        // vpc的id
        [NameInMap("vpc_ids")]
        [Validation(Required=false)]
        public List<string> VpcIds { get; set; }

        // 目标工作空间名称
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
