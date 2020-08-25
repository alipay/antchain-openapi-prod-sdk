<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class UpdateBaasEbcOrganizationCourseRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'courseEndTime' => 'course_end_time',
        'courseId' => 'course_id',
        'courseName' => 'course_name',
        'courseStartTime' => 'course_start_time',
        'orgDid' => 'org_did',
        'period' => 'period',
    ];
    public function validate() {
        Model::validatePattern('courseEndTime', $this->courseEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('courseStartTime', $this->courseStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validateMaxLength('courseId', $this->courseId, 128);
        Model::validateMaxLength('courseName', $this->courseName, 64);
        Model::validateMaxLength('orgDid', $this->orgDid, 128);
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
