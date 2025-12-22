// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractTextSignVerifyCertInfo extends TeaModel {
    // 证书所有者
    /**
     * <strong>example:</strong>
     * <p>杭州**有限公司</p>
     */
    @NameInMap("owner")
    public String owner;

    // 证书序列号
    /**
     * <strong>example:</strong>
     * <p>6bdea579b491bxxxxxxx</p>
     */
    @NameInMap("serial")
    public String serial;

    // 证书有效期开始时间
    /**
     * <strong>example:</strong>
     * <p>2020-04-13 11:46:18</p>
     */
    @NameInMap("start_date")
    public String startDate;

    // 证书有效期结束时间
    /**
     * <strong>example:</strong>
     * <p>2021-04-13 11:46:18</p>
     */
    @NameInMap("end_date")
    public String endDate;

    // 证书发布者名称
    /**
     * <strong>example:</strong>
     * <p>智慧CA_测试CA</p>
     */
    @NameInMap("issuer_cn")
    public String issuerCn;

    public static ContractTextSignVerifyCertInfo build(java.util.Map<String, ?> map) throws Exception {
        ContractTextSignVerifyCertInfo self = new ContractTextSignVerifyCertInfo();
        return TeaModel.build(map, self);
    }

    public ContractTextSignVerifyCertInfo setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ContractTextSignVerifyCertInfo setSerial(String serial) {
        this.serial = serial;
        return this;
    }
    public String getSerial() {
        return this.serial;
    }

    public ContractTextSignVerifyCertInfo setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public ContractTextSignVerifyCertInfo setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ContractTextSignVerifyCertInfo setIssuerCn(String issuerCn) {
        this.issuerCn = issuerCn;
        return this;
    }
    public String getIssuerCn() {
        return this.issuerCn;
    }

}
