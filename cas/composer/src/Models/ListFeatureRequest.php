<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ListFeatureRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // region_id
    /**
     * @var string
     */
    public $regionId;

    // feature_name
    /**
     * @var string
     */
    public $featureName;
    protected $_name = [
        'authToken'   => 'auth_token',
        'regionId'    => 'region_id',
        'featureName' => 'feature_name',
    ];

    public function validate()
    {
        Model::validateRequired('regionId', $this->regionId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->regionId) {
            $res['region_id'] = $this->regionId;
        }
        if (null !== $this->featureName) {
            $res['feature_name'] = $this->featureName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListFeatureRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['region_id'])) {
            $model->regionId = $map['region_id'];
        }
        if (isset($map['feature_name'])) {
            $model->featureName = $map['feature_name'];
        }

        return $model;
    }
}
