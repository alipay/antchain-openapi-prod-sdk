// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AddDnsRecordsetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // description
    @NameInMap("description")
    public String description;

    // type: 记录类型，默认为A, 仅支持 A, CName, 见DnsRecordSetType
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // type: 类型, PUBLIC(外部域名) 或者 PRIVATE (域名) 见DnsNetworkType
    @NameInMap("dns_network_type")
    public String dnsNetworkType;

    // tenant_id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // dns_records
    @NameInMap("dns_records")
    @Validation(required = true)
    public java.util.List<DnsRecordParam> dnsRecords;

    public static AddDnsRecordsetRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDnsRecordsetRequest self = new AddDnsRecordsetRequest();
        return TeaModel.build(map, self);
    }

    public AddDnsRecordsetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddDnsRecordsetRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddDnsRecordsetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddDnsRecordsetRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddDnsRecordsetRequest setDnsNetworkType(String dnsNetworkType) {
        this.dnsNetworkType = dnsNetworkType;
        return this;
    }
    public String getDnsNetworkType() {
        return this.dnsNetworkType;
    }

    public AddDnsRecordsetRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AddDnsRecordsetRequest setDnsRecords(java.util.List<DnsRecordParam> dnsRecords) {
        this.dnsRecords = dnsRecords;
        return this;
    }
    public java.util.List<DnsRecordParam> getDnsRecords() {
        return this.dnsRecords;
    }

}
