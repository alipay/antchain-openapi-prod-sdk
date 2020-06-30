<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class QueryOrganizationClassResponse extends Model {
    protected $_name = [
        'className' => 'class_name',
        'classStatus' => 'class_status',
        'createTime' => 'create_time',
        'modifyTime' => 'modify_time',
        'period' => 'period',
        'type' => 'type',
        'userNum' => 'user_num',
    ];
    public function validate() {
        Model::validatePattern('createTime', $this->createTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?');
        Model::validatePattern('modifyTime', $this->modifyTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}(\\s\\d{2}:\\d{2}(:\\d{2})?)?');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->className) {
            $res['class_name'] = $this->className;
        }
        if (null !== $this->classStatus) {
            $res['class_status'] = $this->classStatus;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->modifyTime) {
            $res['modify_time'] = $this->modifyTime;
        }
        if (null !== $this->period) {
            $res['period'] = $this->period;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->userNum) {
            $res['user_num'] = $this->userNum;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryOrganizationClassResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['class_name'])){
            $model->className = $map['class_name'];
        }
        if(isset($map['class_status'])){
            $model->classStatus = $map['class_status'];
        }
        if(isset($map['create_time'])){
            $model->createTime = $map['create_time'];
        }
        if(isset($map['modify_time'])){
            $model->modifyTime = $map['modify_time'];
        }
        if(isset($map['period'])){
            $model->period = $map['period'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['user_num'])){
            $model->userNum = $map['user_num'];
        }
        return $model;
    }
    /**
     * @description 班级名称
     * @example 101班
     * @var string
     */
    public $className;

    /**
     * @description 1:有效、2:暂停、3:失效
     * @example 1
     * @var integer
     */
    public $classStatus;

    /**
     * @description 创建时间
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $createTime;

    /**
     * @description 修改时间
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $modifyTime;

    /**
     * @description 累计时长
     * @example 单位秒
     * @var integer
     */
    public $period;

    /**
     * @description 班级类型：线上、线下、混合
     * @example 线上
     * @var string
     */
    public $type;

    /**
     * @description 学员数量
     * @example 100
     * @var integer
     */
    public $userNum;

}
