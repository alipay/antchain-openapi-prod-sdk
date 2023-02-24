<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class EducationExperiencesInfo extends Model
{
    // 学历
    /**
     * @example BACHELOR
     *
     * @var string
     */
    public $degree;

    // 受教育地点
    /**
     * @example 受教育地点
     *
     * @var string
     */
    public $location;

    // 学校名称
    /**
     * @example 北京大学
     *
     * @var string
     */
    public $schoolName;

    // 教育状态
    /**
     * @example FINISH_SCHOOL
     *
     * @var string
     */
    public $educationStatus;

    // 年
    /**
     * @example 2022
     *
     * @var int
     */
    public $year;

    // 月
    /**
     * @example 5
     *
     * @var int
     */
    public $month;
    protected $_name = [
        'degree'          => 'degree',
        'location'        => 'location',
        'schoolName'      => 'school_name',
        'educationStatus' => 'education_status',
        'year'            => 'year',
        'month'           => 'month',
    ];

    public function validate()
    {
        Model::validateMaxLength('degree', $this->degree, 32);
        Model::validateMaxLength('location', $this->location, 128);
        Model::validateMaxLength('schoolName', $this->schoolName, 128);
        Model::validateMaxLength('educationStatus', $this->educationStatus, 128);
        Model::validateMaximum('year', $this->year, 6);
        Model::validateMaximum('month', $this->month, 5);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->degree) {
            $res['degree'] = $this->degree;
        }
        if (null !== $this->location) {
            $res['location'] = $this->location;
        }
        if (null !== $this->schoolName) {
            $res['school_name'] = $this->schoolName;
        }
        if (null !== $this->educationStatus) {
            $res['education_status'] = $this->educationStatus;
        }
        if (null !== $this->year) {
            $res['year'] = $this->year;
        }
        if (null !== $this->month) {
            $res['month'] = $this->month;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EducationExperiencesInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['degree'])) {
            $model->degree = $map['degree'];
        }
        if (isset($map['location'])) {
            $model->location = $map['location'];
        }
        if (isset($map['school_name'])) {
            $model->schoolName = $map['school_name'];
        }
        if (isset($map['education_status'])) {
            $model->educationStatus = $map['education_status'];
        }
        if (isset($map['year'])) {
            $model->year = $map['year'];
        }
        if (isset($map['month'])) {
            $model->month = $map['month'];
        }

        return $model;
    }
}
