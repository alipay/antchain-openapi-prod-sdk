// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 信物链实体身份注册请求结构体
    public class ThingsDidBaseRegisterRequest : TeaModel {
        // 信物链实体的所有者的分布式身份
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;did:mychain:6c9f6cde4f63103d25ab1d9893242547a8518d8f51bff1a9da44e4f8537a9816&quot;</para>
        /// </summary>
        [NameInMap("owner_tenant_did")]
        [Validation(Required=false)]
        public string OwnerTenantDid { get; set; }

        // 信物链实体的使用方的分布式身份列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>[&quot;did:mychain:xxxx1&quot;,&quot;did:mychain:xxxx2&quot;]</para>
        /// </summary>
        [NameInMap("user_did")]
        [Validation(Required=false)]
        public List<string> UserDid { get; set; }

        // 信物链实体身份
        // DID_TYPE_DEVICE_ALIYUN: 阿里云设备
        // DID_TYPE_DEVICE_PEGASUS: 链机设备
        // DID_TYPE_DEVICE_MCU: MCU设备
        // DID_TYPE_DEVICE_INTEL: intel设备
        // DID_TYPE_DEVICE_DEVICE: 默认设备
        // ...
        // DID_TYPE_CORPORATE:  组织实体
        // DID_TYPE_WAREHOUSE：仓库实体
        // DID_TYPE_SPACE： 空间实体
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;DID_TYPE_DEVICE_ALIYUN&quot;</para>
        /// </summary>
        [NameInMap("thing_type")]
        [Validation(Required=true)]
        public string ThingType { get; set; }

        // 原始id，租户内同一类型实体唯一
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;aaaa123&quot;</para>
        /// </summary>
        [NameInMap("thing_origin_id")]
        [Validation(Required=true)]
        public string ThingOriginId { get; set; }

        // 实体原始名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;摄像头a11&quot;</para>
        /// </summary>
        [NameInMap("thing_origin_name")]
        [Validation(Required=true)]
        public string ThingOriginName { get; set; }

        // 实体版本
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;1.0.0&quot;</para>
        /// </summary>
        [NameInMap("thing_version")]
        [Validation(Required=true)]
        public string ThingVersion { get; set; }

        // 业务编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>null</para>
        /// </summary>
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // 信物链实体附加信息
        // 不同实体身份，有不同的json组织格式，参考另外技术文档
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;附加信息&quot;</para>
        /// </summary>
        [NameInMap("thing_extra_params")]
        [Validation(Required=false)]
        public string ThingExtraParams { get; set; }

    }

}
