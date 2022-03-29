<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class QuerySofamqConnectorjobpartitionstatusRequest extends Model
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

    // 页码
    /**
     * @var int
     */
    public $pageNum;

    // 每页大小
    /**
     * @var int
     */
    public $pageSize;

    // 作业名称
    /**
     * @var string
     */
    public $job;

    // 实例id
    /**
     * @var string
     */
    public $planId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'pageNum'           => 'page_num',
        'pageSize'          => 'page_size',
        'job'               => 'job',
        'planId'            => 'plan_id',
    ];

    public function validate()
    {
        Model::validateRequired('pageNum', $this->pageNum, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('job', $this->job, true);
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
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->job) {
            $res['job'] = $this->job;
        }
        if (null !== $this->planId) {
            $res['plan_id'] = $this->planId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySofamqConnectorjobpartitionstatusRequest
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
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['job'])) {
            $model->job = $map['job'];
        }
        if (isset($map['plan_id'])) {
            $model->planId = $map['plan_id'];
        }

        return $model;
    }
}
