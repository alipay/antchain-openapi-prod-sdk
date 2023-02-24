// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryApplicationResumeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 姓名
    @NameInMap("user_name")
    public String userName;

    // 性别
    @NameInMap("gender")
    public String gender;

    // 生日
    @NameInMap("birthday")
    public String birthday;

    // 手机号
    @NameInMap("phone")
    public String phone;

    // 头像图片url
    @NameInMap("head_pic_url")
    public String headPicUrl;

    // 简历技能
    @NameInMap("skills")
    public java.util.List<ResumeSkillInfo> skills;

    // 证书信息
    @NameInMap("certificates")
    public java.util.List<CertificatesInfo> certificates;

    // 工作经历
    @NameInMap("work_experiences")
    public java.util.List<WorkExperiencesInfo> workExperiences;

    // 教育经历
    @NameInMap("education_experiences")
    public java.util.List<EducationExperiencesInfo> educationExperiences;

    public static QueryApplicationResumeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationResumeResponse self = new QueryApplicationResumeResponse();
        return TeaModel.build(map, self);
    }

    public QueryApplicationResumeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryApplicationResumeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryApplicationResumeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryApplicationResumeResponse setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public QueryApplicationResumeResponse setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public String getGender() {
        return this.gender;
    }

    public QueryApplicationResumeResponse setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }
    public String getBirthday() {
        return this.birthday;
    }

    public QueryApplicationResumeResponse setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public QueryApplicationResumeResponse setHeadPicUrl(String headPicUrl) {
        this.headPicUrl = headPicUrl;
        return this;
    }
    public String getHeadPicUrl() {
        return this.headPicUrl;
    }

    public QueryApplicationResumeResponse setSkills(java.util.List<ResumeSkillInfo> skills) {
        this.skills = skills;
        return this;
    }
    public java.util.List<ResumeSkillInfo> getSkills() {
        return this.skills;
    }

    public QueryApplicationResumeResponse setCertificates(java.util.List<CertificatesInfo> certificates) {
        this.certificates = certificates;
        return this;
    }
    public java.util.List<CertificatesInfo> getCertificates() {
        return this.certificates;
    }

    public QueryApplicationResumeResponse setWorkExperiences(java.util.List<WorkExperiencesInfo> workExperiences) {
        this.workExperiences = workExperiences;
        return this;
    }
    public java.util.List<WorkExperiencesInfo> getWorkExperiences() {
        return this.workExperiences;
    }

    public QueryApplicationResumeResponse setEducationExperiences(java.util.List<EducationExperiencesInfo> educationExperiences) {
        this.educationExperiences = educationExperiences;
        return this;
    }
    public java.util.List<EducationExperiencesInfo> getEducationExperiences() {
        return this.educationExperiences;
    }

}
