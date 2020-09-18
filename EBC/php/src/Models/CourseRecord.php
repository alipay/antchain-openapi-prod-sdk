<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class CourseRecord extends Model {
    protected $_name = [
        'chapterId' => 'chapter_id',
        'classId' => 'class_id',
        'courseId' => 'course_id',
        'courseName' => 'course_name',
        'orgDid' => 'org_did',
        'orgUserId' => 'org_user_id',
        'recordExt' => 'record_ext',
        'recordId' => 'record_id',
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
        Model::validateMaxLength('recordId', $this->recordId, 128);
        Model::validateMaxLength('recordSource', $this->recordSource, 128);
        Model::validatePattern('recordOpenTime', $this->recordOpenTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('recordStartTime', $this->recordStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
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
        if (null !== $this->recordId) {
            $res['record_id'] = $this->recordId;
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
     * @return CourseRecord
     */
    public static function fromMap($map = []) {
        $model = new self();
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
        if(isset($map['record_id'])){
            $model->recordId = $map['record_id'];
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
    // 链上章节id
    // 
    /**
     * @example 123
     * @var string
     */
    public $chapterId;

    // 班级id
    /**
     * @example 123
     * @var string
     */
    public $classId;

    // 课程id
    /**
     * @example 123
     * @var string
     */
    public $courseId;

    // 课程名称
    /**
     * @example 课程名称
     * @var string
     */
    public $courseName;

    // 企业did
    /**
     * @example did:mychain:66530b21a9bee783234c442b653e909136629a5a3075be7b4d9ae085782e3d36
     * @var string
     */
    public $orgDid;

    // 企业用户id
    // 
    /**
     * @example 123
     * @var string
     */
    public $orgUserId;

    // 课程扩展信息，格式为json。比如钉钉用户id。
    /**
     * @example {"name":"张三"}
     * @var string
     */
    public $recordExt;

    // 记录id
    /**
     * @example 123
     * @var string
     */
    public $recordId;

    // 本次开启时间
    // 
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $recordOpenTime;

    // 本次观看时长，单位秒
    /**
     * @example 100
     * @var int
     */
    public $recordPeriod;

    // 行为来源
    /**
     * @example 钉钉直播
     * @var string
     */
    public $recordSource;

    // 本次点击观看时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $recordStartTime;

}
