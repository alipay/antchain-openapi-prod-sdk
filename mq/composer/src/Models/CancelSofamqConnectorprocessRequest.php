<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class CancelSofamqConnectorprocessRequest extends Model
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
    public $jobName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'jobName'           => 'job_name',
    ];

    public function validate()
    {
        Model::validateRequired('jobName', $this->jobName, true);
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
        if (null !== $this->jobName) {
            $res['job_name'] = $this->jobName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelSofamqConnectorprocessRequest
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
        if (isset($map['job_name'])) {
            $model->jobName = $map['job_name'];
        }

        return $model;
    }
}
