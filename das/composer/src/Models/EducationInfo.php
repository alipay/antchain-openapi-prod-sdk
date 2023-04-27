<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class EducationInfo extends Model
{
    // 专业
    /**
     * @example 计算机
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

    // 学校层级
    /**
     * @example 985学校
     *
     * @var string
     */
    public $schoolType;
    protected $_name = [
        'major'          => 'major',
        'educationLevel' => 'education_level',
        'graduationDate' => 'graduation_date',
        'educationType'  => 'education_type',
        'schoolType'     => 'school_type',
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
        if (null !== $this->schoolType) {
            $res['school_type'] = $this->schoolType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EducationInfo
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
        if (isset($map['school_type'])) {
            $model->schoolType = $map['school_type'];
        }

        return $model;
    }
}
