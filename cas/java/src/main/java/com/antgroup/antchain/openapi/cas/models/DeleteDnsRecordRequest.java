// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DeleteDnsRecordRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // dns_recordset_id
    @NameInMap("dns_recordset_id")
    @Validation(required = true)
    public String dnsRecordsetId;

    // dns_record_ip
    @NameInMap("dns_record_ip")
    @Validation(required = true)
    public String dnsRecordIp;

    // workspace_id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    public static DeleteDnsRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDnsRecordRequest self = new DeleteDnsRecordRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDnsRecordRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteDnsRecordRequest setDnsRecordsetId(String dnsRecordsetId) {
        this.dnsRecordsetId = dnsRecordsetId;
        return this;
    }
    public String getDnsRecordsetId() {
        return this.dnsRecordsetId;
    }

    public DeleteDnsRecordRequest setDnsRecordIp(String dnsRecordIp) {
        this.dnsRecordIp = dnsRecordIp;
        return this;
    }
    public String getDnsRecordIp() {
        return this.dnsRecordIp;
    }

    public DeleteDnsRecordRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
