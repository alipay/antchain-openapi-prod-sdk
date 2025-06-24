<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class PushDubbridgeInstallmentSupplementRequest extends Model
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

    // 订单号：request请求单号，每次请求唯一，如uuid
    /**
     * @var string
     */
    public $orderNo;

    // 业务类型：1-现金贷；2-分期付
    //
    /**
     * @var string
     */
    public $prodType;

    // 资产方用户唯一标识
    /**
     * @var string
     */
    public $openId;

    // 资产方购物订单号，如二轮车/摩托车订单号
    /**
     * @var string
     */
    public $bizOrderNo;

    // 材料场景：2-支用前、3-支用后
    /**
     * @var string
     */
    public $fileScene;

    // 材料列表
    /**
     * @var SupplementFile[]
     */
    public $fileList;

    // 门店信息
    /**
     * @var StoreInfo
     */
    public $storeInfo;

    // 订单车辆信息
    /**
     * @var VehicleInfo
     */
    public $vehicleInfo;

    // 补充信息
    /**
     * @var Additional
     */
    public $additional;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderNo'           => 'order_no',
        'prodType'          => 'prod_type',
        'openId'            => 'open_id',
        'bizOrderNo'        => 'biz_order_no',
        'fileScene'         => 'file_scene',
        'fileList'          => 'file_list',
        'storeInfo'         => 'store_info',
        'vehicleInfo'       => 'vehicle_info',
        'additional'        => 'additional',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('prodType', $this->prodType, true);
        Model::validateRequired('openId', $this->openId, true);
        Model::validateRequired('bizOrderNo', $this->bizOrderNo, true);
        Model::validateRequired('fileScene', $this->fileScene, true);
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
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->prodType) {
            $res['prod_type'] = $this->prodType;
        }
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }
        if (null !== $this->bizOrderNo) {
            $res['biz_order_no'] = $this->bizOrderNo;
        }
        if (null !== $this->fileScene) {
            $res['file_scene'] = $this->fileScene;
        }
        if (null !== $this->fileList) {
            $res['file_list'] = [];
            if (null !== $this->fileList && \is_array($this->fileList)) {
                $n = 0;
                foreach ($this->fileList as $item) {
                    $res['file_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->storeInfo) {
            $res['store_info'] = null !== $this->storeInfo ? $this->storeInfo->toMap() : null;
        }
        if (null !== $this->vehicleInfo) {
            $res['vehicle_info'] = null !== $this->vehicleInfo ? $this->vehicleInfo->toMap() : null;
        }
        if (null !== $this->additional) {
            $res['additional'] = null !== $this->additional ? $this->additional->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushDubbridgeInstallmentSupplementRequest
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
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['prod_type'])) {
            $model->prodType = $map['prod_type'];
        }
        if (isset($map['open_id'])) {
            $model->openId = $map['open_id'];
        }
        if (isset($map['biz_order_no'])) {
            $model->bizOrderNo = $map['biz_order_no'];
        }
        if (isset($map['file_scene'])) {
            $model->fileScene = $map['file_scene'];
        }
        if (isset($map['file_list'])) {
            if (!empty($map['file_list'])) {
                $model->fileList = [];
                $n               = 0;
                foreach ($map['file_list'] as $item) {
                    $model->fileList[$n++] = null !== $item ? SupplementFile::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['store_info'])) {
            $model->storeInfo = StoreInfo::fromMap($map['store_info']);
        }
        if (isset($map['vehicle_info'])) {
            $model->vehicleInfo = VehicleInfo::fromMap($map['vehicle_info']);
        }
        if (isset($map['additional'])) {
            $model->additional = Additional::fromMap($map['additional']);
        }

        return $model;
    }
}
