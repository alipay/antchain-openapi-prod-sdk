// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // LoadBalancer监听。
    public class LoadBalancerListener : TeaModel {
        // 负载均衡实例后端使用的端口。
        // 取值：1-65535。
        [NameInMap("backend_server_port")]
        [Validation(Required=true)]
        public long? BackendServerPort { get; set; }

        // 监听的带宽峰值，取值：
        // -1：不限制带宽峰值。
        // 1~5120：监听的带宽峰值，所有监听的带宽峰值之和不能超过实例的带宽峰值。
        [NameInMap("band_width")]
        [Validation(Required=false)]
        public long? BandWidth { get; set; }

        // CA证书ID。
        // 若既上传CA证书又上传服务器证书，即采用双向认证。
        // 若用户只上传服务器证书，即为单向认证。
        [NameInMap("ca_certificate_id")]
        [Validation(Required=false)]
        public string CaCertificateId { get; set; }

        // 服务器上配置的Cookie。
        // 长度为1~200个字符，只能包含ASCII英文字母和数字字符，不能包含逗号、分号或空格，也不能以开头。
        [NameInMap("cookie")]
        [Validation(Required=false)]
        public string Cookie { get; set; }

        // Cookie超时时间
        [NameInMap("cookie_timeout")]
        [Validation(Required=false)]
        public long? CookieTimeout { get; set; }

        // 连接超时时间（秒）
        [NameInMap("established_timeout")]
        [Validation(Required=false)]
        public long? EstablishedTimeout { get; set; }

        // 健康检查连续成功多少次后，将后端服务器的健康检查状态由fail判定为success。
        // 取值: 2-10。
        [NameInMap("healthy_threshold")]
        [Validation(Required=false)]
        public long? HealthyThreshold { get; set; }

        // 是否开启健康检查。
        // 取值：ON | OFF。
        [NameInMap("health_check")]
        [Validation(Required=false)]
        public string HealthCheck { get; set; }

        // 健康检查端口。
        [NameInMap("health_check_connect_port")]
        [Validation(Required=false)]
        public long? HealthCheckConnectPort { get; set; }

        // 健康检查链接超时时间。
        [NameInMap("health_check_connect_timeout")]
        [Validation(Required=false)]
        public long? HealthCheckConnectTimeout { get; set; }

        // 用于健康检查的域名。取值：
        // ip： 后端服务器的私网IP。当指定了IP或该参数未指定时，负载均衡会使用各后端服务器的私网IP当做健康检查使用的域名。
        // domain：域名长度为1-80，只能包含字母、数字、点号（.）和连字符（-）。
        [NameInMap("health_check_domain")]
        [Validation(Required=false)]
        public string HealthCheckDomain { get; set; }

        // 健康检查正常的HTTP状态码，多个状态码用逗号分隔。
        // 默认值为http_2xx。
        [NameInMap("health_check_http_code")]
        [Validation(Required=false)]
        public string HealthCheckHttpCode { get; set; }

        // 健康检查的时间间隔。
        // 取值:1-50（秒）。
        [NameInMap("health_check_interval")]
        [Validation(Required=false)]
        public long? HealthCheckInterval { get; set; }

        // 健康检查threshold。
        [NameInMap("health_check_threshold")]
        [Validation(Required=false)]
        public long? HealthCheckThreshold { get; set; }

        // 接收来自运行状况检查的响应需要等待的时间。如果后端ECS在指定的时间内没有正确响应，则判定为健康检查失败。
        // 取值：1-300（秒）。
        [NameInMap("health_check_timeout")]
        [Validation(Required=false)]
        public long? HealthCheckTimeout { get; set; }

        // 用于健康检查的URI。
        // 当TCP监听需要使用HTTP健康检查时可配置此参数，如不配置则按TCP健康检查。
        [NameInMap("health_check_uri")]
        [Validation(Required=false)]
        public string HealthCheckUri { get; set; }

        // 负载均衡实例前端使用的端口。
        // 取值：1-65535。
        [NameInMap("listener_port")]
        [Validation(Required=false)]
        public long? ListenerPort { get; set; }

        // TCP 会话保持的超时时间（秒）
        [NameInMap("persistence_timeout")]
        [Validation(Required=false)]
        public long? PersistenceTimeout { get; set; }

        // 监听使用协议。
        [NameInMap("protocol")]
        [Validation(Required=false)]
        public string Protocol { get; set; }

        // 负载均衡策略（RR 轮询 | WLC 最小连接数）
        [NameInMap("scheduler")]
        [Validation(Required=false)]
        public string Scheduler { get; set; }

        // 0不开会话保持 / 1植入Cookie / 2重写Cookie。
        // 开启会话保持功能后，负载均衡会把来自同一客户端的访问请求分发到同一台后端服务器上进行处理。
        // HTTP协议会话保持基于Cookie。负载均衡提供了两种Cookie处理方式：
        // 植入Cookie：您只需要指定Cookie的过期时间。
        // 客户端第一次访问时，负载均衡会在返回请求中植入Cookie（即在HTTP/HTTPS响应报文中插入SERVERID），下次客户端携带此Cookie访问，负载均衡服务会将请求定向转发给之前记录到的后端服务器上。
        // 重写Cookie：可以根据需要指定HTTPS/HTTP响应中插入的Cookie。您需要在后端服务器上维护该Cookie的过期时间和生存时间。
        // 负载均衡服务发现用户自定义了Cookie，将会对原来的Cookie进行重写，下次客户端携带新的Cookie访问，负载均衡服务会将请求定向转发给之前记录到的后端服务器
        [NameInMap("session_sticky_type")]
        [Validation(Required=true)]
        public long? SessionStickyType { get; set; }

        // 健康检查连续失败多少次后，将后端服务器的健康检查状态由success判定为fail。
        // 取值：2-10。
        [NameInMap("unhealthy_threshold")]
        [Validation(Required=false)]
        public long? UnhealthyThreshold { get; set; }

        // 是否开启通过 X-Forwarded-For 的方式获取来访者真实 IP
        [NameInMap("xforward_for")]
        [Validation(Required=false)]
        public bool? XforwardFor { get; set; }

        // 统一接入域名
        [NameInMap("domain")]
        [Validation(Required=false)]
        public string Domain { get; set; }

        // 统一接入转发路径
        [NameInMap("path")]
        [Validation(Required=false)]
        public string Path { get; set; }

    }

}
