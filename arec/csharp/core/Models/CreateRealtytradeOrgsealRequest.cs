// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    public class CreateRealtytradeOrgsealRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 企业账户注册时返回的机构ID
        [NameInMap("org_id")]
        [Validation(Required=true)]
        public string OrgId { get; set; }

        // 印章样式说明，Round-圆章，Oval-椭圆章，默认Round
        [NameInMap("template_type")]
        [Validation(Required=false)]
        public string TemplateType { get; set; }

        // 印章颜色，ed-红色，Blue-蓝色，Black-黑色，默认Red
        [NameInMap("seal_color")]
        [Validation(Required=false)]
        public string SealColor { get; set; }

        // 中心图案类型，Star-圆形有五角星，None-圆形无五角星，默认None
        [NameInMap("center_pattern")]
        [Validation(Required=false)]
        public string CenterPattern { get; set; }

        // 企业用章说明，可设置0-8个字，企业名称超出25个字后，不支持设置横向文
        [NameInMap("horizontal_title")]
        [Validation(Required=false)]
        public string HorizontalTitle { get; set; }

        // 企业用章日期范围等，可设置0-20个字，企业企业名称超出25个字后，不支持设置下弦文
        [NameInMap("last_title")]
        [Validation(Required=false)]
        public string LastTitle { get; set; }

    }

}
