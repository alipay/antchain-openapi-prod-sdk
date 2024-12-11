<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTC\Models;

use AlibabaCloud\Tea\Model;

class BindResourceGeneralresourcefileRequest extends Model
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

    // 资源ID
    /**
     * @var string
     */
    public $resourceId;

    // 文件ID
    /**
     * @var string
     */
    public $fileId;

    // 文件状态
    /**
     * @var string
     */
    public $status;

    // 业务自定义的文本版本号
    /**
     * @var string
     */
    public $bizVersion;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appId'             => 'app_id',
        'resourceId'        => 'resource_id',
        'fileId'            => 'file_id',
        'status'            => 'status',
        'bizVersion'        => 'biz_version',
    ];

    public function validate()
    {
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('resourceId', $this->resourceId, true);
        Model::validateRequired('fileId', $this->fileId, true);
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
        if (null !== $this->resourceId) {
            $res['resource_id'] = $this->resourceId;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->bizVersion) {
            $res['biz_version'] = $this->bizVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindResourceGeneralresourcefileRequest
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
        if (isset($map['resource_id'])) {
            $model->resourceId = $map['resource_id'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['biz_version'])) {
            $model->bizVersion = $map['biz_version'];
        }

        return $model;
    }
}
