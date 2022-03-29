// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 资源基本信息
    public class XResource : TeaModel {
        // 全球唯一标识符（32位）。
        // Update操作，必填
        // Create操作，非必填，默认不传，后端会自动生成。特殊情况可以传入，比如一些领域需要固定该UUID。
        [NameInMap("uuid")]
        [Validation(Required=false, MaxLength=32)]
        public string Uuid { get; set; }

        // 名称。命名规则：^[a-zA-Z\u4E00-\u9FA5][a-zA-Z0-9_-\u4E00-\u9FA5]*$$
        [NameInMap("name")]
        [Validation(Required=true, MaxLength=64)]
        public string Name { get; set; }

        // 描述。
        // 
        [NameInMap("description")]
        [Validation(Required=true, MaxLength=512)]
        public string Description { get; set; }

        // 父目录UUID。全球唯一标识符（32位）。
        // 00000000000000000000000000000000特指根目录UUID
        [NameInMap("parent_uuid")]
        [Validation(Required=true, MaxLength=32)]
        public string ParentUuid { get; set; }

        // 作用范围
        [NameInMap("scope")]
        [Validation(Required=true)]
        public string Scope { get; set; }

        // 是否生效。默认true
        [NameInMap("enabled")]
        [Validation(Required=false)]
        public bool? Enabled { get; set; }

        // 是否开放。默认为false
        [NameInMap("open")]
        [Validation(Required=false)]
        public bool? Open { get; set; }

        // 资源版本
        [NameInMap("version")]
        [Validation(Required=false)]
        public long? Version { get; set; }

        // inner tenant id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public long? TenantId { get; set; }

        // inner workspace id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public long? WorkspaceId { get; set; }

        // 创建者
        [NameInMap("created_by")]
        [Validation(Required=false)]
        public string CreatedBy { get; set; }

        // unix time 秒
        [NameInMap("created_at")]
        [Validation(Required=false)]
        public long? CreatedAt { get; set; }

        // 更新者
        [NameInMap("updated_by")]
        [Validation(Required=false)]
        public string UpdatedBy { get; set; }

        // 更新时间
        [NameInMap("updated_at")]
        [Validation(Required=false)]
        public long? UpdatedAt { get; set; }

        // 资源类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        //  
        [NameInMap("md5")]
        [Validation(Required=false)]
        public string Md5 { get; set; }

        //  
        [NameInMap("priority")]
        [Validation(Required=false)]
        public string Priority { get; set; }

        //  
        [NameInMap("time_to_live")]
        [Validation(Required=false)]
        public string TimeToLive { get; set; }

    }

}
