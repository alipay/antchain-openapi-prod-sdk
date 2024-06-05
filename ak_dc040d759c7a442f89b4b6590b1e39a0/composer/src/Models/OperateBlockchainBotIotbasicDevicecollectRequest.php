<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models;

use AlibabaCloud\Tea\Model;

class OperateBlockchainBotIotbasicDevicecollectRequest extends Model
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

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 资产ID
    /**
     * @var string
     */
    public $assetId;

    // 数据资产类型
    /**
     * @var string
     */
    public $dataScene;

    // 所属业务
    /**
     * @var string
     */
    public $bizScene;

    // 资产数据内容，业务要上链的数据JSON格式
    /**
     * @var string
     */
    public $assetData;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'assetId'           => 'asset_id',
        'dataScene'         => 'data_scene',
        'bizScene'          => 'biz_scene',
        'assetData'         => 'asset_data',
    ];

    public function validate()
    {
        Model::validateRequired('dataScene', $this->dataScene, true);
        Model::validateRequired('bizScene', $this->bizScene, true);
        Model::validateRequired('assetData', $this->assetData, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->assetId) {
            $res['asset_id'] = $this->assetId;
        }
        if (null !== $this->dataScene) {
            $res['data_scene'] = $this->dataScene;
        }
        if (null !== $this->bizScene) {
            $res['biz_scene'] = $this->bizScene;
        }
        if (null !== $this->assetData) {
            $res['asset_data'] = $this->assetData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateBlockchainBotIotbasicDevicecollectRequest
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['asset_id'])) {
            $model->assetId = $map['asset_id'];
        }
        if (isset($map['data_scene'])) {
            $model->dataScene = $map['data_scene'];
        }
        if (isset($map['biz_scene'])) {
            $model->bizScene = $map['biz_scene'];
        }
        if (isset($map['asset_data'])) {
            $model->assetData = $map['asset_data'];
        }

        return $model;
    }
}
