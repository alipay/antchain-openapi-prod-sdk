<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class UpdateOrganizationCourseRequest extends Model {
    protected $_name = [
        'courseEndTime' => 'course_end_time',
        'courseId' => 'course_id',
        'courseName' => 'course_name',
        'courseStartTime' => 'course_start_time',
        'orgDid' => 'org_did',
        'period' => 'period',
    ];
    public function validate() {
        Model::validatePattern('courseEndTime', $this->courseEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?');
        Model::validatePattern('courseStartTime', $this->courseStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?');
        Model::validateMaxLength('courseId', $this->courseId, 128);
        Model::validateMaxLength('courseName', $this->courseName, 64);
        Model::validateMaxLength('orgDid', $this->orgDid, 128);
    }
    public function toMap() {
        $res = [];
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
     * @return UpdateOrganizationCourseRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
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
     * @description 课程结束时间
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $courseEndTime;

    /**
     * @description 课程id
     * @example 0001
     * @var string
     */
    public $courseId;

    /**
     * @description 课程名称
     * @example 高数
     * @var string
     */
    public $courseName;

    /**
     * @description 课程开始时间
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $courseStartTime;

    /**
     * @description 企业id
     * @example did:mychain:66530b21a9bee783234c442b653e909136629a5a3075be7b4d9ae085782e3d36 
     * @var string
     */
    public $orgDid;

    /**
     * @description 课程时长
     * @example 100
     * @var integer
     */
    public $period;

}
