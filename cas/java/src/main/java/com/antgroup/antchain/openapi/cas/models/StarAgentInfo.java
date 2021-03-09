// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class StarAgentInfo extends TeaModel {
    // computer serial number
    @NameInMap("sn")
    public String sn;

    // hostname
    @NameInMap("hostname")
    public String hostname;

    // ip
    @NameInMap("ip")
    public String ip;

    // ip list
    @NameInMap("ip_list")
    public String ipList;

    // 状态取值：RUNNING，ERROR，REGISTER，NOFIND
    @NameInMap("status")
    public String status;

    public static StarAgentInfo build(java.util.Map<String, ?> map) throws Exception {
        StarAgentInfo self = new StarAgentInfo();
        return TeaModel.build(map, self);
    }

    public StarAgentInfo setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public StarAgentInfo setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public StarAgentInfo setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public StarAgentInfo setIpList(String ipList) {
        this.ipList = ipList;
        return this;
    }
    public String getIpList() {
        return this.ipList;
    }

    public StarAgentInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
