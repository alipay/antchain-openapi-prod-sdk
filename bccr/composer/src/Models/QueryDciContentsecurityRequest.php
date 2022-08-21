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

    // 任务ID
    /**
     * @var string
     */
    public $taskId;

    // 作品名称
    /**
     * @var string
     */
    public $workName;

    // 作品哈希
    /**
     * @var string
     */
    public $workHash;

    // 作品类型
    /**
     * @var string
     */
    public $workCategory;

    // 客户端令牌
    /**
     * @var string
     */
    public $clientToken;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'taskId'            => 'task_id',
        'workName'          => 'work_name',
        'workHash'          => 'work_hash',
        'workCategory'      => 'work_category',
        'clientToken'       => 'client_token',
    ];

    public function validate()
    {
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('workName', $this->workName, true);
        Model::validateRequired('workHash', $this->workHash, true);
        Model::validateRequired('workCategory', $this->workCategory, true);
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
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
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
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }

        return $model;
    }
}
