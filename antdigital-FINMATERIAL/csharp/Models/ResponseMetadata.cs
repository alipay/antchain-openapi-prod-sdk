// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FINMATERIAL.Models
{
    // 统一响应元信息
    public class ResponseMetadata : TeaModel {
        // 请求关联标识；优先回显合法 X-Request-Id，缺失或非法时由服务端生成；不用于幂等或去重
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 接口版本
        /// <summary>
        /// <b>Example:</b>
        /// <para>v1</para>
        /// </summary>
        [NameInMap("version")]
        [Validation(Required=true)]
        public string Version { get; set; }

        // 服务区域
        /// <summary>
        /// <b>Example:</b>
        /// <para>cn-xx</para>
        /// </summary>
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        // 请求处理耗时，单位为毫秒
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000</para>
        /// </summary>
        [NameInMap("time_cost")]
        [Validation(Required=true)]
        public long? TimeCost { get; set; }

    }

}
