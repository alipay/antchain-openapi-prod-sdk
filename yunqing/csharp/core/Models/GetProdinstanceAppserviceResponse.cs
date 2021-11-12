// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class GetProdinstanceAppserviceResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 应用名。
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 应用版本。
        [NameInMap("app_version")]
        [Validation(Required=false)]
        public string AppVersion { get; set; }

        // 单元ID
        [NameInMap("cell_id")]
        [Validation(Required=false)]
        public string CellId { get; set; }

        // 容器列表。
        [NameInMap("containers")]
        [Validation(Required=false)]
        public List<Container> Containers { get; set; }

        // 部署单元。
        [NameInMap("deploy_unit")]
        [Validation(Required=false)]
        public string DeployUnit { get; set; }

        // 部署域。
        [NameInMap("deploy_zone")]
        [Validation(Required=false)]
        public string DeployZone { get; set; }

        // 环境唯一标识。
        [NameInMap("env_id")]
        [Validation(Required=false)]
        public string EnvId { get; set; }

        // 负载均衡列表。
        [NameInMap("load_balancers")]
        [Validation(Required=false)]
        public List<LoadBalancer> LoadBalancers { get; set; }

        // 产品码。
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

        // 数据库列表。
        [NameInMap("schemas")]
        [Validation(Required=false)]
        public List<Schema> Schemas { get; set; }

        // app service id，该openapi 的入参
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

    }

}
