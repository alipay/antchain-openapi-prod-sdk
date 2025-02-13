<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class SimStoreInfo extends Model
{
    // 门店对外业务id
    /**
     * @example
     *
     * @var string
     */
    public $storeId;

    // 门店名称
    /**
     * @example
     *
     * @var string
     */
    public $storeName;
    protected $_name = [
        'storeId'   => 'store_id',
        'storeName' => 'store_name',
    ];

    public function validate()
    {
        Model::validateRequired('storeId', $this->storeId, true);
        Model::validateRequired('storeName', $this->storeName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->storeId) {
            $res['store_id'] = $this->storeId;
        }
        if (null !== $this->storeName) {
            $res['store_name'] = $this->storeName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SimStoreInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['store_id'])) {
            $model->storeId = $map['store_id'];
        }
        if (isset($map['store_name'])) {
            $model->storeName = $map['store_name'];
        }

        return $model;
    }
}
