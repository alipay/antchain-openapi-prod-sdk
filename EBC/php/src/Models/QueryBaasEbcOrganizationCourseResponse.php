<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\EBC\Models\Class_;
use AntChain\EBC\Models\OrgUser;

class QueryBaasEbcOrganizationCourseResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'courseClassList' => 'course_class_list',
        'courseDescription' => 'course_description',
        'courseEndTime' => 'course_end_time',
        'courseModifyTime' => 'course_modify_time',
        'courseName' => 'course_name',
        'courseOrgUserList' => 'course_org_user_list',
        'courseStartTime' => 'course_start_time',
        'courseStatus' => 'course_status',
        'courseSummary' => 'course_summary',
        'period' => 'period',
    ];
    public function validate() {
        Model::validatePattern('courseEndTime', $this->courseEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('courseModifyTime', $this->courseModifyTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
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
        if (null !== $this->courseClassList) {
            $res['course_class_list'] = [];
            if(null !== $this->courseClassList && is_array($this->courseClassList)){
                $n = 0;
                foreach($this->courseClassList as $item){
                    $res['course_class_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->courseDescription) {
            $res['course_description'] = $this->courseDescription;
        }
        if (null !== $this->courseEndTime) {
            $res['course_end_time'] = $this->courseEndTime;
        }
        if (null !== $this->courseModifyTime) {
            $res['course_modify_time'] = $this->courseModifyTime;
        }
        if (null !== $this->courseName) {
            $res['course_name'] = $this->courseName;
        }
        if (null !== $this->courseOrgUserList) {
            $res['course_org_user_list'] = [];
            if(null !== $this->courseOrgUserList && is_array($this->courseOrgUserList)){
                $n = 0;
                foreach($this->courseOrgUserList as $item){
                    $res['course_org_user_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
        if(isset($map['course_class_list'])){
            if(!empty($map['course_class_list'])){
                $model->courseClassList = [];
                $n = 0;
                foreach($map['course_class_list'] as $item) {
                    $model->courseClassList[$n++] = null !== $item ? Class_::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['course_description'])){
            $model->courseDescription = $map['course_description'];
        }
        if(isset($map['course_end_time'])){
            $model->courseEndTime = $map['course_end_time'];
        }
        if(isset($map['course_modify_time'])){
            $model->courseModifyTime = $map['course_modify_time'];
        }
        if(isset($map['course_name'])){
            $model->courseName = $map['course_name'];
        }
        if(isset($map['course_org_user_list'])){
            if(!empty($map['course_org_user_list'])){
                $model->courseOrgUserList = [];
                $n = 0;
                foreach($map['course_org_user_list'] as $item) {
                    $model->courseOrgUserList[$n++] = null !== $item ? OrgUser::fromMap($item) : $item;
                }
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
     * @var Class_[]
     */
    public $courseClassList;

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

    // 课程最近一次修改时间
    /**
     * @var string
     */
    public $courseModifyTime;

    // 课程名称
    /**
     * @var string
     */
    public $courseName;

    // 课程学员列表
    /**
     * @var OrgUser[]
     */
    public $courseOrgUserList;

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
