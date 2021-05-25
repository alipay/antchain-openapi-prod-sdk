<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ValueAddedServiceInfoWithSku extends Model
{
    // 增值服务信息
    /**
     * @example
     *
     * @var ValueAddedServiceInfo
     */
    public $addValueInfo;

    // sku信息
    /**
     * @example
     *
     * @var IpSkuEmphasisInfo[]
     */
    public $skus;
    protected $_name = [
        'addValueInfo' => 'add_value_info',
        'skus'         => 'skus',
    ];

    public function validate()
    {
        Model::validateRequired('addValueInfo', $this->addValueInfo, true);
        Model::validateRequired('skus', $this->skus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->addValueInfo) {
            $res['add_value_info'] = null !== $this->addValueInfo ? $this->addValueInfo->toMap() : null;
        }
        if (null !== $this->skus) {
            $res['skus'] = [];
            if (null !== $this->skus && \is_array($this->skus)) {
                $n = 0;
                foreach ($this->skus as $item) {
                    $res['skus'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ValueAddedServiceInfoWithSku
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['add_value_info'])) {
            $model->addValueInfo = ValueAddedServiceInfo::fromMap($map['add_value_info']);
        }
        if (isset($map['skus'])) {
            if (!empty($map['skus'])) {
                $model->skus = [];
                $n           = 0;
                foreach ($map['skus'] as $item) {
                    $model->skus[$n++] = null !== $item ? IpSkuEmphasisInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
