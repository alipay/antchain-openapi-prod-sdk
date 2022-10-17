// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 房源信息同步实体类
    public class HouseInfo : TeaModel {
        // 房源唯一ID
        [NameInMap("house_id")]
        [Validation(Required=true)]
        public string HouseId { get; set; }

        // 租赁模式
        [NameInMap("lease_mode")]
        [Validation(Required=false)]
        public string LeaseMode { get; set; }

        // 面积平方
        [NameInMap("acreage")]
        [Validation(Required=false)]
        public string Acreage { get; set; }

        // 房源类型：0住宅、1别墅、
        // 2商铺、3写字楼
        [NameInMap("structure")]
        [Validation(Required=true)]
        public long? Structure { get; set; }

        // 房屋地址
        [NameInMap("addr")]
        [Validation(Required=false)]
        public string Addr { get; set; }

        // 门锁设备DID
        [NameInMap("lock_id")]
        [Validation(Required=true)]
        public string LockId { get; set; }

        // 电表设备DID
        [NameInMap("ammeter_id")]
        [Validation(Required=true)]
        public string AmmeterId { get; set; }

    }

}
