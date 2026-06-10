<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AIGC\Models;

use AlibabaCloud\Tea\Model;

class UploadAssetRequest extends Model
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

    // 资产类型
    /**
     * @var string
     */
    public $assetType;

    // 文件公网可访问 URL
    /**
     * @var string
     */
    public $fileUrl;

    // 测试
    /**
     * @var string
     */
    public $assetName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'assetType'         => 'asset_type',
        'fileUrl'           => 'file_url',
        'assetName'         => 'asset_name',
    ];

    public function validate()
    {
        Model::validateRequired('assetType', $this->assetType, true);
        Model::validateRequired('fileUrl', $this->fileUrl, true);
        Model::validateRequired('assetName', $this->assetName, true);
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
        if (null !== $this->assetType) {
            $res['asset_type'] = $this->assetType;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        if (null !== $this->assetName) {
            $res['asset_name'] = $this->assetName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadAssetRequest
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
        if (isset($map['asset_type'])) {
            $model->assetType = $map['asset_type'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }
        if (isset($map['asset_name'])) {
            $model->assetName = $map['asset_name'];
        }

        return $model;
    }
}
