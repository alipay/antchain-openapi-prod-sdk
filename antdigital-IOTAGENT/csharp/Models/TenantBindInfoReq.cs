// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 租户关联信息请求结构体
    public class TenantBindInfoReq : TeaModel {
        // 租户关联扩展信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;CN,北京&quot;</para>
        /// </summary>
        [NameInMap("extension")]
        [Validation(Required=false)]
        public string Extension { get; set; }

        // 业务类型，默认空
        /// <summary>
        /// <b>Example:</b>
        /// <para>null</para>
        /// </summary>
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // 组织机构代码，可为中文
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;12345&quot;</para>
        /// </summary>
        [NameInMap("tenant_uid")]
        [Validation(Required=true)]
        public string TenantUid { get; set; }

        // 组织结构名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;xx公司xx部门&quot;</para>
        /// </summary>
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

    }

}
