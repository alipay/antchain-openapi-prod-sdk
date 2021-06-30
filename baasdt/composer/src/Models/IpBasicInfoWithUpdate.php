<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IpBasicInfoWithUpdate extends Model
{
    // 基础信息
    /**
     * @example
     *
     * @var IpBasicInfo
     */
    public $ipBasicInfo;

    // 是否有更新
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isUpdate;
    protected $_name = [
        'ipBasicInfo' => 'ip_basic_info',
        'isUpdate'    => 'is_update',
    ];

    public function validate()
    {
        Model::validateRequired('ipBasicInfo', $this->ipBasicInfo, true);
        Model::validateRequired('isUpdate', $this->isUpdate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ipBasicInfo) {
            $res['ip_basic_info'] = null !== $this->ipBasicInfo ? $this->ipBasicInfo->toMap() : null;
        }
        if (null !== $this->isUpdate) {
            $res['is_update'] = $this->isUpdate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IpBasicInfoWithUpdate
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ip_basic_info'])) {
            $model->ipBasicInfo = IpBasicInfo::fromMap($map['ip_basic_info']);
        }
        if (isset($map['is_update'])) {
            $model->isUpdate = $map['is_update'];
        }

        return $model;
    }
}
