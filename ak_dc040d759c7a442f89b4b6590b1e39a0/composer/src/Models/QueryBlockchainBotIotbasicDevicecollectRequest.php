<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models;

use AlibabaCloud\Tea\Model;

class QueryBlockchainBotIotbasicDevicecollectRequest extends Model
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

    // 查询结束时间
    /**
     * @var string
     */
    public $endTime;

    // 资产类型
    /**
     * @var string
     */
    public $dataScene;

    // 所属业务
    /**
     * @var string
     */
    public $bizScene;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 上链hash
    /**
     * @var string
     */
    public $antchainId;

    // 上链数据内容 json
    /**
     * @var string
     */
    public $assetData;

    // 每页数量
    /**
     * @var int
     */
    public $pageSize;

    // 当前页码
    /**
     * @var int
     */
    public $currentPage;

    // 业务id
    /**
     * @var string
     */
    public $businessId;

    // 查询开始时间
    /**
     * @var string
     */
    public $startTime;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'endTime'           => 'end_time',
        'dataScene'         => 'data_scene',
        'bizScene'          => 'biz_scene',
        'tenantId'          => 'tenant_id',
        'antchainId'        => 'antchain_id',
        'assetData'         => 'asset_data',
        'pageSize'          => 'page_size',
        'currentPage'       => 'current_page',
        'businessId'        => 'business_id',
        'startTime'         => 'start_time',
    ];

    public function validate()
    {
        Model::validateRequired('dataScene', $this->dataScene, true);
        Model::validateRequired('bizScene', $this->bizScene, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('currentPage', $this->currentPage, true);
        Model::validateMaximum('pageSize', $this->pageSize, 100);
        Model::validateMinimum('pageSize', $this->pageSize, 1);
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
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->dataScene) {
            $res['data_scene'] = $this->dataScene;
        }
        if (null !== $this->bizScene) {
            $res['biz_scene'] = $this->bizScene;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->antchainId) {
            $res['antchain_id'] = $this->antchainId;
        }
        if (null !== $this->assetData) {
            $res['asset_data'] = $this->assetData;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->businessId) {
            $res['business_id'] = $this->businessId;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBlockchainBotIotbasicDevicecollectRequest
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
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['data_scene'])) {
            $model->dataScene = $map['data_scene'];
        }
        if (isset($map['biz_scene'])) {
            $model->bizScene = $map['biz_scene'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['antchain_id'])) {
            $model->antchainId = $map['antchain_id'];
        }
        if (isset($map['asset_data'])) {
            $model->assetData = $map['asset_data'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['business_id'])) {
            $model->businessId = $map['business_id'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }

        return $model;
    }
}
