<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_9705ae7650f74f47b1e8158151cc122f\Models;

use AlibabaCloud\Tea\Model;

class RefuseBlockchainBccrDciRegistrationRequest extends Model
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

    // 复审失败原因
    /**
     * @var string
     */
    public $code;

    // 失败详情
    /**
     * @var string
     */
    public $failDetail;

    // 幂等字段
    /**
     * @var string
     */
    public $clientToken;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'taskId'            => 'task_id',
        'code'              => 'code',
        'failDetail'        => 'fail_detail',
        'clientToken'       => 'client_token',
    ];

    public function validate()
    {
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('failDetail', $this->failDetail, true);
        Model::validateRequired('clientToken', $this->clientToken, true);
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
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->failDetail) {
            $res['fail_detail'] = $this->failDetail;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RefuseBlockchainBccrDciRegistrationRequest
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
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['fail_detail'])) {
            $model->failDetail = $map['fail_detail'];
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }

        return $model;
    }
}
