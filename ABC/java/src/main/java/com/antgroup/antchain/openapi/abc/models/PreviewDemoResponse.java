// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.abc.models;

import com.aliyun.tea.*;

public class PreviewDemoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 字符串回参
    @NameInMap("output_string")
    public String outputString;

    // Long型回参
    @NameInMap("output_number")
    public Long outputNumber;

    // 布尔型回参
    @NameInMap("output_boolean")
    public Boolean outputBoolean;

    // ISO8602格式字符串：yyyy-MM-dd_T_HH:mm:ss_Z_
    @NameInMap("output_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String outputDate;

    // 字符串数组
    @NameInMap("output_string_list")
    public java.util.List<String> outputStringList;

    // 结构体回参
    @NameInMap("output_struct")
    public AbcDemoStruct outputStruct;

    // 结构体列表回参
    @NameInMap("output_struct_list")
    public java.util.List<AbcDemoStruct> outputStructList;

    public static PreviewDemoResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewDemoResponse self = new PreviewDemoResponse();
        return TeaModel.build(map, self);
    }

    public PreviewDemoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PreviewDemoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PreviewDemoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PreviewDemoResponse setOutputString(String outputString) {
        this.outputString = outputString;
        return this;
    }
    public String getOutputString() {
        return this.outputString;
    }

    public PreviewDemoResponse setOutputNumber(Long outputNumber) {
        this.outputNumber = outputNumber;
        return this;
    }
    public Long getOutputNumber() {
        return this.outputNumber;
    }

    public PreviewDemoResponse setOutputBoolean(Boolean outputBoolean) {
        this.outputBoolean = outputBoolean;
        return this;
    }
    public Boolean getOutputBoolean() {
        return this.outputBoolean;
    }

    public PreviewDemoResponse setOutputDate(String outputDate) {
        this.outputDate = outputDate;
        return this;
    }
    public String getOutputDate() {
        return this.outputDate;
    }

    public PreviewDemoResponse setOutputStringList(java.util.List<String> outputStringList) {
        this.outputStringList = outputStringList;
        return this;
    }
    public java.util.List<String> getOutputStringList() {
        return this.outputStringList;
    }

    public PreviewDemoResponse setOutputStruct(AbcDemoStruct outputStruct) {
        this.outputStruct = outputStruct;
        return this;
    }
    public AbcDemoStruct getOutputStruct() {
        return this.outputStruct;
    }

    public PreviewDemoResponse setOutputStructList(java.util.List<AbcDemoStruct> outputStructList) {
        this.outputStructList = outputStructList;
        return this;
    }
    public java.util.List<AbcDemoStruct> getOutputStructList() {
        return this.outputStructList;
    }

}
