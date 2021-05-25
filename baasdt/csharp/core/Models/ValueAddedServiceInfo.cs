// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 增值服务信息
    public class ValueAddedServiceInfo : TeaModel {
        // 增值服务归属账户id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 增值服务id
        [NameInMap("service_id")]
        [Validation(Required=true)]
        public string ServiceId { get; set; }

        // 增值服务名字
        [NameInMap("service_name")]
        [Validation(Required=true)]
        public string ServiceName { get; set; }

        // 主图 链接地址
        [NameInMap("images")]
        [Validation(Required=true)]
        public string Images { get; set; }

        // 详情图
        [NameInMap("images_detail")]
        [Validation(Required=true)]
        public string ImagesDetail { get; set; }

        // 增值服务描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 联系人列表
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

        // 服务状态（0:待审核 1:审核拒绝 2:上线【审核通过】 3: 下线）
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

    }

}
