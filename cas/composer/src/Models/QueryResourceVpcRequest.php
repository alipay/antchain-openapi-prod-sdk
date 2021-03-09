<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryResourceVpcRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 是否使用缓存进行查询，默认false，使用缓存查询
    /**
     * @var bool
     */
    public $disableCache;

    // 地域identity
    /**
     * @var string
     */
    public $region;

    // VPC的id
    /**
     * @var string
     */
    public $vpcId;
    protected $_name = [
        'authToken'    => 'auth_token',
        'disableCache' => 'disable_cache',
        'region'       => 'region',
        'vpcId'        => 'vpc_id',
    ];

    public function validate()
    {
        Model::validateRequired('region', $this->region, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->disableCache) {
            $res['disable_cache'] = $this->disableCache;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->vpcId) {
            $res['vpc_id'] = $this->vpcId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryResourceVpcRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['disable_cache'])) {
            $model->disableCache = $map['disable_cache'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }
        if (isset($map['vpc_id'])) {
            $model->vpcId = $map['vpc_id'];
        }

        return $model;
    }
}
