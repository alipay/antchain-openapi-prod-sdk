<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryMydidcommunWorkergroupWorkflowRequest extends Model
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

    // 工作流对应的部署Id
    /**
     * @var int
     */
    public $podId;

    // 版本号
    /**
     * @var int
     */
    public $podVersion;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'podId'             => 'pod_id',
        'podVersion'        => 'pod_version',
    ];

    public function validate()
    {
        Model::validateRequired('podId', $this->podId, true);
        Model::validateRequired('podVersion', $this->podVersion, true);
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
        if (null !== $this->podId) {
            $res['pod_id'] = $this->podId;
        }
        if (null !== $this->podVersion) {
            $res['pod_version'] = $this->podVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMydidcommunWorkergroupWorkflowRequest
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
        if (isset($map['pod_id'])) {
            $model->podId = $map['pod_id'];
        }
        if (isset($map['pod_version'])) {
            $model->podVersion = $map['pod_version'];
        }

        return $model;
    }
}
