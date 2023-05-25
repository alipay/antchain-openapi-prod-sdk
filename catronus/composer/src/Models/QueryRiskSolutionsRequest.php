<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRiskSolutionsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 风险解决方案名称
    /**
     * @var string
     */
    public $name;

    // 风险ID
    /**
     * @var string
     */
    public $riskId;

    // 当前页
    /**
     * @var int
     */
    public $page;

    // 页大小
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken' => 'auth_token',
        'name'      => 'name',
        'riskId'    => 'risk_id',
        'page'      => 'page',
        'pageSize'  => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('page', $this->page, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->riskId) {
            $res['risk_id'] = $this->riskId;
        }
        if (null !== $this->page) {
            $res['page'] = $this->page;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRiskSolutionsRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['risk_id'])) {
            $model->riskId = $map['risk_id'];
        }
        if (isset($map['page'])) {
            $model->page = $map['page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
