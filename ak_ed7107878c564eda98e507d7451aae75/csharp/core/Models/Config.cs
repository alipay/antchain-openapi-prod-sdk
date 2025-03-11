// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ed7107878c564eda98e507d7451aae75.Models
{
    /**
     * Model for initing client
     */
    public class Config : TeaModel {
        /// <summary>
        /// accesskey id
        /// </summary>
        [NameInMap("accessKeyId")]
        [Validation(Required=false)]
        public string AccessKeyId { get; set; }

        /// <summary>
        /// accesskey secret
        /// </summary>
        [NameInMap("accessKeySecret")]
        [Validation(Required=false)]
        public string AccessKeySecret { get; set; }

        /// <summary>
        /// security token
        /// </summary>
        [NameInMap("securityToken")]
        [Validation(Required=false)]
        public string SecurityToken { get; set; }

        /// <summary>
        /// http protocol
        /// </summary>
        [NameInMap("protocol")]
        [Validation(Required=false)]
        public string Protocol { get; set; }

        /// <summary>
        /// read timeout
        /// </summary>
        [NameInMap("readTimeout")]
        [Validation(Required=false)]
        public int? ReadTimeout { get; set; }

        /// <summary>
        /// connect timeout
        /// </summary>
        [NameInMap("connectTimeout")]
        [Validation(Required=false)]
        public int? ConnectTimeout { get; set; }

        /// <summary>
        /// http proxy
        /// </summary>
        [NameInMap("httpProxy")]
        [Validation(Required=false)]
        public string HttpProxy { get; set; }

        /// <summary>
        /// https proxy
        /// </summary>
        [NameInMap("httpsProxy")]
        [Validation(Required=false)]
        public string HttpsProxy { get; set; }

        /// <summary>
        /// endpoint
        /// </summary>
        [NameInMap("endpoint")]
        [Validation(Required=false)]
        public string Endpoint { get; set; }

        /// <summary>
        /// proxy white list
        /// </summary>
        [NameInMap("noProxy")]
        [Validation(Required=false)]
        public string NoProxy { get; set; }

        /// <summary>
        /// max idle conns
        /// </summary>
        [NameInMap("maxIdleConns")]
        [Validation(Required=false)]
        public int? MaxIdleConns { get; set; }

        /// <summary>
        /// user agent
        /// </summary>
        [NameInMap("userAgent")]
        [Validation(Required=false)]
        public string UserAgent { get; set; }

        /// <summary>
        /// socks5 proxy
        /// </summary>
        [NameInMap("socks5Proxy")]
        [Validation(Required=false)]
        public string Socks5Proxy { get; set; }

        /// <summary>
        /// socks5 network
        /// </summary>
        [NameInMap("socks5NetWork")]
        [Validation(Required=false)]
        public string Socks5NetWork { get; set; }

        /// <summary>
        /// 长链接最大空闲时长
        /// </summary>
        [NameInMap("maxIdleTimeMillis")]
        [Validation(Required=false)]
        public int? MaxIdleTimeMillis { get; set; }

        /// <summary>
        /// 长链接最大连接时长
        /// </summary>
        [NameInMap("keepAliveDurationMillis")]
        [Validation(Required=false)]
        public int? KeepAliveDurationMillis { get; set; }

        /// <summary>
        /// 最大连接数（长链接最大总数）
        /// </summary>
        [NameInMap("maxRequests")]
        [Validation(Required=false)]
        public int? MaxRequests { get; set; }

        /// <summary>
        /// 每个目标主机的最大连接数（分主机域名的长链接最大总数
        /// </summary>
        [NameInMap("maxRequestsPerHost")]
        [Validation(Required=false)]
        public int? MaxRequestsPerHost { get; set; }

    }

}
