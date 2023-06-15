<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTX\Models;

use AlibabaCloud\Tea\Model;

class QueryResourceImageRequest extends Model
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

    // access_token
    /**
     * @var string
     */
    public $accessToken;

    // 素材的类型（AIGC/NFT）
    /**
     * @var string
     */
    public $type;

    // 资源ID
    /**
     * @var string
     */
    public $resourceId;

    // type为NFT必填
    /**
     * @var string
     */
    public $nftId;

    // 是否需要高清图
    /**
     * @var bool
     */
    public $needHdImg;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'accessToken'       => 'access_token',
        'type'              => 'type',
        'resourceId'        => 'resource_id',
        'nftId'             => 'nft_id',
        'needHdImg'         => 'need_hd_img',
    ];

    public function validate()
    {
        Model::validateRequired('accessToken', $this->accessToken, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('resourceId', $this->resourceId, true);
        Model::validateRequired('needHdImg', $this->needHdImg, true);
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
        if (null !== $this->accessToken) {
            $res['access_token'] = $this->accessToken;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }
        if (null !== $this->nftId) {
            $res['nft_id'] = $this->nftId;
        }
        if (null !== $this->needHdImg) {
            $res['need_hd_img'] = $this->needHdImg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryResourceImageRequest
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
        if (isset($map['access_token'])) {
            $model->accessToken = $map['access_token'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }
        if (isset($map['nft_id'])) {
            $model->nftId = $map['nft_id'];
        }
        if (isset($map['need_hd_img'])) {
            $model->needHdImg = $map['need_hd_img'];
        }

        return $model;
    }
}
