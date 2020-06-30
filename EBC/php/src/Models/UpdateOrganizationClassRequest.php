<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class UpdateOrganizationClassRequest extends Model {
    protected $_name = [
        'capacity' => 'capacity',
        'classEndTime' => 'class_end_time',
        'classId' => 'class_id',
        'className' => 'class_name',
        'classStartTime' => 'class_start_time',
        'classStatus' => 'class_status',
        'orgDid' => 'org_did',
    ];
    public function validate() {
        Model::validatePattern('classEndTime', $this->classEndTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?');
        Model::validatePattern('classStartTime', $this->classStartTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?');
        Model::validateMaxLength('classId', $this->classId, 128);
        Model::validateMaxLength('className', $this->className, 64);
        Model::validateMaxLength('orgDid', $this->orgDid, 128);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->capacity) {
            $res['capacity'] = $this->capacity;
        }
        if (null !== $this->classEndTime) {
            $res['class_end_time'] = $this->classEndTime;
        }
        if (null !== $this->classId) {
            $res['class_id'] = $this->classId;
        }
        if (null !== $this->className) {
            $res['class_name'] = $this->className;
        }
        if (null !== $this->classStartTime) {
            $res['class_start_time'] = $this->classStartTime;
        }
        if (null !== $this->classStatus) {
            $res['class_status'] = $this->classStatus;
        }
        if (null !== $this->orgDid) {
            $res['org_did'] = $this->orgDid;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateOrganizationClassRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['capacity'])){
            $model->capacity = $map['capacity'];
        }
        if(isset($map['class_end_time'])){
            $model->classEndTime = $map['class_end_time'];
        }
        if(isset($map['class_id'])){
            $model->classId = $map['class_id'];
        }
        if(isset($map['class_name'])){
            $model->className = $map['class_name'];
        }
        if(isset($map['class_start_time'])){
            $model->classStartTime = $map['class_start_time'];
        }
        if(isset($map['class_status'])){
            $model->classStatus = $map['class_status'];
        }
        if(isset($map['org_did'])){
            $model->orgDid = $map['org_did'];
        }
        return $model;
    }
    /**
     * @description 容量
     * @example 123
     * @var integer
     */
    public $capacity;

    /**
     * @description 结束时间
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $classEndTime;

    /**
     * @description 班级id
     * @example 0001
     * @var string
     */
    public $classId;

    /**
     * @description 班级名称
     * @example 001
     * @var string
     */
    public $className;

    /**
     * @description 开始时间
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $classStartTime;

    /**
     * @description 1:有效、2:暂停、3:失效
     * @example 1
     * @var integer
     */
    public $classStatus;

    /**
     * @description 企业did
     * @example did:mychain:66530b21a9bee783234c442b653e909136629a5a3075be7b4d9ae085782e3d36 
     * @var string
     */
    public $orgDid;

}
