// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class DetailPdcpDepositResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 存证数据类型
    @NameInMap("data_type")
    public String dataType;

    // 存证数据唯一ID
    @NameInMap("data_id")
    public String dataId;

    // 存证数据内容
    @NameInMap("deposit_data")
    public DataDepositInfo depositData;

    public static DetailPdcpDepositResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailPdcpDepositResponse self = new DetailPdcpDepositResponse();
        return TeaModel.build(map, self);
    }

    public DetailPdcpDepositResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailPdcpDepositResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailPdcpDepositResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailPdcpDepositResponse setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public DetailPdcpDepositResponse setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public DetailPdcpDepositResponse setDepositData(DataDepositInfo depositData) {
        this.depositData = depositData;
        return this;
    }
    public DataDepositInfo getDepositData() {
        return this.depositData;
    }

}
