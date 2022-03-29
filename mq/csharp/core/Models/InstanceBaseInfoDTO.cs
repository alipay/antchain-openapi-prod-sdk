// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 实例信息对象
    public class InstanceBaseInfoDTO : TeaModel {
        // 各个协议的接入点
        [NameInMap("endpoints")]
        [Validation(Required=true)]
        public EndpointsDTO Endpoints { get; set; }

        // 实例是否有命名空间。取值说明如下：
        // 
        // true：拥有独立命名空间，资源命名确保实例内唯一，跨实例之间可重名
        // false：无独立命名空间，实例内或者跨实例之间，资源命名必须全局唯一
        [NameInMap("independent_naming")]
        [Validation(Required=true)]
        public bool? IndependentNaming { get; set; }

        //  实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 实例名称
        [NameInMap("instance_name")]
        [Validation(Required=true)]
        public string InstanceName { get; set; }

        // 实例状态。取值说明如下：
        // 
        // 0：铂金版实例部署中
        // 2：后付费实例已欠费
        // 5：后付费实例或铂金版实例服务中
        // 7：铂金版实例升级中且服务可用
        [NameInMap("instance_status")]
        [Validation(Required=true)]
        public long? InstanceStatus { get; set; }

        // 实例类型。取值说明如下：
        // 
        // 1：后付费实例
        // 2：铂金版实例
        [NameInMap("instance_type")]
        [Validation(Required=false)]
        public long? InstanceType { get; set; }

        // 铂金版实例过期时间
        // 
        // 
        [NameInMap("release_time")]
        [Validation(Required=false)]
        public long? ReleaseTime { get; set; }

        // 备注
        [NameInMap("remark")]
        [Validation(Required=true)]
        public string Remark { get; set; }

    }

}
