// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class CreateItagAntitagTaskRequestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // taskname
    @NameInMap("taskname")
    public String taskname;

    // templateid
    @NameInMap("templateid")
    public String templateid;

    // projectid
    @NameInMap("projectid")
    public String projectid;

    // AssignConfig
    @NameInMap("assignconfig")
    public AssignConfig assignconfig;

    // TaskWorkFlow
    @NameInMap("taskworkflow")
    public ITagTaskWorkflowConfig taskworkflow;

    // admins
    @NameInMap("admins")
    public java.util.List<Admins> admins;

    // datasetproxyrelations
    @NameInMap("datasetproxyrelations")
    public java.util.List<DatasetProxyRelations> datasetproxyrelations;

    // bizinfo
    @NameInMap("bizinfo")
    public BizInfo bizinfo;

    // tasktemplateconfig
    @NameInMap("tasktemplateconfig")
    public TaskTemplateConfig tasktemplateconfig;

    // Exif
    @NameInMap("exif")
    public Exif exif;

    // tntinstid
    @NameInMap("tntinstid")
    public String tntinstid;

    public static CreateItagAntitagTaskRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateItagAntitagTaskRequestRequest self = new CreateItagAntitagTaskRequestRequest();
        return TeaModel.build(map, self);
    }

    public CreateItagAntitagTaskRequestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateItagAntitagTaskRequestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateItagAntitagTaskRequestRequest setTaskname(String taskname) {
        this.taskname = taskname;
        return this;
    }
    public String getTaskname() {
        return this.taskname;
    }

    public CreateItagAntitagTaskRequestRequest setTemplateid(String templateid) {
        this.templateid = templateid;
        return this;
    }
    public String getTemplateid() {
        return this.templateid;
    }

    public CreateItagAntitagTaskRequestRequest setProjectid(String projectid) {
        this.projectid = projectid;
        return this;
    }
    public String getProjectid() {
        return this.projectid;
    }

    public CreateItagAntitagTaskRequestRequest setAssignconfig(AssignConfig assignconfig) {
        this.assignconfig = assignconfig;
        return this;
    }
    public AssignConfig getAssignconfig() {
        return this.assignconfig;
    }

    public CreateItagAntitagTaskRequestRequest setTaskworkflow(ITagTaskWorkflowConfig taskworkflow) {
        this.taskworkflow = taskworkflow;
        return this;
    }
    public ITagTaskWorkflowConfig getTaskworkflow() {
        return this.taskworkflow;
    }

    public CreateItagAntitagTaskRequestRequest setAdmins(java.util.List<Admins> admins) {
        this.admins = admins;
        return this;
    }
    public java.util.List<Admins> getAdmins() {
        return this.admins;
    }

    public CreateItagAntitagTaskRequestRequest setDatasetproxyrelations(java.util.List<DatasetProxyRelations> datasetproxyrelations) {
        this.datasetproxyrelations = datasetproxyrelations;
        return this;
    }
    public java.util.List<DatasetProxyRelations> getDatasetproxyrelations() {
        return this.datasetproxyrelations;
    }

    public CreateItagAntitagTaskRequestRequest setBizinfo(BizInfo bizinfo) {
        this.bizinfo = bizinfo;
        return this;
    }
    public BizInfo getBizinfo() {
        return this.bizinfo;
    }

    public CreateItagAntitagTaskRequestRequest setTasktemplateconfig(TaskTemplateConfig tasktemplateconfig) {
        this.tasktemplateconfig = tasktemplateconfig;
        return this;
    }
    public TaskTemplateConfig getTasktemplateconfig() {
        return this.tasktemplateconfig;
    }

    public CreateItagAntitagTaskRequestRequest setExif(Exif exif) {
        this.exif = exif;
        return this;
    }
    public Exif getExif() {
        return this.exif;
    }

    public CreateItagAntitagTaskRequestRequest setTntinstid(String tntinstid) {
        this.tntinstid = tntinstid;
        return this;
    }
    public String getTntinstid() {
        return this.tntinstid;
    }

}
