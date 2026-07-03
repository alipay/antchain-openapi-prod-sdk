// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 仓库实体身份附加参数请求结构体，应用在注册/更新API的ThingExtraParams
    public class WarehouseReqModel : TeaModel {
        // 详细地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>北京海淀区</para>
        /// </summary>
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 面积 平方米单位*1e4
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000000</para>
        /// </summary>
        [NameInMap("area")]
        [Validation(Required=false)]
        public long? Area { get; set; }

        // 海拔 米单位*1e2
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("elevation")]
        [Validation(Required=false)]
        public long? Elevation { get; set; }

        // 仓库高度 米单位*1e2
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000</para>
        /// </summary>
        [NameInMap("height")]
        [Validation(Required=false)]
        public long? Height { get; set; }

        // 纬度 度数单位*1e9
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("latitude")]
        [Validation(Required=false)]
        public long? Latitude { get; set; }

        // 经度 度数单位*1e9
        /// <summary>
        /// <b>Example:</b>
        /// <para>35000000000</para>
        /// </summary>
        [NameInMap("longitude")]
        [Validation(Required=false)]
        public long? Longitude { get; set; }

        // 所在国家，中国
        /// <summary>
        /// <b>Example:</b>
        /// <para>中国</para>
        /// </summary>
        [NameInMap("nation")]
        [Validation(Required=false)]
        public string Nation { get; set; }

        // 其他信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;自定义&quot;</para>
        /// </summary>
        [NameInMap("other_info")]
        [Validation(Required=false)]
        public string OtherInfo { get; set; }

        // 仓库状态, AVAILABLE, IN_USE, DELETED, 自定义
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;AVAILABLE&quot;</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 仓库类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;自定义&quot;</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
