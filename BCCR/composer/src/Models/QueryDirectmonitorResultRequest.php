<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class QueryDirectmonitorResultRequest extends Model
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

    // 监测任务id
    /**
     * @var string
     */
    public $monitorTaskId;

    // 页面大小(1-200)
    /**
     * @var int
     */
    public $pageSize;

    // 页码(>0)
    /**
     * @var int
     */
    public $pageIndex;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'monitorTaskId'     => 'monitor_task_id',
        'pageSize'          => 'page_size',
        'pageIndex'         => 'page_index',
    ];

    public function validate()
    {
        Model::validateRequired('monitorTaskId', $this->monitorTaskId, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('pageIndex', $this->pageIndex, true);
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
        if (null !== $this->monitorTaskId) {
            $res['monitor_task_id'] = $this->monitorTaskId;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDirectmonitorResultRequest
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
        if (isset($map['monitor_task_id'])) {
            $model->monitorTaskId = $map['monitor_task_id'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['page_index'])) {
            $model->pageIndex = $map['page_index'];
        }

        return $model;
    }
}
