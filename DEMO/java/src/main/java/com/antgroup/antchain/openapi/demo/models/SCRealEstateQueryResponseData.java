// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class SCRealEstateQueryResponseData extends TeaModel {
    // area_code
    /**
     * <strong>example:</strong>
     * <p>510108</p>
     */
    @NameInMap("area_code")
    @Validation(required = true)
    public String areaCode;

    // area_name
    /**
     * <strong>example:</strong>
     * <p>area_name</p>
     */
    @NameInMap("area_name")
    @Validation(required = true)
    public String areaName;

    // bdcdyh
    /**
     * <strong>example:</strong>
     * <p>bdcdyh</p>
     */
    @NameInMap("bdcdyh")
    @Validation(required = true)
    public String bdcdyh;

    // bdcqzh
    /**
     * <strong>example:</strong>
     * <p>bdcqzh</p>
     */
    @NameInMap("bdcqzh")
    @Validation(required = true)
    public String bdcqzh;

    // djsj
    /**
     * <strong>example:</strong>
     * <p>djsj</p>
     */
    @NameInMap("djsj")
    @Validation(required = true)
    public String djsj;

    // fwyt1
    /**
     * <strong>example:</strong>
     * <p>fwyt1</p>
     */
    @NameInMap("fwyt1")
    @Validation(required = true)
    public String fwyt1;

    // gyqk
    /**
     * <strong>example:</strong>
     * <p>gyqk</p>
     */
    @NameInMap("gyqk")
    @Validation(required = true)
    public String gyqk;

    // qllx
    /**
     * <strong>example:</strong>
     * <p>qllx</p>
     */
    @NameInMap("qllx")
    @Validation(required = true)
    public String qllx;

    // qlrmc
    /**
     * <strong>example:</strong>
     * <p>qlrmc</p>
     */
    @NameInMap("qlrmc")
    @Validation(required = true)
    public String qlrmc;

    // scjzmj
    /**
     * <strong>example:</strong>
     * <p>scjzmj</p>
     */
    @NameInMap("scjzmj")
    @Validation(required = true)
    public String scjzmj;

    public static SCRealEstateQueryResponseData build(java.util.Map<String, ?> map) throws Exception {
        SCRealEstateQueryResponseData self = new SCRealEstateQueryResponseData();
        return TeaModel.build(map, self);
    }

    public SCRealEstateQueryResponseData setAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }
    public String getAreaCode() {
        return this.areaCode;
    }

    public SCRealEstateQueryResponseData setAreaName(String areaName) {
        this.areaName = areaName;
        return this;
    }
    public String getAreaName() {
        return this.areaName;
    }

    public SCRealEstateQueryResponseData setBdcdyh(String bdcdyh) {
        this.bdcdyh = bdcdyh;
        return this;
    }
    public String getBdcdyh() {
        return this.bdcdyh;
    }

    public SCRealEstateQueryResponseData setBdcqzh(String bdcqzh) {
        this.bdcqzh = bdcqzh;
        return this;
    }
    public String getBdcqzh() {
        return this.bdcqzh;
    }

    public SCRealEstateQueryResponseData setDjsj(String djsj) {
        this.djsj = djsj;
        return this;
    }
    public String getDjsj() {
        return this.djsj;
    }

    public SCRealEstateQueryResponseData setFwyt1(String fwyt1) {
        this.fwyt1 = fwyt1;
        return this;
    }
    public String getFwyt1() {
        return this.fwyt1;
    }

    public SCRealEstateQueryResponseData setGyqk(String gyqk) {
        this.gyqk = gyqk;
        return this;
    }
    public String getGyqk() {
        return this.gyqk;
    }

    public SCRealEstateQueryResponseData setQllx(String qllx) {
        this.qllx = qllx;
        return this;
    }
    public String getQllx() {
        return this.qllx;
    }

    public SCRealEstateQueryResponseData setQlrmc(String qlrmc) {
        this.qlrmc = qlrmc;
        return this;
    }
    public String getQlrmc() {
        return this.qlrmc;
    }

    public SCRealEstateQueryResponseData setScjzmj(String scjzmj) {
        this.scjzmj = scjzmj;
        return this;
    }
    public String getScjzmj() {
        return this.scjzmj;
    }

}
