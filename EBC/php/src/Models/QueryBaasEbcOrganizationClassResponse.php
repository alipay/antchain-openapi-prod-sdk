<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class QueryBaasEbcOrganizationClassResponse extends Model
{
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

    // 班级名称
    /**
     * @var string
     */
    public $className;

    // 1:有效、2:暂停、3:失效
    /**
     * @var int
     */
    public $classStatus;

    // 创建时间
    /**
     * @var string
     */
    public $createTime;

    // 修改时间
    /**
     * @var string
     */
    public $modifyTime;

    // 累计时长
    /**
     * @var int
     */
    public $period;

    // 班级类型：线上、线下、混合
    /**
     * @var string
     */
    public $type;

    // 学员数量
    /**
     * @var int
     */
    public $userNum;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'className'   => 'class_name',
        'classStatus' => 'class_status',
        'createTime'  => 'create_time',
        'modifyTime'  => 'modify_time',
        'period'      => 'period',
        'type'        => 'type',
        'userNum'     => 'user_num',
    ];

    public function validate()
    {
        Model::validatePattern('createTime', $this->createTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('modifyTime', $this->modifyTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }

    public function toMap()
    {
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
     *
     * @return QueryBaasEbcOrganizationClassResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['class_name'])) {
            $model->className = $map['class_name'];
        }
        if (isset($map['class_status'])) {
            $model->classStatus = $map['class_status'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['modify_time'])) {
            $model->modifyTime = $map['modify_time'];
        }
        if (isset($map['period'])) {
            $model->period = $map['period'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['user_num'])) {
            $model->userNum = $map['user_num'];
        }

        return $model;
    }
}
