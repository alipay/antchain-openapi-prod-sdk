// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateContractOrgsealRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 印章别名
        [NameInMap("alias")]
        [Validation(Required=false)]
        public string Alias { get; set; }

        // 中心图案类型，STAR-圆形有五角星，NONE-圆形无五角星， 详见机构印章样式说明
        [NameInMap("central")]
        [Validation(Required=true)]
        public string Central { get; set; }

        // 印章颜色，RED-红色，BLUE-蓝色，BLACK-黑色
        [NameInMap("color")]
        [Validation(Required=true)]
        public string Color { get; set; }

        // 印章高度，默认159px
        [NameInMap("height")]
        [Validation(Required=false)]
        public long? Height { get; set; }

        // 横向文，可设置0-8个字，企业名称超出25个字后，不支持设置横向文
        [NameInMap("htext")]
        [Validation(Required=false)]
        public string Htext { get; set; }

        // 机构ID
        [NameInMap("org_id")]
        [Validation(Required=true)]
        public string OrgId { get; set; }

        // 下弦文，可设置0-20个字，企业企业名称超出25个字后，不支持设置下弦文	
        [NameInMap("qtext")]
        [Validation(Required=false)]
        public string Qtext { get; set; }

        // 模板类型，TEMPLATE_ROUND-圆章，TEMPLATE_OVAL-椭圆章， 详见机构印章样式说明	
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 印章宽度，默认159px
        [NameInMap("width")]
        [Validation(Required=false)]
        public long? Width { get; set; }

    }

}
