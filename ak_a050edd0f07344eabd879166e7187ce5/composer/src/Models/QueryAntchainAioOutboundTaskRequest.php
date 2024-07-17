<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_a050edd0f07344eabd879166e7187ce5\Models;

use AlibabaCloud\Tea\Model;

class QueryAntchainAioOutboundTaskRequest extends Model
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

    // 任务名称
    /**
     * @var string
     */
    public $name;

    // 外呼流程id
    /**
     * @var int
     */
    public $flowId;

    // 环境区分
    /**
     * @var string
     */
    public $env;

    // 与env对应
    /**
     * @var string
     */
    public $ldcName;

    // 根据状态过滤数据
    /**
     * @var string
     */
    public $status;

    // 租户id
    /**
     * @var string
     */
    public $tntInstId;

    // 业务id
    /**
     * @var string
     */
    public $bizCode;

    // 当前页码
    /**
     * @var int
     */
    public $currentPage;

    // 每页数据个数
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'name'              => 'name',
        'flowId'            => 'flow_id',
        'env'               => 'env',
        'ldcName'           => 'ldc_name',
        'status'            => 'status',
        'tntInstId'         => 'tnt_inst_id',
        'bizCode'           => 'biz_code',
        'currentPage'       => 'current_page',
        'pageSize'          => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('env', $this->env, true);
        Model::validateRequired('ldcName', $this->ldcName, true);
        Model::validateRequired('tntInstId', $this->tntInstId, true);
        Model::validateRequired('bizCode', $this->bizCode, true);
        Model::validateRequired('currentPage', $this->currentPage, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->env) {
            $res['env'] = $this->env;
        }
        if (null !== $this->ldcName) {
            $res['ldc_name'] = $this->ldcName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tntInstId) {
            $res['tnt_inst_id'] = $this->tntInstId;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntchainAioOutboundTaskRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['env'])) {
            $model->env = $map['env'];
        }
        if (isset($map['ldc_name'])) {
            $model->ldcName = $map['ldc_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['tnt_inst_id'])) {
            $model->tntInstId = $map['tnt_inst_id'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
