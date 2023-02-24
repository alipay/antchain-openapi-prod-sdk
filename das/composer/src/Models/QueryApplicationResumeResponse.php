<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class QueryApplicationResumeResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 姓名
    /**
     * @var string
     */
    public $userName;

    // 性别
    /**
     * @var string
     */
    public $gender;

    // 生日
    /**
     * @var string
     */
    public $birthday;

    // 手机号
    /**
     * @var string
     */
    public $phone;

    // 头像图片url
    /**
     * @var string
     */
    public $headPicUrl;

    // 简历技能
    /**
     * @var ResumeSkillInfo[]
     */
    public $skills;

    // 证书信息
    /**
     * @var CertificatesInfo[]
     */
    public $certificates;

    // 工作经历
    /**
     * @var WorkExperiencesInfo[]
     */
    public $workExperiences;

    // 教育经历
    /**
     * @var EducationExperiencesInfo[]
     */
    public $educationExperiences;
    protected $_name = [
        'reqMsgId'             => 'req_msg_id',
        'resultCode'           => 'result_code',
        'resultMsg'            => 'result_msg',
        'userName'             => 'user_name',
        'gender'               => 'gender',
        'birthday'             => 'birthday',
        'phone'                => 'phone',
        'headPicUrl'           => 'head_pic_url',
        'skills'               => 'skills',
        'certificates'         => 'certificates',
        'workExperiences'      => 'work_experiences',
        'educationExperiences' => 'education_experiences',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->gender) {
            $res['gender'] = $this->gender;
        }
        if (null !== $this->birthday) {
            $res['birthday'] = $this->birthday;
        }
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }
        if (null !== $this->headPicUrl) {
            $res['head_pic_url'] = $this->headPicUrl;
        }
        if (null !== $this->skills) {
            $res['skills'] = [];
            if (null !== $this->skills && \is_array($this->skills)) {
                $n = 0;
                foreach ($this->skills as $item) {
                    $res['skills'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->certificates) {
            $res['certificates'] = [];
            if (null !== $this->certificates && \is_array($this->certificates)) {
                $n = 0;
                foreach ($this->certificates as $item) {
                    $res['certificates'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->workExperiences) {
            $res['work_experiences'] = [];
            if (null !== $this->workExperiences && \is_array($this->workExperiences)) {
                $n = 0;
                foreach ($this->workExperiences as $item) {
                    $res['work_experiences'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->educationExperiences) {
            $res['education_experiences'] = [];
            if (null !== $this->educationExperiences && \is_array($this->educationExperiences)) {
                $n = 0;
                foreach ($this->educationExperiences as $item) {
                    $res['education_experiences'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryApplicationResumeResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['gender'])) {
            $model->gender = $map['gender'];
        }
        if (isset($map['birthday'])) {
            $model->birthday = $map['birthday'];
        }
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }
        if (isset($map['head_pic_url'])) {
            $model->headPicUrl = $map['head_pic_url'];
        }
        if (isset($map['skills'])) {
            if (!empty($map['skills'])) {
                $model->skills = [];
                $n             = 0;
                foreach ($map['skills'] as $item) {
                    $model->skills[$n++] = null !== $item ? ResumeSkillInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['certificates'])) {
            if (!empty($map['certificates'])) {
                $model->certificates = [];
                $n                   = 0;
                foreach ($map['certificates'] as $item) {
                    $model->certificates[$n++] = null !== $item ? CertificatesInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['work_experiences'])) {
            if (!empty($map['work_experiences'])) {
                $model->workExperiences = [];
                $n                      = 0;
                foreach ($map['work_experiences'] as $item) {
                    $model->workExperiences[$n++] = null !== $item ? WorkExperiencesInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['education_experiences'])) {
            if (!empty($map['education_experiences'])) {
                $model->educationExperiences = [];
                $n                           = 0;
                foreach ($map['education_experiences'] as $item) {
                    $model->educationExperiences[$n++] = null !== $item ? EducationExperiencesInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
