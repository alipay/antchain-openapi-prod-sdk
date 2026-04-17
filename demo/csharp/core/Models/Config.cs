// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    /// <term><b>Description:</b></term>
    /// <description>
    /// <para>Model for initing client</para>
    /// </description>
    public class Config : TeaModel {
        /// <summary>
        /// <para>accesskey id</para>
        /// </summary>
        [NameInMap("accessKeyId")]
        [Validation(Required=false)]
        public string AccessKeyId { get; set; }

        /// <summary>
        /// <para>accesskey secret</para>
        /// </summary>
        [NameInMap("accessKeySecret")]
        [Validation(Required=false)]
        public string AccessKeySecret { get; set; }

        /// <summary>
        /// <para>security token</para>
        /// </summary>
        [NameInMap("securityToken")]
        [Validation(Required=false)]
        public string SecurityToken { get; set; }

        /// <summary>
        /// <para>http protocol</para>
        /// 
        /// <b>Example:</b>
        /// <para>http</para>
        /// </summary>
        [NameInMap("protocol")]
        [Validation(Required=false)]
        public string Protocol { get; set; }

        /// <summary>
        /// <para>read timeout</para>
        /// 
        /// <b>Example:</b>
        /// <para>10</para>
        /// </summary>
        [NameInMap("readTimeout")]
        [Validation(Required=false)]
        public int? ReadTimeout { get; set; }

        /// <summary>
        /// <para>connect timeout</para>
        /// 
        /// <b>Example:</b>
        /// <para>10</para>
        /// </summary>
        [NameInMap("connectTimeout")]
        [Validation(Required=false)]
        public int? ConnectTimeout { get; set; }

        /// <summary>
        /// <para>http proxy</para>
        /// 
        /// <b>Example:</b>
        /// <para><a href="http://localhost">http://localhost</a></para>
        /// </summary>
        [NameInMap("httpProxy")]
        [Validation(Required=false)]
        public string HttpProxy { get; set; }

        /// <summary>
        /// <para>https proxy</para>
        /// 
        /// <b>Example:</b>
        /// <para><a href="https://localhost">https://localhost</a></para>
        /// </summary>
        [NameInMap("httpsProxy")]
        [Validation(Required=false)]
        public string HttpsProxy { get; set; }

        /// <summary>
        /// <para>endpoint</para>
        /// 
        /// <b>Example:</b>
        /// <para>cs.aliyuncs.com</para>
        /// </summary>
        [NameInMap("endpoint")]
        [Validation(Required=false)]
        public string Endpoint { get; set; }

        /// <summary>
        /// <para>proxy white list</para>
        /// 
        /// <b>Example:</b>
        /// <para><a href="http://localhost">http://localhost</a></para>
        /// </summary>
        [NameInMap("noProxy")]
        [Validation(Required=false)]
        public string NoProxy { get; set; }

        /// <summary>
        /// <para>max idle conns</para>
        /// 
        /// <b>Example:</b>
        /// <para>3</para>
        /// </summary>
        [NameInMap("maxIdleConns")]
        [Validation(Required=false)]
        public int? MaxIdleConns { get; set; }

        /// <summary>
        /// <para>user agent</para>
        /// 
        /// <b>Example:</b>
        /// <para>Alibabacloud/1</para>
        /// </summary>
        [NameInMap("userAgent")]
        [Validation(Required=false)]
        public string UserAgent { get; set; }

        /// <summary>
        /// <para>socks5 proxy</para>
        /// </summary>
        [NameInMap("socks5Proxy")]
        [Validation(Required=false)]
        public string Socks5Proxy { get; set; }

        /// <summary>
        /// <para>socks5 network</para>
        /// 
        /// <b>Example:</b>
        /// <para>TCP</para>
        /// </summary>
        [NameInMap("socks5NetWork")]
        [Validation(Required=false)]
        public string Socks5NetWork { get; set; }

        /// <summary>
        /// <para>长链接最大空闲时长</para>
        /// </summary>
        [NameInMap("maxIdleTimeMillis")]
        [Validation(Required=false)]
        public int? MaxIdleTimeMillis { get; set; }

        /// <summary>
        /// <para>长链接最大连接时长</para>
        /// </summary>
        [NameInMap("keepAliveDurationMillis")]
        [Validation(Required=false)]
        public int? KeepAliveDurationMillis { get; set; }

        /// <summary>
        /// <para>最大连接数（长链接最大总数）</para>
        /// </summary>
        [NameInMap("maxRequests")]
        [Validation(Required=false)]
        public int? MaxRequests { get; set; }

        /// <summary>
        /// <para>每个目标主机的最大连接数（分主机域名的长链接最大总数</para>
        /// </summary>
        [NameInMap("maxRequestsPerHost")]
        [Validation(Required=false)]
        public int? MaxRequestsPerHost { get; set; }

    }

}
