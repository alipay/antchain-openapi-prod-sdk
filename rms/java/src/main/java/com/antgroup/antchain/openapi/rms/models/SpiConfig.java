// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class SpiConfig extends TeaModel {
    // end_point或token
    @NameInMap("end_point")
    public String endPoint;

    // 创建时间
    @NameInMap("gmt_create")
    public String gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    public String gmtModified;

    // last_editor
    @NameInMap("last_editor")
    public String lastEditor;

    // 字段格式
    @NameInMap("field_naming_strategy")
    public String fieldNamingStrategy;

    // 云厂商类型
    @NameInMap("cloud_vendor_type")
    public String cloudVendorType;

    public static SpiConfig build(java.util.Map<String, ?> map) throws Exception {
        SpiConfig self = new SpiConfig();
        return TeaModel.build(map, self);
    }

    public SpiConfig setEndPoint(String endPoint) {
        this.endPoint = endPoint;
        return this;
    }
    public String getEndPoint() {
        return this.endPoint;
    }

    public SpiConfig setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public SpiConfig setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public SpiConfig setLastEditor(String lastEditor) {
        this.lastEditor = lastEditor;
        return this;
    }
    public String getLastEditor() {
        return this.lastEditor;
    }

    public SpiConfig setFieldNamingStrategy(String fieldNamingStrategy) {
        this.fieldNamingStrategy = fieldNamingStrategy;
        return this;
    }
    public String getFieldNamingStrategy() {
        return this.fieldNamingStrategy;
    }

    public SpiConfig setCloudVendorType(String cloudVendorType) {
        this.cloudVendorType = cloudVendorType;
        return this;
    }
    public String getCloudVendorType() {
        return this.cloudVendorType;
    }

}
