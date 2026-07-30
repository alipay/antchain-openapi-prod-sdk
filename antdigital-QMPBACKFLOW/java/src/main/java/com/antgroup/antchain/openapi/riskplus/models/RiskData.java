// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RiskData extends TeaModel {
    // 联系人信息列表
    /**
     * <strong>example:</strong>
     * <p>[{}]</p>
     */
    @NameInMap("contacts")
    @Validation(required = true)
    public java.util.List<Contact> contacts;

    // 人脸对比分
    /**
     * <strong>example:</strong>
     * <p>x</p>
     */
    @NameInMap("face_point")
    public String facePoint;

    // 活体供应商
    /**
     * <strong>example:</strong>
     * <p>活体供应商</p>
     */
    @NameInMap("face_source")
    public String faceSource;

    public static RiskData build(java.util.Map<String, ?> map) throws Exception {
        RiskData self = new RiskData();
        return TeaModel.build(map, self);
    }

    public RiskData setContacts(java.util.List<Contact> contacts) {
        this.contacts = contacts;
        return this;
    }
    public java.util.List<Contact> getContacts() {
        return this.contacts;
    }

    public RiskData setFacePoint(String facePoint) {
        this.facePoint = facePoint;
        return this;
    }
    public String getFacePoint() {
        return this.facePoint;
    }

    public RiskData setFaceSource(String faceSource) {
        this.faceSource = faceSource;
        return this;
    }
    public String getFaceSource() {
        return this.faceSource;
    }

}
