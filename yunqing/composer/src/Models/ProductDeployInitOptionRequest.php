<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class ProductDeployInitOptionRequest extends Model
{
    // 站点code
    /**
     * @example ant
     *
     * @var string
     */
    public $siteCode;

    // 需要部署的产品实例元数据
    /**
     * @example
     *
     * @var ProductInstanceMeta[]
     */
    public $productInstances;
    protected $_name = [
        'siteCode'         => 'site_code',
        'productInstances' => 'product_instances',
    ];

    public function validate()
    {
        Model::validateRequired('siteCode', $this->siteCode, true);
        Model::validateRequired('productInstances', $this->productInstances, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->siteCode) {
            $res['site_code'] = $this->siteCode;
        }
        if (null !== $this->productInstances) {
            $res['product_instances'] = [];
            if (null !== $this->productInstances && \is_array($this->productInstances)) {
                $n = 0;
                foreach ($this->productInstances as $item) {
                    $res['product_instances'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProductDeployInitOptionRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['site_code'])) {
            $model->siteCode = $map['site_code'];
        }
        if (isset($map['product_instances'])) {
            if (!empty($map['product_instances'])) {
                $model->productInstances = [];
                $n                       = 0;
                foreach ($map['product_instances'] as $item) {
                    $model->productInstances[$n++] = null !== $item ? ProductInstanceMeta::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
