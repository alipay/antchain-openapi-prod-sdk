<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ContractListResp extends Model
{
    // 服务ID
    /**
     * @example cme20230724104931af3a4d
     *
     * @var string
     */
    public $serviceId;

    // 合约名称
    /**
     * @example 资产合约
     *
     * @var string
     */
    public $name;

    // 合约类型
    /**
     * @example 存证合约
     *
     * @var string
     */
    public $type;

    // 创建时间
    /**
     * @example 1690166971465
     *
     * @var int
     */
    public $createTime;
    protected $_name = [
        'serviceId'  => 'service_id',
        'name'       => 'name',
        'type'       => 'type',
        'createTime' => 'create_time',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractListResp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }

        return $model;
    }
}
