<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

class UploadMaasAssetRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'requestId' => 'request_id',
        'fileUrl' => 'file_url',
        'assetType' => 'asset_type',
        'assetName' => 'asset_name',
    ];
    public function validate() {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('fileUrl', $this->fileUrl, true);
        Model::validateRequired('assetType', $this->assetType, true);
        Model::validateRequired('assetName', $this->assetName, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        if (null !== $this->assetType) {
            $res['asset_type'] = $this->assetType;
        }
        if (null !== $this->assetName) {
            $res['asset_name'] = $this->assetName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UploadMaasAssetRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['request_id'])){
            $model->requestId = $map['request_id'];
        }
        if(isset($map['file_url'])){
            $model->fileUrl = $map['file_url'];
        }
        if(isset($map['asset_type'])){
            $model->assetType = $map['asset_type'];
        }
        if(isset($map['asset_name'])){
            $model->assetName = $map['asset_name'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 幂等标识，由客户端生成
    /**
     * @var string
     */
    public $requestId;

    // 文件公网可访问 URL
    /**
     * @var string
     */
    public $fileUrl;

    // 资产类型
    /**
     * @var string
     */
    public $assetType;

    // 资产名称
    /**
     * @var string
     */
    public $assetName;

}
