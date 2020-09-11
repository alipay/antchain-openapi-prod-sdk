<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class UpdateBaasEbcOrganizationCourseRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'courseDescription' => 'course_description',
        'courseEndTime' => 'course_end_time',
        'courseId' => 'course_id',
        'courseName' => 'course_name',
        'courseStartTime' => 'course_start_time',
        'courseSummary' => 'course_summary',
        'courseType' => 'course_type',
        'orgDid' => 'org_did',
        'period' => 'period',
    ];
    public function validate() {
        Model::validateMaxLength('courseDescription', $this->courseDescription, 1000);
        Model::validateMaxLength('courseId', $this->courseId, 128);
        Model::validateMaxLength('courseName', $this->courseName, 64);
        Model::validateMaxLength('courseSummary', $this->courseSummary, 120);
        Model::validateMaxLength('orgDid', $this->orgDid, 128);
        Model::validatePattern('courseEndTime', $this->courseEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('courseStartTime', $this->courseStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->courseDescription) {
            $res['course_description'] = $this->courseDescription;
        }
        if (null !== $this->courseEndTime) {
            $res['course_end_time'] = $this->courseEndTime;
        }
        if (null !== $this->courseId) {
            $res['course_id'] = $this->courseId;
        }
        if (null !== $this->courseName) {
            $res['course_name'] = $this->courseName;
        }
        if (null !== $this->courseStartTime) {
            $res['course_start_time'] = $this->courseStartTime;
        }
        if (null !== $this->courseSummary) {
            $res['course_summary'] = $this->courseSummary;
        }
        if (null !== $this->courseType) {
            $res['course_type'] = $this->courseType;
        }
        if (null !== $this->orgDid) {
            $res['org_did'] = $this->orgDid;
        }
        if (null !== $this->period) {
            $res['period'] = $this->period;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateBaasEbcOrganizationCourseRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['course_description'])){
            $model->courseDescription = $map['course_description'];
        }
        if(isset($map['course_end_time'])){
            $model->courseEndTime = $map['course_end_time'];
        }
        if(isset($map['course_id'])){
            $model->courseId = $map['course_id'];
        }
        if(isset($map['course_name'])){
            $model->courseName = $map['course_name'];
        }
        if(isset($map['course_start_time'])){
            $model->courseStartTime = $map['course_start_time'];
        }
        if(isset($map['course_summary'])){
            $model->courseSummary = $map['course_summary'];
        }
        if(isset($map['course_type'])){
            $model->courseType = $map['course_type'];
        }
        if(isset($map['org_did'])){
            $model->orgDid = $map['org_did'];
        }
        if(isset($map['period'])){
            $model->period = $map['period'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 课程描述
    // 
    /**
     * @var string
     */
    public $courseDescription;

    // 课程结束时间
    /**
     * @var string
     */
    public $courseEndTime;

    // 课程id
    /**
     * @var string
     */
    public $courseId;

    // 课程名称
    /**
     * @var string
     */
    public $courseName;

    // 课程开始时间
    /**
     * @var string
     */
    public $courseStartTime;

    // 课程简介
    // 
    /**
     * @var string
     */
    public $courseSummary;

    // 课程类型
    // 1直播课程，2录播课程，3线下课程，4其他类型
    /**
     * @var int
     */
    public $courseType;

    // 企业id
    /**
     * @var string
     */
    public $orgDid;

    // 课程时长
    /**
     * @var int
     */
    public $period;

}
