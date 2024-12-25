<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTC\Models;

use AlibabaCloud\Tea\Model;

class QueryAsoDistinctRequest extends Model
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

    // App ID
    /**
     * @var string
     */
    public $appid;

    // 苹果设备的 IDFA
    /**
     * @var string
     */
    public $idfa;

    // 渠道标识(默认 qimai )
    /**
     * @var string
     */
    public $source;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appid'             => 'appid',
        'idfa'              => 'idfa',
        'source'            => 'source',
    ];

    public function validate()
    {
        Model::validateRequired('appid', $this->appid, true);
        Model::validateRequired('idfa', $this->idfa, true);
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
        if (null !== $this->appid) {
            $res['appid'] = $this->appid;
        }
        if (null !== $this->idfa) {
            $res['idfa'] = $this->idfa;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAsoDistinctRequest
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
        if (isset($map['appid'])) {
            $model->appid = $map['appid'];
        }
        if (isset($map['idfa'])) {
            $model->idfa = $map['idfa'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }

        return $model;
    }
}
