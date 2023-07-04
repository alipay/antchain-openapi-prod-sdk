<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class ImportSolutioninstanceRequest extends Model
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

    // 解决方案序列化后的结果
    /**
     * @var string
     */
    public $boxData;

    // 环境id
    /**
     * @var string
     */
    public $envId;

    // 操作人ID
    /**
     * @var string
     */
    public $submitterId;

    // 操作人名称
    /**
     * @var string
     */
    public $submitterName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'boxData'           => 'box_data',
        'envId'             => 'env_id',
        'submitterId'       => 'submitter_id',
        'submitterName'     => 'submitter_name',
    ];

    public function validate()
    {
        Model::validateRequired('boxData', $this->boxData, true);
        Model::validateRequired('envId', $this->envId, true);
        Model::validateRequired('submitterId', $this->submitterId, true);
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
        if (null !== $this->boxData) {
            $res['box_data'] = $this->boxData;
        }
        if (null !== $this->envId) {
            $res['env_id'] = $this->envId;
        }
        if (null !== $this->submitterId) {
            $res['submitter_id'] = $this->submitterId;
        }
        if (null !== $this->submitterName) {
            $res['submitter_name'] = $this->submitterName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportSolutioninstanceRequest
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
        if (isset($map['box_data'])) {
            $model->boxData = $map['box_data'];
        }
        if (isset($map['env_id'])) {
            $model->envId = $map['env_id'];
        }
        if (isset($map['submitter_id'])) {
            $model->submitterId = $map['submitter_id'];
        }
        if (isset($map['submitter_name'])) {
            $model->submitterName = $map['submitter_name'];
        }

        return $model;
    }
}
