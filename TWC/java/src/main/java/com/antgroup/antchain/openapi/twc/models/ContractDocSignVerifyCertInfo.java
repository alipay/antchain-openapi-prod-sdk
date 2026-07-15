// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractDocSignVerifyCertInfo extends TeaModel {
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
     * <p>536deb6bfce98a9143f143ca</p>
     */
    @NameInMap("serial")
    public String serial;

    // 证书开始日期
    /**
     * <strong>example:</strong>
     * <p>2020-04-13 11:46:18</p>
     */
    @NameInMap("start_date")
    public String startDate;

    // 证书结束日期
    /**
     * <strong>example:</strong>
     * <p>2021-04-13 11:46:18</p>
     */
    @NameInMap("end_date")
    public String endDate;

    // 证书颁发机构
    /**
     * <strong>example:</strong>
     * <p>智慧CA_测试</p>
     */
    @NameInMap("issuer_cn")
    public String issuerCn;

    public static ContractDocSignVerifyCertInfo build(java.util.Map<String, ?> map) throws Exception {
        ContractDocSignVerifyCertInfo self = new ContractDocSignVerifyCertInfo();
        return TeaModel.build(map, self);
    }

    public ContractDocSignVerifyCertInfo setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ContractDocSignVerifyCertInfo setSerial(String serial) {
        this.serial = serial;
        return this;
    }
    public String getSerial() {
        return this.serial;
    }

    public ContractDocSignVerifyCertInfo setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public ContractDocSignVerifyCertInfo setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ContractDocSignVerifyCertInfo setIssuerCn(String issuerCn) {
        this.issuerCn = issuerCn;
        return this;
    }
    public String getIssuerCn() {
        return this.issuerCn;
    }

}
