<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class PagequerySolutionOpsplanRequest extends Model
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

    // 解决方案Id
    /**
     * @var string
     */
    public $solutionId;

    // 环境Id
    /**
     * @var string
     */
    public $envId;

    // 当前页
    /**
     * @var string
     */
    public $currentPage;

    // 分页大小
    /**
     * @var string
     */
    public $pageSize;

    // RELEASE
    /**
     * @var string
     */
    public $planType;

    // FAILED
    /**
     * @var string
     */
    public $opsPlanStatus;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'solutionId'        => 'solution_id',
        'envId'             => 'env_id',
        'currentPage'       => 'current_page',
        'pageSize'          => 'page_size',
        'planType'          => 'plan_type',
        'opsPlanStatus'     => 'ops_plan_status',
    ];

    public function validate()
    {
        Model::validateRequired('solutionId', $this->solutionId, true);
        Model::validateRequired('envId', $this->envId, true);
        Model::validateRequired('currentPage', $this->currentPage, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('planType', $this->planType, true);
        Model::validateRequired('opsPlanStatus', $this->opsPlanStatus, true);
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
        if (null !== $this->solutionId) {
            $res['solution_id'] = $this->solutionId;
        }
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->planType) {
            $res['plan_type'] = $this->planType;
        }
        if (null !== $this->opsPlanStatus) {
            $res['ops_plan_status'] = $this->opsPlanStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequerySolutionOpsplanRequest
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
        if (isset($map['solution_id'])) {
            $model->solutionId = $map['solution_id'];
        }
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['plan_type'])) {
            $model->planType = $map['plan_type'];
        }
        if (isset($map['ops_plan_status'])) {
            $model->opsPlanStatus = $map['ops_plan_status'];
        }

        return $model;
    }
}
