<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTC\Models;

use AlibabaCloud\Tea\Model;

class PublishResourceGeneralresourcefileRequest extends Model
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

    // 小程序的APP ID
    /**
     * @var string
     */
    public $appId;

    // 业务幂等ID
    /**
     * @var string
     */
    public $bizId;

    // 资源ID
    /**
     * @var string
     */
    public $resourceId;

    // 版本号
    /**
     * @var int
     */
    public $fileVersion;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appId'             => 'app_id',
        'bizId'             => 'biz_id',
        'resourceId'        => 'resource_id',
        'fileVersion'       => 'file_version',
    ];

    public function validate()
    {
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('resourceId', $this->resourceId, true);
        Model::validateRequired('fileVersion', $this->fileVersion, true);
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
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }
        if (null !== $this->fileVersion) {
            $res['file_version'] = $this->fileVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PublishResourceGeneralresourcefileRequest
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
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }
        if (isset($map['file_version'])) {
            $model->fileVersion = $map['file_version'];
        }

        return $model;
    }
}
