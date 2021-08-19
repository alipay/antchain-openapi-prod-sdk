// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class AddCertificateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 机构Id
    @NameInMap("organization_id")
    public String organizationId;

    // 证书内容
    @NameInMap("certificate")
    @Validation(required = true)
    public String certificate;

    // 设备ID
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // 主机设备ID
    @NameInMap("host_device_id")
    @Validation(required = true)
    public String hostDeviceId;

    // 场景码
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    public static AddCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCertificateRequest self = new AddCertificateRequest();
        return TeaModel.build(map, self);
    }

    public AddCertificateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddCertificateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddCertificateRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public AddCertificateRequest setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public AddCertificateRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public AddCertificateRequest setHostDeviceId(String hostDeviceId) {
        this.hostDeviceId = hostDeviceId;
        return this;
    }
    public String getHostDeviceId() {
        return this.hostDeviceId;
    }

    public AddCertificateRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
