<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class QueryBaasEbcOrganizationCourseResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'courseClassIdList' => 'course_class_id_list',
        'courseDescription' => 'course_description',
        'courseEndTime' => 'course_end_time',
        'courseName' => 'course_name',
        'courseOrgUserIdList' => 'course_org_user_id_list',
        'courseStartTime' => 'course_start_time',
        'courseStatus' => 'course_status',
        'courseSummary' => 'course_summary',
        'period' => 'period',
    ];
    public function validate() {
        Model::validatePattern('courseEndTime', $this->courseEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('courseStartTime', $this->courseStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
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
        if (null !== $this->courseClassIdList) {
            $res['course_class_id_list'] = $this->courseClassIdList;
        }
        if (null !== $this->courseDescription) {
            $res['course_description'] = $this->courseDescription;
        }
        if (null !== $this->courseEndTime) {
            $res['course_end_time'] = $this->courseEndTime;
        }
        if (null !== $this->courseName) {
            $res['course_name'] = $this->courseName;
        }
        if (null !== $this->courseOrgUserIdList) {
            $res['course_org_user_id_list'] = $this->courseOrgUserIdList;
        }
        if (null !== $this->courseStartTime) {
            $res['course_start_time'] = $this->courseStartTime;
        }
        if (null !== $this->courseStatus) {
            $res['course_status'] = $this->courseStatus;
        }
        if (null !== $this->courseSummary) {
            $res['course_summary'] = $this->courseSummary;
        }
        if (null !== $this->period) {
            $res['period'] = $this->period;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBaasEbcOrganizationCourseResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['course_class_id_list'])){
            if(!empty($map['course_class_id_list'])){
                $model->courseClassIdList = $map['course_class_id_list'];
            }
        }
        if(isset($map['course_description'])){
            $model->courseDescription = $map['course_description'];
        }
        if(isset($map['course_end_time'])){
            $model->courseEndTime = $map['course_end_time'];
        }
        if(isset($map['course_name'])){
            $model->courseName = $map['course_name'];
        }
        if(isset($map['course_org_user_id_list'])){
            if(!empty($map['course_org_user_id_list'])){
                $model->courseOrgUserIdList = $map['course_org_user_id_list'];
            }
        }
        if(isset($map['course_start_time'])){
            $model->courseStartTime = $map['course_start_time'];
        }
        if(isset($map['course_status'])){
            $model->courseStatus = $map['course_status'];
        }
        if(isset($map['course_summary'])){
            $model->courseSummary = $map['course_summary'];
        }
        if(isset($map['period'])){
            $model->period = $map['period'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 课程班级列表
    /**
     * @var string[]
     */
    public $courseClassIdList;

    // 课程描述
    /**
     * @var string
     */
    public $courseDescription;

    // 课程结束时间
    // 
    /**
     * @var string
     */
    public $courseEndTime;

    // 课程名称
    /**
     * @var string
     */
    public $courseName;

    // 课程学员列表
    /**
     * @var string[]
     */
    public $courseOrgUserIdList;

    // 课程开始时间
    // 
    /**
     * @var string
     */
    public $courseStartTime;

    // 1:已发布,2:进行中,3:已结束
    /**
     * @var int
     */
    public $courseStatus;

    // 课程简介
    /**
     * @var string
     */
    public $courseSummary;

    // 课程时长
    // 
    /**
     * @var int
     */
    public $period;

}
