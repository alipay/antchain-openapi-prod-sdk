<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class QueryDciContentsecurityRequest extends Model
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

    // 任务ID(数登流水号)
    /**
     * @var string
     */
    public $flowNumber;

    // 客户端令牌
    /**
     * @var string
     */
    public $clientToken;

    // 任务Id, 已废弃
    /**
     * @var string
     */
    public $taskId;

    // 作品名，已废弃
    /**
     * @var string
     */
    public $workName;

    // 作品Hash，已废弃
    /**
     * @var string
     */
    public $workHash;

    // 作品分类，已废弃
    /**
     * @var string
     */
    public $workCategory;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'flowNumber'        => 'flow_number',
        'clientToken'       => 'client_token',
        'taskId'            => 'task_id',
        'workName'          => 'work_name',
        'workHash'          => 'work_hash',
        'workCategory'      => 'work_category',
    ];

    public function validate()
    {
        Model::validateRequired('flowNumber', $this->flowNumber, true);
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
        if (null !== $this->flowNumber) {
            $res['flow_number'] = $this->flowNumber;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->workName) {
            $res['work_name'] = $this->workName;
        }
        if (null !== $this->workHash) {
            $res['work_hash'] = $this->workHash;
        }
        if (null !== $this->workCategory) {
            $res['work_category'] = $this->workCategory;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDciContentsecurityRequest
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
        if (isset($map['flow_number'])) {
            $model->flowNumber = $map['flow_number'];
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['work_name'])) {
            $model->workName = $map['work_name'];
        }
        if (isset($map['work_hash'])) {
            $model->workHash = $map['work_hash'];
        }
        if (isset($map['work_category'])) {
            $model->workCategory = $map['work_category'];
        }

        return $model;
    }
}
