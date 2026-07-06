// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trustiot.models;

import com.aliyun.tea.*;

public class ExecBlockchainBotPullstrategyStationcheckRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 运营商标识
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 加密后核心数据
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // 接口请求时的时间戳信息，格式为yyyyMMddHHmmss
    @NameInMap("time_stamp")
    @Validation(required = true)
    public String timeStamp;

    // 自增序列，4位自增序列取自时间戳，同一秒内按序列自增长，新秒重计
    @NameInMap("seq")
    @Validation(required = true)
    public String seq;

    // 参数签名，原文为operatorId+data+timeStamp+seq
    @NameInMap("sig")
    @Validation(required = true)
    public String sig;

    public static ExecBlockchainBotPullstrategyStationcheckRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecBlockchainBotPullstrategyStationcheckRequest self = new ExecBlockchainBotPullstrategyStationcheckRequest();
        return TeaModel.build(map, self);
    }

    public ExecBlockchainBotPullstrategyStationcheckRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecBlockchainBotPullstrategyStationcheckRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecBlockchainBotPullstrategyStationcheckRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public ExecBlockchainBotPullstrategyStationcheckRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ExecBlockchainBotPullstrategyStationcheckRequest setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }
    public String getTimeStamp() {
        return this.timeStamp;
    }

    public ExecBlockchainBotPullstrategyStationcheckRequest setSeq(String seq) {
        this.seq = seq;
        return this;
    }
    public String getSeq() {
        return this.seq;
    }

    public ExecBlockchainBotPullstrategyStationcheckRequest setSig(String sig) {
        this.sig = sig;
        return this;
    }
    public String getSig() {
        return this.sig;
    }

}
