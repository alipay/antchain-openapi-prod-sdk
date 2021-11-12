// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class AutoTestProdResult extends TeaModel {
    // 测试用例
    @NameInMap("cases")
    @Validation(required = true)
    public java.util.List<AutoTestCase> cases;

    // 容器信息
    @NameInMap("containers")
    @Validation(required = true)
    public java.util.List<ContainerInfo> containers;

    // 部署单元id
    @NameInMap("deploy_unit")
    @Validation(required = true)
    public String deployUnit;

    // 产品码
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    // 产品测试状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 测试创建时间
    @NameInMap("utc_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcCreate;

    // 结束时间
    @NameInMap("utc_end")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcEnd;

    // 测试修改时间
    @NameInMap("utc_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcModified;

    // 测试开始时间
    @NameInMap("utc_start")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcStart;

    // 单元的id
    @NameInMap("cell_id")
    @Validation(required = true)
    public String cellId;

    public static AutoTestProdResult build(java.util.Map<String, ?> map) throws Exception {
        AutoTestProdResult self = new AutoTestProdResult();
        return TeaModel.build(map, self);
    }

    public AutoTestProdResult setCases(java.util.List<AutoTestCase> cases) {
        this.cases = cases;
        return this;
    }
    public java.util.List<AutoTestCase> getCases() {
        return this.cases;
    }

    public AutoTestProdResult setContainers(java.util.List<ContainerInfo> containers) {
        this.containers = containers;
        return this;
    }
    public java.util.List<ContainerInfo> getContainers() {
        return this.containers;
    }

    public AutoTestProdResult setDeployUnit(String deployUnit) {
        this.deployUnit = deployUnit;
        return this;
    }
    public String getDeployUnit() {
        return this.deployUnit;
    }

    public AutoTestProdResult setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public AutoTestProdResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AutoTestProdResult setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public AutoTestProdResult setUtcEnd(String utcEnd) {
        this.utcEnd = utcEnd;
        return this;
    }
    public String getUtcEnd() {
        return this.utcEnd;
    }

    public AutoTestProdResult setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

    public AutoTestProdResult setUtcStart(String utcStart) {
        this.utcStart = utcStart;
        return this;
    }
    public String getUtcStart() {
        return this.utcStart;
    }

    public AutoTestProdResult setCellId(String cellId) {
        this.cellId = cellId;
        return this;
    }
    public String getCellId() {
        return this.cellId;
    }

}
