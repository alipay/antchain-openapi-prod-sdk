<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class UpdateChaininsightContracttimelineconfigRequest extends Model
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

    // 链ID
    /**
     * @var string
     */
    public $bizId;

    // 链上地址：合约 / 存证账户
    /**
     * @var string
     */
    public $hexAddress;

    // 需要更新的区块高度（会更新生效区间包含该高度的时间轴配置）
    /**
     * @var string
     */
    public $ver;

    // 时间轴配置
    /**
     * @var AddressTimelineConfig
     */
    public $timelineConfig;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'hexAddress'        => 'hex_address',
        'ver'               => 'ver',
        'timelineConfig'    => 'timeline_config',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('hexAddress', $this->hexAddress, true);
        Model::validateRequired('ver', $this->ver, true);
        Model::validateRequired('timelineConfig', $this->timelineConfig, true);
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->hexAddress) {
            $res['hex_address'] = $this->hexAddress;
        }
        if (null !== $this->ver) {
            $res['ver'] = $this->ver;
        }
        if (null !== $this->timelineConfig) {
            $res['timeline_config'] = null !== $this->timelineConfig ? $this->timelineConfig->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateChaininsightContracttimelineconfigRequest
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['hex_address'])) {
            $model->hexAddress = $map['hex_address'];
        }
        if (isset($map['ver'])) {
            $model->ver = $map['ver'];
        }
        if (isset($map['timeline_config'])) {
            $model->timelineConfig = AddressTimelineConfig::fromMap($map['timeline_config']);
        }

        return $model;
    }
}
