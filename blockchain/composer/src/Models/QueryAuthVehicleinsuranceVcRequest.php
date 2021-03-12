<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryAuthVehicleinsuranceVcRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 车牌号
    /**
     * @var string
     */
    public $vehicleNo;

    // 车型代码. 可选, 02 普通小客车(默认); 52 新能源小客车
    /**
     * @var string
     */
    public $vehicleType;

    // 车辆识别码
    /**
     * @var string
     */
    public $vin;

    // 车主认证信息
    /**
     * @var UserMetaInfo
     */
    public $ownerMetaInfo;

    // 业务类型
    /**
     * @var string
     */
    public $bizType;

    // 业务id
    /**
     * @var string
     */
    public $bizId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'vehicleNo'         => 'vehicle_no',
        'vehicleType'       => 'vehicle_type',
        'vin'               => 'vin',
        'ownerMetaInfo'     => 'owner_meta_info',
        'bizType'           => 'biz_type',
        'bizId'             => 'biz_id',
    ];

    public function validate()
    {
        Model::validateRequired('vehicleNo', $this->vehicleNo, true);
        Model::validateRequired('vin', $this->vin, true);
        Model::validateRequired('ownerMetaInfo', $this->ownerMetaInfo, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('bizId', $this->bizId, true);
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
        if (null !== $this->vehicleNo) {
            $res['vehicle_no'] = $this->vehicleNo;
        }
        if (null !== $this->vehicleType) {
            $res['vehicle_type'] = $this->vehicleType;
        }
        if (null !== $this->vin) {
            $res['vin'] = $this->vin;
        }
        if (null !== $this->ownerMetaInfo) {
            $res['owner_meta_info'] = null !== $this->ownerMetaInfo ? $this->ownerMetaInfo->toMap() : null;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAuthVehicleinsuranceVcRequest
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
        if (isset($map['vehicle_no'])) {
            $model->vehicleNo = $map['vehicle_no'];
        }
        if (isset($map['vehicle_type'])) {
            $model->vehicleType = $map['vehicle_type'];
        }
        if (isset($map['vin'])) {
            $model->vin = $map['vin'];
        }
        if (isset($map['owner_meta_info'])) {
            $model->ownerMetaInfo = UserMetaInfo::fromMap($map['owner_meta_info']);
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }

        return $model;
    }
}
