// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class Subscriber extends TeaModel {
    // 订阅端是否存活，默认1-存活，订阅端下线标记为0，默认1
    // 
    @NameInMap("alive")
    public Boolean alive;

    // 应用名
    @NameInMap("app_name")
    public String appName;

    // 校验值
    // 
    @NameInMap("check_sum")
    public String checkSum;

    // 服务id
    // 
    @NameInMap("data_id")
    public String dataId;

    // 创建日期
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 最后更新时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 发布这个服务的主机的 ip，不同于 service_ip
    @NameInMap("host_ip")
    public String hostIp;

    // 消费者id
    @NameInMap("id")
    public Long id;

    // 租户实例id
    // 
    @NameInMap("instance_id")
    public String instanceId;

    // 进程ID
    // 
    @NameInMap("process_id")
    public String processId;

    // 订阅者的订阅维度
    @NameInMap("scope")
    public String scope;

    // 订阅端订阅时使用的 zone
    @NameInMap("zone")
    public String zone;

    public static Subscriber build(java.util.Map<String, ?> map) throws Exception {
        Subscriber self = new Subscriber();
        return TeaModel.build(map, self);
    }

    public Subscriber setAlive(Boolean alive) {
        this.alive = alive;
        return this;
    }
    public Boolean getAlive() {
        return this.alive;
    }

    public Subscriber setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public Subscriber setCheckSum(String checkSum) {
        this.checkSum = checkSum;
        return this;
    }
    public String getCheckSum() {
        return this.checkSum;
    }

    public Subscriber setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public Subscriber setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public Subscriber setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public Subscriber setHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }
    public String getHostIp() {
        return this.hostIp;
    }

    public Subscriber setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public Subscriber setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public Subscriber setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public Subscriber setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public Subscriber setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
