<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class ComboCommodityOrder extends Model
{
    // 商品编码
    /**
     * @example KXSFFM00264687
     *
     * @var string
     */
    public $commodityCode;

    // 状态
    /**
     * @example COMPLETE
     *
     * @var string
     */
    public $status;

    // 实例ID列表
    /**
     * @example A0BLOCKCHAINAXAXVZSE1ZXEMO6HM2S
     *
     * @var string[]
     */
    public $instanceIds;
    protected $_name = [
        'commodityCode' => 'commodity_code',
        'status'        => 'status',
        'instanceIds'   => 'instance_ids',
    ];

    public function validate()
    {
        Model::validateRequired('commodityCode', $this->commodityCode, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('instanceIds', $this->instanceIds, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->commodityCode) {
            $res['commodity_code'] = $this->commodityCode;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->instanceIds) {
            $res['instance_ids'] = $this->instanceIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ComboCommodityOrder
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['commodity_code'])) {
            $model->commodityCode = $map['commodity_code'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['instance_ids'])) {
            if (!empty($map['instance_ids'])) {
                $model->instanceIds = $map['instance_ids'];
            }
        }

        return $model;
    }
}
