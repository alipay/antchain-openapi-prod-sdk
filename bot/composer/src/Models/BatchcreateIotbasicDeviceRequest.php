<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateIotbasicDeviceRequest extends Model
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

    // 设备厂商
    /**
     * @var string
     */
    public $corpName;

    // 设备品类编码
    /**
     * @var string
     */
    public $deviceCategoryCode;

    // 业务场景码
    /**
     * @var string
     */
    public $bizScene;

    // 所属租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 注册设备集合
    /**
     * @var IotBasicDeviceRegisterInfo[]
     */
    public $deviceList;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'corpName'           => 'corp_name',
        'deviceCategoryCode' => 'device_category_code',
        'bizScene'           => 'biz_scene',
        'tenantId'           => 'tenant_id',
        'deviceList'         => 'device_list',
    ];

    public function validate()
    {
        Model::validateRequired('corpName', $this->corpName, true);
        Model::validateRequired('deviceCategoryCode', $this->deviceCategoryCode, true);
        Model::validateRequired('bizScene', $this->bizScene, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('deviceList', $this->deviceList, true);
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
        if (null !== $this->corpName) {
            $res['corp_name'] = $this->corpName;
        }
        if (null !== $this->deviceCategoryCode) {
            $res['device_category_code'] = $this->deviceCategoryCode;
        }
        if (null !== $this->bizScene) {
            $res['biz_scene'] = $this->bizScene;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->deviceList) {
            $res['device_list'] = [];
            if (null !== $this->deviceList && \is_array($this->deviceList)) {
                $n = 0;
                foreach ($this->deviceList as $item) {
                    $res['device_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateIotbasicDeviceRequest
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
        if (isset($map['corp_name'])) {
            $model->corpName = $map['corp_name'];
        }
        if (isset($map['device_category_code'])) {
            $model->deviceCategoryCode = $map['device_category_code'];
        }
        if (isset($map['biz_scene'])) {
            $model->bizScene = $map['biz_scene'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['device_list'])) {
            if (!empty($map['device_list'])) {
                $model->deviceList = [];
                $n                 = 0;
                foreach ($map['device_list'] as $item) {
                    $model->deviceList[$n++] = null !== $item ? IotBasicDeviceRegisterInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
