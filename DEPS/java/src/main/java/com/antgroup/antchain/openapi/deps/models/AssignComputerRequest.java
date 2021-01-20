// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class AssignComputerRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 应用的完整名称
    @NameInMap("application_name")
    public String applicationName;

    // 是否启用自动运维，默认为**False**
    @NameInMap("auto_ops")
    public Boolean autoOps;

    // 计算资源与cell的关系，如果不指定会根据分配的应用、服务实例以及computer的zone信息由系统决定，如果无法决定会导致失败，建议在指定了service_name参数的情形下指定该参数
    @NameInMap("computer_cells")
    public java.util.List<ComputerCell> computerCells;

    // 计算资源id，可以指定多个
    @NameInMap("computer_ids")
    public java.util.List<String> computerIds;

    // 是否重新初始化数据磁盘，默认为**False**
    @NameInMap("init_data_disk")
    public Boolean initDataDisk;

    // 是否重新初始化系统磁盘，默认为**False**
    @NameInMap("init_sys_disk")
    public Boolean initSysDisk;

    // 请求业务id，用于幂等性控制等，需要客户端提供并保证唯一。最大64位单字节字符
    @NameInMap("req_biz_id")
    public String reqBizId;

    // 目标服务实例名称
    @NameInMap("service_name")
    public String serviceName;

    // 目标工作空间名称
    @NameInMap("workspace")
    public String workspace;

    public static AssignComputerRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignComputerRequest self = new AssignComputerRequest();
        return TeaModel.build(map, self);
    }

    public AssignComputerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AssignComputerRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public AssignComputerRequest setAutoOps(Boolean autoOps) {
        this.autoOps = autoOps;
        return this;
    }
    public Boolean getAutoOps() {
        return this.autoOps;
    }

    public AssignComputerRequest setComputerCells(java.util.List<ComputerCell> computerCells) {
        this.computerCells = computerCells;
        return this;
    }
    public java.util.List<ComputerCell> getComputerCells() {
        return this.computerCells;
    }

    public AssignComputerRequest setComputerIds(java.util.List<String> computerIds) {
        this.computerIds = computerIds;
        return this;
    }
    public java.util.List<String> getComputerIds() {
        return this.computerIds;
    }

    public AssignComputerRequest setInitDataDisk(Boolean initDataDisk) {
        this.initDataDisk = initDataDisk;
        return this;
    }
    public Boolean getInitDataDisk() {
        return this.initDataDisk;
    }

    public AssignComputerRequest setInitSysDisk(Boolean initSysDisk) {
        this.initSysDisk = initSysDisk;
        return this;
    }
    public Boolean getInitSysDisk() {
        return this.initSysDisk;
    }

    public AssignComputerRequest setReqBizId(String reqBizId) {
        this.reqBizId = reqBizId;
        return this;
    }
    public String getReqBizId() {
        return this.reqBizId;
    }

    public AssignComputerRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public AssignComputerRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
