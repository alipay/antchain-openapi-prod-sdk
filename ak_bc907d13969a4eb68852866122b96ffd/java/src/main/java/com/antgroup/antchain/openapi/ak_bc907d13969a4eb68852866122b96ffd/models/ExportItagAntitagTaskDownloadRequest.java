// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class ExportItagAntitagTaskDownloadRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // iTAG租户id
    @NameInMap("tntinstid")
    public String tntinstid;

    // TaskId
    @NameInMap("taskid")
    public String taskid;

    // Encode
    @NameInMap("encode")
    public String encode;

    public static ExportItagAntitagTaskDownloadRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportItagAntitagTaskDownloadRequest self = new ExportItagAntitagTaskDownloadRequest();
        return TeaModel.build(map, self);
    }

    public ExportItagAntitagTaskDownloadRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExportItagAntitagTaskDownloadRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExportItagAntitagTaskDownloadRequest setTntinstid(String tntinstid) {
        this.tntinstid = tntinstid;
        return this;
    }
    public String getTntinstid() {
        return this.tntinstid;
    }

    public ExportItagAntitagTaskDownloadRequest setTaskid(String taskid) {
        this.taskid = taskid;
        return this;
    }
    public String getTaskid() {
        return this.taskid;
    }

    public ExportItagAntitagTaskDownloadRequest setEncode(String encode) {
        this.encode = encode;
        return this;
    }
    public String getEncode() {
        return this.encode;
    }

}
