<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class EducationTagInfo extends Model
{
    // 专业名称
    /**
     * @example 软件工程
     *
     * @var string
     */
    public $major;

    // 学历等级代码
    /**
     * @example 01
     *
     * @var string
     */
    public $educationLevel;

    //
    // 毕业日期
    /**
     * @example 2020/06
     *
     * @var string
     */
    public $graduationDate;

    // 学习形式
    /**
     * @example 全日制
     *
     * @var string
     */
    public $educationType;

    // 入学时间
    /**
     * @example 202109
     *
     * @var string
     */
    public $admissionDate;

    // 学校类型
    /**
     * @example 985学校
     *
     * @var string
     */
    public $schoolType;

    // 学习形式字典code
    /**
     * @example 01
     *
     * @var string
     */
    public $educationTypeCode;

    // 学校名称
    /**
     * @example 北京大学
     *
     * @var string
     */
    public $schoolName;
    protected $_name = [
        'major'             => 'major',
        'educationLevel'    => 'education_level',
        'graduationDate'    => 'graduation_date',
        'educationType'     => 'education_type',
        'admissionDate'     => 'admission_date',
        'schoolType'        => 'school_type',
        'educationTypeCode' => 'education_type_code',
        'schoolName'        => 'school_name',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->major) {
            $res['major'] = $this->major;
        }
        if (null !== $this->educationLevel) {
            $res['education_level'] = $this->educationLevel;
        }
        if (null !== $this->graduationDate) {
            $res['graduation_date'] = $this->graduationDate;
        }
        if (null !== $this->educationType) {
            $res['education_type'] = $this->educationType;
        }
        if (null !== $this->admissionDate) {
            $res['admission_date'] = $this->admissionDate;
        }
        if (null !== $this->schoolType) {
            $res['school_type'] = $this->schoolType;
        }
        if (null !== $this->educationTypeCode) {
            $res['education_type_code'] = $this->educationTypeCode;
        }
        if (null !== $this->schoolName) {
            $res['school_name'] = $this->schoolName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EducationTagInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['major'])) {
            $model->major = $map['major'];
        }
        if (isset($map['education_level'])) {
            $model->educationLevel = $map['education_level'];
        }
        if (isset($map['graduation_date'])) {
            $model->graduationDate = $map['graduation_date'];
        }
        if (isset($map['education_type'])) {
            $model->educationType = $map['education_type'];
        }
        if (isset($map['admission_date'])) {
            $model->admissionDate = $map['admission_date'];
        }
        if (isset($map['school_type'])) {
            $model->schoolType = $map['school_type'];
        }
        if (isset($map['education_type_code'])) {
            $model->educationTypeCode = $map['education_type_code'];
        }
        if (isset($map['school_name'])) {
            $model->schoolName = $map['school_name'];
        }

        return $model;
    }
}
