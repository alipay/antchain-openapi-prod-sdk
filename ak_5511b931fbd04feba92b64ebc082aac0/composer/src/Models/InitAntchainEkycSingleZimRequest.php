<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_5511b931fbd04feba92b64ebc082aac0\Models;

use AlibabaCloud\Tea\Model;

class InitAntchainEkycSingleZimRequest extends Model
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

    // 环境参数
    /**
     * @var string
     */
    public $metaInfo;

    // 实人认证id
    /**
     * @var string
     */
    public $zimId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'metaInfo'          => 'meta_info',
        'zimId'             => 'zim_id',
    ];

    public function validate()
    {
        Model::validateRequired('metaInfo', $this->metaInfo, true);
        Model::validateRequired('zimId', $this->zimId, true);
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
        if (null !== $this->metaInfo) {
            $res['meta_info'] = $this->metaInfo;
        }
        if (null !== $this->zimId) {
            $res['zim_id'] = $this->zimId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitAntchainEkycSingleZimRequest
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
        if (isset($map['meta_info'])) {
            $model->metaInfo = $map['meta_info'];
        }
        if (isset($map['zim_id'])) {
            $model->zimId = $map['zim_id'];
        }

        return $model;
    }
}
