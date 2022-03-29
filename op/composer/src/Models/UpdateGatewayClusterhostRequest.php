<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class UpdateGatewayClusterhostRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 产品码
    /**
     * @var string
     */
    public $product;

    // 集群名称，对应productInstanceId
    /**
     * @var string
     */
    public $cluster;

    // api所属套件版本
    /**
     * @var string
     */
    public $suitVersion;

    // api分组名称
    /**
     * @var string
     */
    public $groupName;

    // 后端地址
    /**
     * @var string
     */
    public $host;
    protected $_name = [
        'authToken'   => 'auth_token',
        'product'     => 'product',
        'cluster'     => 'cluster',
        'suitVersion' => 'suit_version',
        'groupName'   => 'group_name',
        'host'        => 'host',
    ];

    public function validate()
    {
        Model::validateRequired('product', $this->product, true);
        Model::validateRequired('cluster', $this->cluster, true);
        Model::validateRequired('suitVersion', $this->suitVersion, true);
        Model::validateRequired('groupName', $this->groupName, true);
        Model::validateRequired('host', $this->host, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->product) {
            $res['product'] = $this->product;
        }
        if (null !== $this->cluster) {
            $res['cluster'] = $this->cluster;
        }
        if (null !== $this->suitVersion) {
            $res['suit_version'] = $this->suitVersion;
        }
        if (null !== $this->groupName) {
            $res['group_name'] = $this->groupName;
        }
        if (null !== $this->host) {
            $res['host'] = $this->host;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateGatewayClusterhostRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product'])) {
            $model->product = $map['product'];
        }
        if (isset($map['cluster'])) {
            $model->cluster = $map['cluster'];
        }
        if (isset($map['suit_version'])) {
            $model->suitVersion = $map['suit_version'];
        }
        if (isset($map['group_name'])) {
            $model->groupName = $map['group_name'];
        }
        if (isset($map['host'])) {
            $model->host = $map['host'];
        }

        return $model;
    }
}
