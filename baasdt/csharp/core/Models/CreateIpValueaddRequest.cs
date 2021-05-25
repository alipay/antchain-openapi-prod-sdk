// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class CreateIpValueaddRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础字段
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // 创建增值服务的账户id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 服务名字
        [NameInMap("service_name")]
        [Validation(Required=true)]
        public string ServiceName { get; set; }

        // 商品主图，存放OSS图片链接,多张用;隔开
        [NameInMap("images")]
        [Validation(Required=true)]
        public string Images { get; set; }

        // 商品详情图  存放OSS图片链接,多张用;隔开
        [NameInMap("images_detail")]
        [Validation(Required=true)]
        public string ImagesDetail { get; set; }

        // 商品描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 联系人
        [NameInMap("docking_people")]
        [Validation(Required=true)]
        public List<DockingPeopleInfo> DockingPeople { get; set; }

        // 资质证明
        [NameInMap("copy_right")]
        [Validation(Required=false)]
        public string CopyRight { get; set; }

        // 备注
        [NameInMap("memo")]
        [Validation(Required=false)]
        public string Memo { get; set; }

    }

}
