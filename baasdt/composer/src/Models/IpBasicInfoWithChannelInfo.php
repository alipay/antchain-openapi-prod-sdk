<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IpBasicInfoWithChannelInfo extends Model
{
    // ip的基础信息
    /**
     * @example
     *
     * @var IpBasicInfo
     */
    public $ipBasicInfo;

    // ip的渠道信息和sku信息
    /**
     * @example
     *
     * @var IpChannelWithSku[]
     */
    public $ipChannalInfos;
    protected $_name = [
        'ipBasicInfo'    => 'ip_basic_info',
        'ipChannalInfos' => 'ip_channal_infos',
    ];

    public function validate()
    {
        Model::validateRequired('ipBasicInfo', $this->ipBasicInfo, true);
        Model::validateRequired('ipChannalInfos', $this->ipChannalInfos, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ipBasicInfo) {
            $res['ip_basic_info'] = null !== $this->ipBasicInfo ? $this->ipBasicInfo->toMap() : null;
        }
        if (null !== $this->ipChannalInfos) {
            $res['ip_channal_infos'] = [];
            if (null !== $this->ipChannalInfos && \is_array($this->ipChannalInfos)) {
                $n = 0;
                foreach ($this->ipChannalInfos as $item) {
                    $res['ip_channal_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IpBasicInfoWithChannelInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ip_basic_info'])) {
            $model->ipBasicInfo = IpBasicInfo::fromMap($map['ip_basic_info']);
        }
        if (isset($map['ip_channal_infos'])) {
            if (!empty($map['ip_channal_infos'])) {
                $model->ipChannalInfos = [];
                $n                     = 0;
                foreach ($map['ip_channal_infos'] as $item) {
                    $model->ipChannalInfos[$n++] = null !== $item ? IpChannelWithSku::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
