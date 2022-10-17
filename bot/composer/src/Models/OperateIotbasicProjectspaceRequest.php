<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class OperateIotbasicProjectspaceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 项目空间id
    /**
     * @var int
     */
    public $id;

    // 项目名称
    /**
     * @var string
     */
    public $projectName;

    // 项目编码（device_base表字段biz_scene）
    /**
     * @var string
     */
    public $projectCode;

    // 项目描述
    /**
     * @var string
     */
    public $projectDesc;

    // 项目负责人（PD）
    /**
     * @var string
     */
    public $projectLeader;

    // 上链ID（数据上到哪个业务链）
    /**
     * @var string
     */
    public $upchainId;

    // 上链方式（通过IOT可信平台，banRest）
    /**
     * @var string
     */
    public $upchainType;

    // 上链参数（账号，秘钥），json字符串格式
    /**
     * @var string
     */
    public $upchainParams;

    // 是否上链
    /**
     * @var bool
     */
    public $isUpchain;

    // 操作类型
    /**
     * @var string
     */
    public $action;

    // 操作人id
    /**
     * @var string
     */
    public $operatorId;

    // 参数签名校验
    /**
     * @var string
     */
    public $paramSign;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'id'                => 'id',
        'projectName'       => 'project_name',
        'projectCode'       => 'project_code',
        'projectDesc'       => 'project_desc',
        'projectLeader'     => 'project_leader',
        'upchainId'         => 'upchain_id',
        'upchainType'       => 'upchain_type',
        'upchainParams'     => 'upchain_params',
        'isUpchain'         => 'is_upchain',
        'action'            => 'action',
        'operatorId'        => 'operator_id',
        'paramSign'         => 'param_sign',
    ];

    public function validate()
    {
        Model::validateRequired('action', $this->action, true);
        Model::validateRequired('operatorId', $this->operatorId, true);
        Model::validateRequired('paramSign', $this->paramSign, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->projectCode) {
            $res['project_code'] = $this->projectCode;
        }
        if (null !== $this->projectDesc) {
            $res['project_desc'] = $this->projectDesc;
        }
        if (null !== $this->projectLeader) {
            $res['project_leader'] = $this->projectLeader;
        }
        if (null !== $this->upchainId) {
            $res['upchain_id'] = $this->upchainId;
        }
        if (null !== $this->upchainType) {
            $res['upchain_type'] = $this->upchainType;
        }
        if (null !== $this->upchainParams) {
            $res['upchain_params'] = $this->upchainParams;
        }
        if (null !== $this->isUpchain) {
            $res['is_upchain'] = $this->isUpchain;
        }
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->operatorId) {
            $res['operator_id'] = $this->operatorId;
        }
        if (null !== $this->paramSign) {
            $res['param_sign'] = $this->paramSign;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateIotbasicProjectspaceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }
        if (isset($map['project_code'])) {
            $model->projectCode = $map['project_code'];
        }
        if (isset($map['project_desc'])) {
            $model->projectDesc = $map['project_desc'];
        }
        if (isset($map['project_leader'])) {
            $model->projectLeader = $map['project_leader'];
        }
        if (isset($map['upchain_id'])) {
            $model->upchainId = $map['upchain_id'];
        }
        if (isset($map['upchain_type'])) {
            $model->upchainType = $map['upchain_type'];
        }
        if (isset($map['upchain_params'])) {
            $model->upchainParams = $map['upchain_params'];
        }
        if (isset($map['is_upchain'])) {
            $model->isUpchain = $map['is_upchain'];
        }
        if (isset($map['action'])) {
            $model->action = $map['action'];
        }
        if (isset($map['operator_id'])) {
            $model->operatorId = $map['operator_id'];
        }
        if (isset($map['param_sign'])) {
            $model->paramSign = $map['param_sign'];
        }

        return $model;
    }
}
