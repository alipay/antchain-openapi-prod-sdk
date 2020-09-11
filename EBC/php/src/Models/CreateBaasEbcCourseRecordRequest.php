<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class CreateBaasEbcCourseRecordRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'chapterId' => 'chapter_id',
        'classId' => 'class_id',
        'courseId' => 'course_id',
        'courseName' => 'course_name',
        'orgDid' => 'org_did',
        'orgUserId' => 'org_user_id',
        'recordExt' => 'record_ext',
        'recordOpenTime' => 'record_open_time',
        'recordPeriod' => 'record_period',
        'recordSource' => 'record_source',
        'recordStartTime' => 'record_start_time',
    ];
    public function validate() {
        Model::validateMaxLength('chapterId', $this->chapterId, 128);
        Model::validateMaxLength('classId', $this->classId, 128);
        Model::validateMaxLength('courseId', $this->courseId, 128);
        Model::validateMaxLength('courseName', $this->courseName, 128);
        Model::validateMaxLength('orgDid', $this->orgDid, 128);
        Model::validateMaxLength('orgUserId', $this->orgUserId, 128);
        Model::validateMaxLength('recordExt', $this->recordExt, 2000);
        Model::validateMaxLength('recordSource', $this->recordSource, 128);
        Model::validatePattern('recordOpenTime', $this->recordOpenTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('recordStartTime', $this->recordStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
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
        if (null !== $this->chapterId) {
            $res['chapter_id'] = $this->chapterId;
        }
        if (null !== $this->classId) {
            $res['class_id'] = $this->classId;
        }
        if (null !== $this->courseId) {
            $res['course_id'] = $this->courseId;
        }
        if (null !== $this->courseName) {
            $res['course_name'] = $this->courseName;
        }
        if (null !== $this->orgDid) {
            $res['org_did'] = $this->orgDid;
        }
        if (null !== $this->orgUserId) {
            $res['org_user_id'] = $this->orgUserId;
        }
        if (null !== $this->recordExt) {
            $res['record_ext'] = $this->recordExt;
        }
        if (null !== $this->recordOpenTime) {
            $res['record_open_time'] = $this->recordOpenTime;
        }
        if (null !== $this->recordPeriod) {
            $res['record_period'] = $this->recordPeriod;
        }
        if (null !== $this->recordSource) {
            $res['record_source'] = $this->recordSource;
        }
        if (null !== $this->recordStartTime) {
            $res['record_start_time'] = $this->recordStartTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateBaasEbcCourseRecordRequest
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
        if(isset($map['chapter_id'])){
            $model->chapterId = $map['chapter_id'];
        }
        if(isset($map['class_id'])){
            $model->classId = $map['class_id'];
        }
        if(isset($map['course_id'])){
            $model->courseId = $map['course_id'];
        }
        if(isset($map['course_name'])){
            $model->courseName = $map['course_name'];
        }
        if(isset($map['org_did'])){
            $model->orgDid = $map['org_did'];
        }
        if(isset($map['org_user_id'])){
            $model->orgUserId = $map['org_user_id'];
        }
        if(isset($map['record_ext'])){
            $model->recordExt = $map['record_ext'];
        }
        if(isset($map['record_open_time'])){
            $model->recordOpenTime = $map['record_open_time'];
        }
        if(isset($map['record_period'])){
            $model->recordPeriod = $map['record_period'];
        }
        if(isset($map['record_source'])){
            $model->recordSource = $map['record_source'];
        }
        if(isset($map['record_start_time'])){
            $model->recordStartTime = $map['record_start_time'];
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

    // 链上章节id
    /**
     * @var string
     */
    public $chapterId;

    // 链上班级id
    /**
     * @var string
     */
    public $classId;

    // 链上课程id
    /**
     * @var string
     */
    public $courseId;

    // 课程名称
    /**
     * @var string
     */
    public $courseName;

    // 企业did
    // 
    /**
     * @var string
     */
    public $orgDid;

    // 企业用户id
    /**
     * @var string
     */
    public $orgUserId;

    // 课程扩展信息，格式为json。比如钉钉用户id。
    /**
     * @var string
     */
    public $recordExt;

    // 本次开启时间
    /**
     * @var string
     */
    public $recordOpenTime;

    // 本次观看时长，单位秒
    /**
     * @var int
     */
    public $recordPeriod;

    // 行为来源
    /**
     * @var string
     */
    public $recordSource;

    // 本次点击观看时间
    /**
     * @var string
     */
    public $recordStartTime;

}
