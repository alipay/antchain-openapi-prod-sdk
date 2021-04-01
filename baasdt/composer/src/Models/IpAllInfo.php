<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IpAllInfo extends Model
{
    // ip的基础信息
    /**
     * @example
     *
     * @var IpBasicInfo
     */
    public $ipBasicInfo;

    // ip的渠道信息带上sku信息
    /**
     * @example
     *
     * @var IpChannelWithSku[]
     */
    public $ipChannalInfo;

    // 是否有更新数据
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isUpdate;
    protected $_name = [
        'ipBasicInfo'   => 'ip_basic_info',
        'ipChannalInfo' => 'ip_channal_info',
        'isUpdate'      => 'is_update',
    ];

    public function validate()
    {
        Model::validateRequired('ipBasicInfo', $this->ipBasicInfo, true);
        Model::validateRequired('ipChannalInfo', $this->ipChannalInfo, true);
        Model::validateRequired('isUpdate', $this->isUpdate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ipBasicInfo) {
            $res['ip_basic_info'] = null !== $this->ipBasicInfo ? $this->ipBasicInfo->toMap() : null;
        }
        if (null !== $this->ipChannalInfo) {
            $res['ip_channal_info'] = [];
            if (null !== $this->ipChannalInfo && \is_array($this->ipChannalInfo)) {
                $n = 0;
                foreach ($this->ipChannalInfo as $item) {
                    $res['ip_channal_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->isUpdate) {
            $res['is_update'] = $this->isUpdate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IpAllInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ip_basic_info'])) {
            $model->ipBasicInfo = IpBasicInfo::fromMap($map['ip_basic_info']);
        }
        if (isset($map['ip_channal_info'])) {
            if (!empty($map['ip_channal_info'])) {
                $model->ipChannalInfo = [];
                $n                    = 0;
                foreach ($map['ip_channal_info'] as $item) {
                    $model->ipChannalInfo[$n++] = null !== $item ? IpChannelWithSku::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['is_update'])) {
            $model->isUpdate = $map['is_update'];
        }

        return $model;
    }
}
