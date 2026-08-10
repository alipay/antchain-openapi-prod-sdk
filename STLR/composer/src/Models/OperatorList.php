<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class OperatorList extends Model {
    protected $_name = [
        'operatorId' => 'operator_id',
        'operatorName' => 'operator_name',
        'email' => 'email',
        'cellPhone' => 'cell_phone',
        'nickName' => 'nick_name',
        'createTime' => 'create_time',
        'status' => 'status',
        'supervisor' => 'supervisor',
    ];
    public function validate() {
        Model::validateRequired('operatorId', $this->operatorId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->operatorId) {
            $res['operator_id'] = $this->operatorId;
        }
        if (null !== $this->operatorName) {
            $res['operator_name'] = $this->operatorName;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->cellPhone) {
            $res['cell_phone'] = $this->cellPhone;
        }
        if (null !== $this->nickName) {
            $res['nick_name'] = $this->nickName;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->supervisor) {
            $res['supervisor'] = $this->supervisor;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OperatorList
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['operator_id'])){
            $model->operatorId = $map['operator_id'];
        }
        if(isset($map['operator_name'])){
            $model->operatorName = $map['operator_name'];
        }
        if(isset($map['email'])){
            $model->email = $map['email'];
        }
        if(isset($map['cell_phone'])){
            $model->cellPhone = $map['cell_phone'];
        }
        if(isset($map['nick_name'])){
            $model->nickName = $map['nick_name'];
        }
        if(isset($map['create_time'])){
            $model->createTime = $map['create_time'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['supervisor'])){
            $model->supervisor = $map['supervisor'];
        }
        return $model;
    }
    // 操作员 ID。
    /**
     * @example xxxxxx
     * @var string
     */
    public $operatorId;

    // 操作员姓名。
    /**
     * @example xxxxxx
     * @var string
     */
    public $operatorName;

    // 登录邮箱。
    /**
     * @example xxxxxx
     * @var string
     */
    public $email;

    // 手机号。
    /**
     * @example xxxxxx
     * @var string
     */
    public $cellPhone;

    // 昵称。
    /**
     * @example xxxxxx
     * @var string
     */
    public $nickName;

    // 创建时间
    /**
     * @example xxxxxx
     * @var string
     */
    public $createTime;

    // 操作员状态。
    /**
     * @example xxxxxx
     * @var string
     */
    public $status;

    // 是否为超级管理员。
    /**
     * @example xxxxxx
     * @var bool
     */
    public $supervisor;

}
