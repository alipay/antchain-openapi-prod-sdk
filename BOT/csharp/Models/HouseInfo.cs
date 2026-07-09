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
        /// <summary>
        /// <b>Example:</b>
        /// <para>a87</para>
        /// </summary>
        [NameInMap("house_id")]
        [Validation(Required=true)]
        public string HouseId { get; set; }

        // 租赁模式
        /// <summary>
        /// <b>Example:</b>
        /// <para>合租</para>
        /// </summary>
        [NameInMap("lease_mode")]
        [Validation(Required=false)]
        public string LeaseMode { get; set; }

        // 面积平方
        /// <summary>
        /// <b>Example:</b>
        /// <para>120㎡</para>
        /// </summary>
        [NameInMap("acreage")]
        [Validation(Required=false)]
        public string Acreage { get; set; }

        // 房源类型：0住宅、1别墅、
        // 2商铺、3写字楼
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("structure")]
        [Validation(Required=true)]
        public long? Structure { get; set; }

        // 房屋地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>hz</para>
        /// </summary>
        [NameInMap("addr")]
        [Validation(Required=false)]
        public string Addr { get; set; }

        // 门锁设备DID
        /// <summary>
        /// <b>Example:</b>
        /// <para>L91923</para>
        /// </summary>
        [NameInMap("lock_id")]
        [Validation(Required=false)]
        public string LockId { get; set; }

        // 电表设备DID
        /// <summary>
        /// <b>Example:</b>
        /// <para>A87345</para>
        /// </summary>
        [NameInMap("ammeter_id")]
        [Validation(Required=false)]
        public string AmmeterId { get; set; }

    }

}
