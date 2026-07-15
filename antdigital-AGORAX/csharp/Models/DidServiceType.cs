// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // Did服务类型描述结构体
    public class DidServiceType : TeaModel {
        // 枚举类型，描述访问服务的方式
        /// <summary>
        /// <b>Example:</b>
        /// <para>http,https,openapi,ftp,other...</para>
        /// </summary>
        [NameInMap("access_mode")]
        [Validation(Required=false)]
        public string AccessMode { get; set; }

        // 对服务的文字描述，<1000个字符
        /// <summary>
        /// <b>Example:</b>
        /// <para>对服务描述</para>
        /// </summary>
        [NameInMap("description")]
        [Validation(Required=false, MaxLength=1000)]
        public string Description { get; set; }

        // 服务类型创建者did
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:mychain:xxxx</para>
        /// </summary>
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // { "item1":"", "item2":"",...
        /// <summary>
        /// <b>Example:</b>
        /// <para>json描述服务入参</para>
        /// </summary>
        [NameInMap("service_input")]
        [Validation(Required=false)]
        public string ServiceInput { get; set; }

        // 返回值类型描述，json形式
        /// <summary>
        /// <b>Example:</b>
        /// <para>{ &quot;item1&quot;:&quot;&quot; &quot;item2&quot;:&quot;&quot; ... }</para>
        /// </summary>
        [NameInMap("service_output")]
        [Validation(Required=false)]
        public string ServiceOutput { get; set; }

        // 自定义服务类型，字符数16～32个
        /// <summary>
        /// <b>Example:</b>
        /// <para>KYBServiceType</para>
        /// </summary>
        [NameInMap("service_type")]
        [Validation(Required=true)]
        public string ServiceType { get; set; }

    }

}
