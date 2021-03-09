// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // lb 监听器
    public class Listener : TeaModel {
        // 后端服务器端口
        [NameInMap("backend_server_port")]
        [Validation(Required=true)]
        public long? BackendServerPort { get; set; }

        // 带宽
        [NameInMap("bandwidth")]
        [Validation(Required=false)]
        public long? Bandwidth { get; set; }

        // certificate_iaas_id
        [NameInMap("certificate_iaas_id")]
        [Validation(Required=false)]
        public string CertificateIaasId { get; set; }

        // 证书 id
        [NameInMap("certificate_id")]
        [Validation(Required=false)]
        public string CertificateId { get; set; }

        // cookie
        [NameInMap("cookie")]
        [Validation(Required=false)]
        public string Cookie { get; set; }

        // cookie 超时时间
        [NameInMap("cookie_timeout")]
        [Validation(Required=false)]
        public long? CookieTimeout { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 连接超时时间
        [NameInMap("established_timeout")]
        [Validation(Required=false)]
        public long? EstablishedTimeout { get; set; }

        // gm_crypto_cert_iaas_id
        [NameInMap("gm_crypto_cert_iaas_id")]
        [Validation(Required=false)]
        public string GmCryptoCertIaasId { get; set; }

        // 健康检查
        [NameInMap("health_monitor")]
        [Validation(Required=false)]
        public ListenerHealthMonitor HealthMonitor { get; set; }

        // iaas_id
        [NameInMap("iaas_id")]
        [Validation(Required=false)]
        public string IaasId { get; set; }

        // iaasType
        [NameInMap("iaas_type")]
        [Validation(Required=false)]
        public string IaasType { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // is_health_monitor
        [NameInMap("is_health_monitor")]
        [Validation(Required=false)]
        public string IsHealthMonitor { get; set; }

        // 监听器端口
        [NameInMap("listener_port")]
        [Validation(Required=true)]
        public long? ListenerPort { get; set; }

        // load_balancer
        [NameInMap("load_balancer")]
        [Validation(Required=false)]
        public LoadBalancer LoadBalancer { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 会话保持的超时时间
        [NameInMap("persist_timeout")]
        [Validation(Required=false)]
        public long? PersistTimeout { get; set; }

        // 转发规则
        [NameInMap("scheduler")]
        [Validation(Required=false)]
        public string Scheduler { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // sticky_session
        [NameInMap("sticky_session")]
        [Validation(Required=false)]
        public string StickySession { get; set; }

        // cookie 处理方式
        [NameInMap("sticky_session_type")]
        [Validation(Required=false)]
        public string StickySessionType { get; set; }

        // 监听类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // url_path
        [NameInMap("url_path")]
        [Validation(Required=false)]
        public string UrlPath { get; set; }

        // x_forwarded_for
        [NameInMap("x_forwarded_for")]
        [Validation(Required=false)]
        public string XForwardedFor { get; set; }

    }

}
