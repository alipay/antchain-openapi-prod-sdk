<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UpdateServiceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // cluster name to apply a service
    /**
     * @var string
     */
    public $clusterName;

    // a string service yaml
    /**
     * @var string
     */
    public $rawTemplate;

    // xxx
    /**
     * @var string
     */
    public $operator;
    protected $_name = [
        'authToken'   => 'auth_token',
        'clusterName' => 'cluster_name',
        'rawTemplate' => 'raw_template',
        'operator'    => 'operator',
    ];

    public function validate()
    {
        Model::validateRequired('clusterName', $this->clusterName, true);
        Model::validateRequired('rawTemplate', $this->rawTemplate, true);
        Model::validateRequired('operator', $this->operator, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->clusterName) {
            $res['cluster_name'] = $this->clusterName;
        }
        if (null !== $this->rawTemplate) {
            $res['raw_template'] = $this->rawTemplate;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateServiceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['cluster_name'])) {
            $model->clusterName = $map['cluster_name'];
        }
        if (isset($map['raw_template'])) {
            $model->rawTemplate = $map['raw_template'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }

        return $model;
    }
}
