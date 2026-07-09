// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class CreateIotbasicProductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 产品名称
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

        // 品类类型
        // 标准品类：standard
        // 自定义品类：custom
        [NameInMap("category_type")]
        [Validation(Required=true)]
        public string CategoryType { get; set; }

        // 品类编码
        [NameInMap("category_code")]
        [Validation(Required=true)]
        public string CategoryCode { get; set; }

        // 连网方式
        // WIFI： Wi-Fi
        // CELLULAR：蜂窝网ETHERNET：以太网OTHER：其他
        [NameInMap("net_type")]
        [Validation(Required=true)]
        public string NetType { get; set; }

        // 设备种类
        // 0：直连网络设备
        // 1：网关设备
        [NameInMap("node_type")]
        [Validation(Required=true)]
        public long? NodeType { get; set; }

        // 安全SDK接入模式
        // NO_SEC：不进行安全认证
        // PRODUCTION_PRESET：产线预置
        // AIR_DISTRIBUTION：空中发行
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public string AuthType { get; set; }

        // 产品描述
        // 长度不超过100个字符
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

    }

}
